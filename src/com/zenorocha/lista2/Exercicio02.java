/*
 * Lista 2
 * Projeto e Construção de Sistemas
 * Professor: Alexandre Correa
 * 
 * Implementado por Zeno Rocha
 * Em 27/04/2011
 * 
 * --------------------------------------------------------------------------------------------
 * 
 * Exercício 2
 * 
 * 	Escreva um programa que dado um valor numérico entrado pelo usuário (armazenado em
 * 	uma variável inteira), imprima cada um dos seus dígitos por extenso.
 * 
 * 	Exemplo:
 * 
 * 	Entre o número: 4571
 * 	Resultado: quatro cinco sete um
 * 
 */

package com.zenorocha.lista2;

import java.util.Scanner;

public class Exercicio02 {
    
    public static void main(String[] args) {

        String digitoPorExtenso[] = {"zero", "um", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com um valor qualquer: ");
        String entrada = scanner.next();

        String convertida = "";

        for (int j = 0; j < entrada.length(); j++) {
            char caracter = entrada.charAt(j);
            String retorno = digitoPorExtenso[Character.getNumericValue(caracter)];
            convertida += retorno + " ";
        }

        System.out.println(convertida);

    }
}
