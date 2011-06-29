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
 * Exercício 10
 *
 *	- Crie uma interface ProdutosDAO que define uma operação para salvar um array de
 *      objetos da classe Produto.
 *
 *      - Crie uma implementação desta interface que armazene o array em um arquivo via
 *      serialização binária (classe ProdutoDAOSerBinaria).
 *
 *      - Crie uma implementação desta interface que armazene o array em um arquivo via
 *      serialização XML (classe ProdutoDAOXML).
 *
 *      - Crie um programa que pergunte para o usuário o nome da classe que implementa o
 *      método de armazenamento desejado e a partir dessa entrada, armazene 3 produtos
 *      (criados no próprio programa como nos exercícios 6 e 8) utilizando um objeto da
 *      classe digitada pelo usuário (ProdutoDAOSerBinaria ou ProdutoDAOXML). Utilize
 *      Reflection para instanciar a implementação DAO apropriada.
 *
 */

package com.zenorocha.lista6;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Scanner;
import sun.reflect.Reflection;

public class Exercicio10 {
    
    public static void main(String args[]) {

        Produto p1 = new Produto("Produto - 1", 1, 10.5);
        Produto p2 = new Produto("Produto - 2", 2, 13.2);
        Produto p3 = new Produto("Produto - 3", 3, 15);

        ArrayList<Produto> lista = new ArrayList();

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        System.out.println("Escolha qual DAO deseja usar: ");
        System.out.println(ProdutoDAOXML.class);
        System.out.println(ProdutoDAOSerBinaria.class);

        Scanner scanner = new Scanner(System.in);

        try {

            Class c = Class.forName(scanner.nextLine());

            try {
                
                Method m = c.getMethod("salvaLista", lista.getClass());

                try {
                    Object invoke = m.invoke(c.newInstance(), lista);
                    //System.out.println(invoke);
                }
                catch (Throwable ex) {
                    System.out.println(ex.getMessage());
                }

            }
            catch (NoSuchMethodException ex) {
                System.out.println(ex.getMessage());
            }

        }
        catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
