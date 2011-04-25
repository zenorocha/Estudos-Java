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

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		int a;
		int b;
		
		System.out.print("Entre com o valor da variável A: ");
		a = scanner.nextInt();
		
		System.out.print("Entre com o valor da variável B: ");
		b = scanner.nextInt();
		
		System.out.println("Soma: " + (a + b));
		System.out.println("Multiplicação: " + (a * b));
		System.out.println("Subtração: " + (a - b));
		System.out.println("Resto da divisão: " + (a % b));
		System.out.println("Divisão (com resultado inteiro): " + (a / b));
		System.out.println("Divisão (com resultado não inteiro): " + (((float) a) / ((float) b)));
		System.out.println("Divisão inteira (com resultado arredondado): " + Math.ceil(a / b));
	}
	
}
