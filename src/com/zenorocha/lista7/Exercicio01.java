/*
 * Lista 7
 * Projeto e Construção de Sistemas
 * Professor: Alexandre Correa
 *
 * Implementado por Zeno Rocha
 * Em 29/06/2011
 *
 * --------------------------------------------------------------------------------------------
 *
 * Exercício 1
 *
 *	Faça um programa que permita o usuário entre um conjunto de números inteiros
 *      (quantidade não é conhecida a priori) e imprima a soma e a média desses números.
 *
 */

package com.zenorocha.lista7;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> colecao = new ArrayList<Integer>();

        System.out.println("Instruções: para parar digite -1\n");

        int soma = 0;
        boolean continua = true;

        while (continua) {
            
            System.out.print("Entre com um número: ");

            int entrada = Integer.parseInt(scanner.nextLine());

            if (entrada == -1) {
                continua = false;
            }
            else {
                colecao.add(entrada);
                soma += entrada;
            }
        }

        System.out.print("Soma: " + soma);
        System.out.print("\nMédia: " + (soma / colecao.size()));
        
    }

}
