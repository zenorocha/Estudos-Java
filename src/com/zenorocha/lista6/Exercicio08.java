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
 * Exercício 8
 *
 *	Seja a mesma classe Produto do exercício 6, faça um programa que instancie alguns
 *      produtos (ex: 3 produtos), armazenando suas referências em um array. Em seguida,
 *      armazene os dados desses três produtos em um arquivo via serialização em arquivo XML.
 *
 */

package com.zenorocha.lista6;

import java.beans.XMLEncoder;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Exercicio08 {

    public static void main(String args[]) {

        Produto p1 = new Produto("Produto - 1", 1, 10.5);
        Produto p2 = new Produto("Produto - 2", 2, 13.2);
        Produto p3 = new Produto("Produto - 3", 3, 15);

        ArrayList<Produto> lista = new ArrayList();

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        try {

            XMLEncoder xml = new XMLEncoder(new FileOutputStream("produto.xml"));

            xml.writeObject(lista);
            xml.close();

        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


    }

}
