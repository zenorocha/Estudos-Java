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
 * Exercício 7
 *
 *	Faça um programa que leia o array serializado no exercício anterior e imprima os dados
 *      dos produtos armazenados (nome, código e preço).
 *
 */

package com.zenorocha.lista6;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Exercicio07 {

    public static void main(String args[]) throws IOException {

        ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("produto.dat"));

        try {
            ArrayList<Produto> lista = (ArrayList<Produto>) entrada.readObject();

            for (int i = 0; i < lista.size(); i++) {
                System.out.println("\nNome: " + lista.get(i).getNome());
                System.out.println("Código: " + lista.get(i).getCodigo());
                System.out.println("Preço: " + lista.get(i).getPreco());
            }

        }
        catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        entrada.close();

    }
}
