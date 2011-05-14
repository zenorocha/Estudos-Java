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
 * Exercício 8
 * 
 * 	Escreva um programa que pede para o usuário entrar o código do estado civil de uma
 * 	pessoa (valores possíveis: 1, 2, 3, 4) e imprima por extenso o estado civil correspondente
 * 	ao código entrado, sendo 1=>Solteiro; 2=>Casado; 3=>Divorciado e 4=>Viúvo.
 * 
 */

package com.zenorocha.lista1;

import java.util.Scanner;

public class Exercicio08 {
	
	public static void main(String[] args) {
	
		String[] estadoCivil = {"Solteiro", "Casado", "Divorciado", "Viúvo"};
		
		Scanner input = new Scanner(System.in);

        System.out.println("Digite o número do seu estado civil (1 - 4):\n");
        
        for (int i = 0; i < estadoCivil.length; i++) {
        	System.out.println((i + 1) + " - " + estadoCivil[i]);	
        }
        
        int opcao = input.nextInt();
        
        if ((opcao >= 1) && (opcao <= 4))
        	System.out.println("\nEstado Civil: " + estadoCivil[opcao - 1]);
        else
        	System.err.println("\nDigite um número de válido (1 - 4)");   
	}
}
