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

	private int mm; // milímetros
	
	// default
	public Comprimento_02() {
		
	}
	
	// a)
	public Comprimento_02(int m, int cm, int mm) {
		this.mm = mm;
		m = this.mm * 1000;
		cm = this.mm * 10;
	}

	// b)
	public Comprimento_02(int mm) {
		this.mm = mm;
	}
	
	// c)
	public Comprimento_02(int cm, int mm) {
		
		this.mm = mm;
		cm = cm * 10;
	}
	
	// d)
	public void Print() {
		System.out.println(this.m + " metros, " + this.cm + " centímetros e " + this.mm + " milímetros");
	}
	
	// g)
	public Comprimento_02 Somar(Comprimento_02 x, Comprimento_02 y) {
		
		Comprimento_02 z = new Comprimento_02();
		
		z.cm = x.cm + y.cm;
		z.m = x.m + y.m;
		z.mm = x.mm + y.mm;
		
		return z;
	}
	
	// h)
	public Comprimento_02 Subtrair(Comprimento_02 x, Comprimento_02 y) {
		
		Comprimento_02 z = new Comprimento_02();
		
		z.cm = x.cm - y.cm;
		z.m = x.m - y.m;
		z.mm = x.mm - y.mm;
		
		return z;
	}
	
	// i)
	public void Multiplicar(int valor) {
		
		this.cm = this.cm * valor;
		this.m = this.m * valor;
		this.mm = this.mm * valor;
	}
	
	// j)
	public void Dividir(int valor) {
		
		this.cm = this.cm / valor;
		this.m = this.m / valor;
		this.mm = this.mm / valor;
	}

	// getters and setters
	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getCm() {
		return cm;
	}

	public void setCm(int cm) {
		this.cm = cm;
	}
	
	// e)
	public int getMm() {
		return mm;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}
	
	// f)
	public float getFloatM() {
		return (float)m;
	}
}
