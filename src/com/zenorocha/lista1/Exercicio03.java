/*
 * Lista 1
 * Projeto e Construção de Sistemas
 * Professor: Alexandre Correa
 * 
 * Implementado por Zeno Rocha
 * Em 25/04/2011
 * 
 * --------------------------------------------------------------------------------------------
 * 
 * Exercício 3
 * 
 * 	Desenvolva um programa em Java que defina duas varíaveis com números inteiros (a, b),
 * 	inicializadas no próprio programa e imprima os seguintes valores:
 * 
 * 		a) Soma de a e b.
 * 		b) Multiplicação de a por b.
 * 		c) Subtração de a por b.
 * 		d) O resto da divisão de a por b.
 * 		e) O resultado da divisão inteira de a por b (resultado é um inteiro).
 * 		f) O resultado da divisão de a por b (resultado pode não ser inteiro, ex: 10/3).
 * 		g) O resultado da divisão de a por b arredondado para um número inteiro. (ex: um
 * 		   resultado como 9.75 é arredondado para 10).
 * 
 */

package com.zenorocha.lista1;

public class Exercicio03 {

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
