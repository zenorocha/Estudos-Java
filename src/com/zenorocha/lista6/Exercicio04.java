/*
 * Lista 6
 * Projeto e Construção de Sistemas
 * Professor: Alexandre Correa
 *
 * Implementado por Zeno Rocha
 * Em 29/06/2011
 *
 * --------------------------------------------------------------------------------------------
 *
 * Exercício 4
 *
 *	Faça um programa que permita que o usuário entre 10 números a partir do console e
 *      armazene esses 10 números em um arquivo em formato binário.
 *
 */

package com.zenorocha.lista6;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio04 {

    public static void main (String args[]) throws IOException {

        try {

            DataOutputStream oos = new DataOutputStream(new FileOutputStream("saidaBinaria.dat"));

            Scanner scanner = new Scanner(System.in);

            int totalDeNumeros = 10;

            for (int i = 0; i < totalDeNumeros; i++) {
                System.out.print("\nEntre com um número: ");
                oos.writeInt(scanner.nextInt());
            }
            
            oos.close();

            System.out.println("\nArquivo gerado com sucesso.");

        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
