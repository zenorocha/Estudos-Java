/*
 * Módulo 1
 * Projeto e Construção de Sistemas
 * Professor: Alexandre Correa
 * 
 * Implementado por Zeno Rocha
 * Em 14/03/2011
 * 
 * --------------------------------------------------------------------------------------------
 * 
 * Programa 1.2
 * 
 *	Sejam duas variáveis inteiras (a e b), pede-se armazenar a soma, subtração, divisão e a
 *	média dos dois números. Considere os seguintes casos (valores iniciais para as variáveis a, b):
 *		
 *		a) 9 e 7
 *		b) 10 e 5
 * 
 */

package com.zenorocha.modulo1;

public class UmPontoDois {
	private int a;
	private int b;
	
	public UmPontoDois() {
		
	}
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	public int Soma(int a, int b) {
		return a + b;
	}
	
	public int Subtracao(int a, int b) {
		return a - b;
	}
	
	public float Divisao(int a, int b) {
		return a / b;
	}
	
	public float Media(int a, int b) {
		return (a + b) / 2;
	}
	
	public void Print() {
		System.out.println("Soma = " + Soma(a, b));
		System.out.println("Subtracao = " + Subtracao(a, b));
		System.out.println("Divisao = " + Divisao(a, b));
		System.out.println("Media = " + Media(a, b));
	}

	public static void main(String[] args) {
		UmPontoDois objUmPontoDois = new UmPontoDois();
		
		// exercicio - a)
		objUmPontoDois.setA(9);
		objUmPontoDois.setB(7);
		
		// exercicio - b)
		objUmPontoDois.setA(10);
		objUmPontoDois.setB(5);
		
		objUmPontoDois.Print();
	}
	
}
