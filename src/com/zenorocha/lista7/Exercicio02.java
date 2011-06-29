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
 * Exercício 2
 *
 *	Faça um programa que permita o usuário entre um conjunto de números inteiros
 *      (quantidade não é conhecida a priori) e armazene esses números em um arquivo via
 *      serialização XML.
 *
 */

package com.zenorocha.lista7;

import java.beans.XMLEncoder;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio02 {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> colecao = new ArrayList<Integer>();

        System.out.println("Instruções: para parar digite -1\n");

        boolean continua = true;

        while (continua) {

            System.out.print("Entre com um número: ");

            int entrada = Integer.parseInt(scanner.nextLine());

            if (entrada == -1) {
                continua = false;
            }
            else {
                colecao.add(entrada);
            }
        }

        try {
            XMLEncoder xml = new XMLEncoder(new FileOutputStream("int.xml"));
            xml.writeObject(colecao);
            xml.close();

            System.out.println("Arquivo gerado com sucesso.");

        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }



    }


}
