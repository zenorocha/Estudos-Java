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
 * Programa 3.3
 * 
 *	Dado um array de strings com 20 nomes (com nome e sobrenome) de pessoas, escreva um
 *	programa que faça 10 sorteios, sendo 4 pessoas sorteadas em cada sorteio, e imprima a
 *	relação completa das pessoas (em ordem alfabética) e a respectiva quantidade de vezes que
 *	cada um foi sorteado.
 * 
 */

package com.zenorocha.modulo2;

import java.util.Arrays;

public class TresPontoTres {

	private int numeroDeSorteios = 10;
	private int numeroDeSorteados = 4;
	private String arrayNomes[] = {"Paulo Henrique", "William José", "Maria Nascimento", "Carlos Eduardo", "Roberto Martins", "Sean Parker", "Mark Zuckenberg", "Joshua Davis", "Francisco Azevedo", "Fernando Torres", "Antonio Conceição", "Zeno Rocha", "Sergio Puntar", "Juliana Torroni", "Mariana Keller", "Bruno Silveira", "Victor dos Santos", "Karina Gomes", "Jorge Ben", "Ney Matogrosso"};
	private String vetorSorteados[] = new String[40];
	
	public TresPontoTres() {
		
	}
	
	public void Sortear() {
		
		Arrays.sort(this.arrayNomes);
		
		int k = 0;
		
		System.out.println("-- Início do sorteio.\n");
		
		for (int i = 0; i < numeroDeSorteios; i++) {
			
			for (int j = 0; j < numeroDeSorteados; j++) {
				int sorteio = (int)(Math.random() * 20);
				System.out.println(this.arrayNomes[sorteio]);
				
				vetorSorteados[k] = this.arrayNomes[sorteio];
				k++;
			}
			
			System.out.println("\n-- Fim do sorteio #" + (i+1) + "\n");
			
		}
		
		calculaVezesSorteado();
	}
	
	
	public void calculaVezesSorteado() {
		
		int repeticoes = 0;
		
		for (int i = 0; i < this.arrayNomes.length; i++) {
			
			repeticoes = 0;
			
			for (int j = 0; j < this.vetorSorteados.length; j++) {
				if ((this.arrayNomes[i] == this.vetorSorteados[j])) {
					repeticoes++;
				}
			}			
			
			System.out.println(this.arrayNomes[i] + " foi sorteado(a) " + repeticoes + " vezes.");
		}
	}
	
	public static void main(String[] args) {
		TresPontoTres objTresPontoTres = new TresPontoTres();
		
		objTresPontoTres.Sortear();
	}
}
