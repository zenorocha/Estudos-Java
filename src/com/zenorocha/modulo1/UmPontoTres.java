/*
 * Modulo 1
 * Projeto e Construcao de Sistemas
 * Professor: Alexandre Correa
 * 
 * Implementado por Zeno Rocha
 * Em 14/03/2011
 * 
 * --------------------------------------------------------------------------------------------
 * 
 * Programa 1.3
 * 
 * Faça um programa que dado um valor de raio definido em uma variável (valor igual a 60), calcule e mostre o resultado no console das seguintes informações:
 * 		
 * 		a) o diâmetro
 * 		b) a circunferência: 2 * pi * r
 * 		c) a área: pi * r2
 * 		d) maior valor entre a circunferência e o número de dias de um ano.
 * 
 */

package com.zenorocha.modulo1;

public class UmPontoTres {
	private int raio;
	private float pi = 3.14f;
	private int diasNoAno;
	
	public UmPontoTres() {
		
	}

	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}
	
	public int getDiasNoAno() {
		return diasNoAno;
	}

	public void setDiasNoAno(int diasNoAno) {
		this.diasNoAno = diasNoAno;
	}

	public int Diametro (int raio){
		return (2 * raio);
	}
	
	public float Circunferencia (int raio) {
		return (2 * pi * raio);
	}
	
	public double Area (int raio) {
		return (pi * Math.pow(raio, 2));
	}
	
	public void comparaAno (int raio, int diasNoAno) {
		if (Circunferencia(raio) > diasNoAno)
			System.out.println("A circunferencia é maior que o número de dias no ar.");
		else
			System.out.println("O número de dias do ano é maior que o valor da circunferencia.");
	}
	
	public void Print() {
		System.out.println("Diametro = " + Diametro(raio));
		System.out.println("Circunferencia = " + Circunferencia(raio));
		System.out.println("Area = " + Area(raio));
		
		comparaAno(raio, diasNoAno);
	}
	
	public static void main(String[] args) {
		UmPontoTres objUmPontoTres = new UmPontoTres();
		
		objUmPontoTres.setRaio(60);
		objUmPontoTres.setDiasNoAno(365);
		objUmPontoTres.Print();
	}
}
