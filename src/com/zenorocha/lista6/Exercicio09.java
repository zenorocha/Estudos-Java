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
 * Exercício 9
 *
 *	Faça um programa que leia o array serializado no exercício anterior (em XML) e imprima
 *      os dados dos produtos armazenados (nome, código e preço).
 *
 */

package com.zenorocha.lista6;

import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Exercicio09 {

    public static void main(String args[]) {

        try {
            XMLDecoder xml = new XMLDecoder(new FileInputStream("produto.xml"));

            ArrayList<Produto> lista = (ArrayList<Produto>) xml.readObject();

            for (int i = 0; i < lista.size(); i++) {
                System.out.println("\nNome: " + lista.get(i).getNome());
                System.out.println("Código: " + lista.get(i).getCodigo());
                System.out.println("Preço: " + lista.get(i).getPreco());
            }

        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }



    }

}
