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
 * Exercício 5
 *
 *	Faça um programa que leia o conteúdo do arquivo gerado no programa anterior e
 *      imprima a média dos números presentes no arquivo.
 *
 */

package com.zenorocha.lista6;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Exercicio05 {

    public static void main (String args[]) {

        try {
            DataInputStream input = new DataInputStream(new FileInputStream("saidaBinaria.dat"));

            int media = 0;
            int totalDeNumeros = 10;

            for (int i = 0; i < totalDeNumeros; i++) {
                media += input.readInt();
            }

            System.out.println("Média = " + (media / totalDeNumeros));

            input.close();
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
    
}
