/*
 * Lista 1
 * Projeto e Construcao de Sistemas
 * Professor: Alexandre Correa
 * 
 * Implementado por Zeno Rocha
 * Em 25/04/2011
 * 
 */

package com.zenorocha.lista1;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 3;
		
		System.out.println("Soma: " + (a + b));
		System.out.println("Multiplicação: " + (a * b));
		System.out.println("Subtração: " + (a - b));
		System.out.println("Resto da divisão: " + (a % b));
		System.out.println("Divisão (com resultado inteiro): " + (a / b));
		System.out.println("Divisão (com resultado não inteiro): " + (((float) a) / ((float) b)));
		System.out.println("Divisão inteira (com resultado arredondado): " + Math.ceil(a / b));
	}
	
}
