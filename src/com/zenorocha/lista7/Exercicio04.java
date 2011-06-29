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
 * Exercício 4
 *
 *	Faça um programa que leia um conjunto de números inteiros armazenando-os em um
 *      ArrayList (lista1) - faça com que o usuário entre no mínimo 6 números, podendo ser números repetidos - e:
 *
 *      - Crie uma nova lista (lista2) a partir dos 4 primeiros números entrados pelo usuário
 *      e imprima essa nova lista.
 *      - Crie uma lista (lista 3) a partir da lista entrada pelo usuário apenas com os
 *      números entre 1 e 10 e imprima o resultado.
 *      - Remova todos os números pares (entre 2 e 10) da lista 2 e imprima o resultado.
 *      - Multiplique os dois últimos números da lista 2 por 10 e armazene o resultado em
 *      lugar dos números originais.
 *      - Peça para o usuário entrar um número e imprima se alguma das três listas criadas
 *      anteriormente contém o número.
 *      - Imprima quais listas possuem os números 2, 4 e 5 (apenas se todos os três
 *      números fizerem parte da lista). Imprima também em quais posições cada um
 *      desses números aparecem na lista.
 *      - Ordene os números em cada lista e imprima o resultado.
 *      - Modifique todas as ocorrências do número 10 nas três listas pelo número 20 e
 *      imprima o resultado (teste o programa entrando pelo menos uma vez o número 10).
 *
 */

package com.zenorocha.lista7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio04 {

    public static void main(String args[]) {

        System.err.println("Instruções: para parar digite -1\n");

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lista1 = new ArrayList<Integer>();
        ArrayList<Integer> lista2 = new ArrayList<Integer>();
        ArrayList<Integer> lista3 = new ArrayList<Integer>();

        int soma = 0;
        boolean continua = true;

        while (continua) {
            
            System.out.print("Entre com um número: ");

            int entrada = Integer.parseInt(scanner.nextLine());

            if (entrada == -1) {

                if (lista1.size() < 6) {
                    System.err.println("Atenção: Entre com no mínimo 6 números.");
                }
                else {
                    continua = false;
                }
            }
            else {
                lista1.add(entrada);
                soma += entrada;
            }
        }

        System.out.println("\nLista 2: ");

        lista2.addAll(lista1.subList(0, 4));


        for (int i = 0; i < lista2.size(); i++) {
            System.out.println(lista2.get(i));
        }

        for (int i = 0; i < lista1.size(); i++) {
            if (lista1.get(i) < 10) {
                lista3.add(lista1.get(i));
            }
        }

        for (int i = 0; i < lista2.size(); i++) {

            if (lista2.get(i) < 10) {

                if ((lista2.get(i) % 2) == 0) {
                    lista2.remove(i);
                }

            }

        }

        System.out.println("\nLista 2, após remoção dos pares: ");

        for (int i = 0; i < lista2.size(); i++) {
            System.out.println(lista2.get(i));
        }
        
        int totalElem = lista2.size();
        int penultimoElem = lista2.get(totalElem - 2) * 2;
        int ultimoElem = lista2.get(totalElem - 1) * 10;

        lista2.add(totalElem - 2, penultimoElem);
        lista2.add(totalElem - 1, ultimoElem);

        System.out.println(lista2.get(totalElem - 2));
        System.out.println(lista2.get(totalElem - 1));
        
        System.out.print("\nEntre com um número qualquer para verificar se existe ele em alguma das listas: ");
        int num = scanner.nextInt();

        if (lista1.contains(num)) {
            System.out.println("Esse número existe na lista 1.");
        }
        if (lista2.contains(num)) {
            System.out.println("Esse número existe na lista 2.");
        }
        if (lista3.contains(num)) {
            System.out.println("Esse número existe na lista 3.");
        }

        if (lista1.contains(2) && lista1.contains(4) && lista1.contains(5)) {
            System.out.println("\nA lista 1 possui os números 2, 4 e 5. E se encontram nas respectivas posições: " + lista1.indexOf(2) + " " + lista1.indexOf(4) + " " + lista1.indexOf(5));
        }
        if (lista2.contains(2) && lista2.contains(4) && lista2.contains(5)) {
            System.out.println("A lista 2 possui os números 2, 4 e 5. E se encontram nas respectivas posições: " + lista2.indexOf(2) + " " + lista2.indexOf(4) + " " + lista2.indexOf(5));
        }
        if (lista3.contains(2) && lista3.contains(4) && lista3.contains(5)) {
            System.out.println("A lista 3 possui os números 2, 4 e 5. E se encontram nas respectivas posições: " + lista3.indexOf(2) + " " + lista3.indexOf(4) + " " + lista3.indexOf(5));
        }

        Collections.sort(lista1);
        Collections.sort(lista2);
        Collections.sort(lista3);

        while (lista1.indexOf(10) != -1 && lista2.indexOf(10) != -1 && lista3.indexOf(10) != -1) {
            lista1.set(lista1.indexOf(10), 20);
            lista2.set(lista2.indexOf(10), 20);
            lista3.set(lista3.indexOf(10), 20);
        }

        System.out.print("\nLista 1: " + lista1);
        System.out.print("\nLista 2: " + lista2);
        System.out.print("\nLista 3: " + lista3);

    }

}
