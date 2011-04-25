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

public class Exercicio8 {
	
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
