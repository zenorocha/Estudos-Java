/*
 * Módulo 3
 * Projeto e Construção de Sistemas
 * Professor: Alexandre Correa
 * 
 * Implementado por Zeno Rocha
 * Em 21/03/2011
 * 
 * --------------------------------------------------------------------------------------------
 * 
 * Programa Comprimento_02:
 * 
 * 	Crie uma nova versão para o programa Comprimento_01, modificando a representação
 * 	interna para apenas um atributo correspondente ao valor total em milímetros. Nesta nova
 * 	versão, você deverá usar a mesma classe TesteComprimento do programa Comprimento_01.
 * 
 */

package com.zenorocha.modulo3;

public class Comprimento_02 {

	private int mm;
	
	public Comprimento_02() {
		
	}
	
	public Comprimento_02(int m, int cm, int mm) {
		m = m * 1000;
		cm = cm * 10;
		this.mm = mm + cm + m;
	}

	public Comprimento_02(int mm) {
		this.mm = mm;
	}
	
	public Comprimento_02(int cm, int mm) {
		cm = cm * 10;
		this.mm = mm + cm;
	}
	
	public void Print() {
		System.out.println(this.mm + " mil�metros");
	}
	
	public Comprimento_02 Somar(Comprimento_02 x, Comprimento_02 y) {
		
		Comprimento_02 z = new Comprimento_02();
		z.mm = x.mm + y.mm;
		
		return z;
	}
	
	public Comprimento_02 Subtrair(Comprimento_02 x, Comprimento_02 y) {
		
		Comprimento_02 z = new Comprimento_02();
		z.mm = x.mm - y.mm;
		
		return z;
	}
	
	public void Multiplicar(int valor) {
		this.mm = this.mm * valor;
	}
	
	public void Dividir(int valor) {
		this.mm = this.mm / valor;
	}
	
	public int getMm() {
		return mm;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}
}
