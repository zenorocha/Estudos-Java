/*
 * Lista 2
 * Projeto e Construção de Sistemas
 * Professor: Alexandre Correa
 * 
 * Implementado por Zeno Rocha
 * Em 01/05/2011
 * 
 * --------------------------------------------------------------------------------------------
 * 
 * Exercício 6:
 * 
 * 	Faça um programa que, a partir de um texto entrado pelo usuário, conte o número de
 * 	caracteres total e o número de palavras (palavra é definida por qualquer sequência de
 * 	caracteres delimitada por espaços em branco) e imprima o resultado.
 * 
 */

package com.zenorocha.lista2;

import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Entre com um texto qualquer: ");
		String entrada = scanner.nextLine();
		
		int totalCaracteres = entrada.length();
		int totalPalavras = 1;
		
		for (int i = 0; i < totalCaracteres; i++) {
			if (entrada.charAt(i) == ' ') {
				totalPalavras++;
			}
		}
		
		System.out.println("\nNúmero total de caracteres: " + totalCaracteres);
		System.out.println("Número total de palavras: " + totalPalavras);
	}
}
