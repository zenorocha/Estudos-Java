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
 * Exercício 7:
 * 
 * 	Faça um programa que, a partir de um texto entrado pelo usuário, imprima o texto
 * 	removendo todos os espaços em branco adicionais encontrados, de modo que haja, no
 * 	máximo, um espaço em branco separando as palavras presentes nesse texto.
 * 
 */

package com.zenorocha.lista2;

import java.util.Scanner;

public class Exercicio07 {
	
	public static boolean verificaEspaco(String entrada) {
		
		
		
		return false;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Entre com um texto qualquer: ");
		String entrada = scanner.nextLine();
		
		boolean hasNextSpace = false;
		
		for (int i = 0; i < entrada.length(); i++) {
			if (entrada.charAt(i) == ' ') {
				
				hasNextSpace = verificaEspaco(entrada);
				
				while (hasNextSpace) {
					
				}
				
			}
		}
		
		
		
		
	}
	
	
}
