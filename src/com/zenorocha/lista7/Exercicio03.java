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
 * Exercício 3
 *
 *	Faça um programa que leia o conjunto de números inteiros armazenados no exercício
 *      anterior e imprima a soma e a média desses números.
 *
 */

package com.zenorocha.lista7;

import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Exercicio03 {

    public static void main(String args[]) {

        try {
            
            XMLDecoder xml = new XMLDecoder(new FileInputStream("int.xml"));
            ArrayList<Integer> colecao = (ArrayList<Integer>) xml.readObject();

            int soma = 0;

            for (int i = 0; i < colecao.size(); i++) {
                soma += colecao.get(i);
            }

            System.out.print("Soma: " + soma);
            System.out.print("\nMédia: " + (soma / colecao.size()));

        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
