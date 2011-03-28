/*
 * Módulo 2
 * Projeto e Construção de Sistemas
 * Professor: Alexandre Correa
 * 
 * Implementado por Zeno Rocha
 * Em 18/03/2011
 * 
 * --------------------------------------------------------------------------------------------
 * 
 * Programa 3.2
 * 
 *	Escreva um programa que determine se um número é ou não um palíndromo (as leituras da
 *	esquerda para a direita e vice-versa são iguais).
 *	Exemplos de Palíndromo: 12321, 55555, 45554, 11611, 123321
 * 
 */

package com.zenorocha.modulo2;

import java.util.Scanner;

public class TresPontoDois {

	private String entrada;
	
	public TresPontoDois() {
		
	}
	
	public String getEntrada() {
		return entrada;
	}
	
	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}
	
	public void verificaPalindromo() {
		int i = 0;
		
		while (i < this.entrada.length()) {
			if (this.entrada.charAt(i) != this.entrada.charAt(this.entrada.length() - i - 1)) {
				System.out.println("Não é Palíndromo");
				System.exit(0);
			}
			
			i++;
		}
		
		System.out.println("É um Palíndromo");
	}
	
	public static void main(String[] args) {
		TresPontoDois objTresPontoDois = new TresPontoDois();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com um valor qualquer");
		
		objTresPontoDois.setEntrada(scanner.next());
		
		objTresPontoDois.verificaPalindromo();  
	}
}