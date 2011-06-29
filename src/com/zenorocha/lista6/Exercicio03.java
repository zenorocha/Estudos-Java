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
 * Exercício 3
 *
 *	Faça um programa que leia um texto do arquivo gerado no exercício anterior e imprima
 *      no console o seu conteúdo.
 *
 */

package com.zenorocha.lista6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercicio03 {

    public static void main (String args[]) throws IOException {

        try {

            FileReader arquivo = new FileReader("exemplo.txt");
            BufferedReader leitor = new BufferedReader(arquivo);

            while (leitor.ready()) {
                String linha = leitor.readLine();
                System.out.println(linha);
            }

            leitor.close();
            
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }

    }

}
