/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio08;

import java.util.*;

/**
 *
 * @author Guilherme
 */
public class Exercicio08 {

    public static void main(String[] args) {
        TreeSet<Produto> produtos = new TreeSet<Produto>();
        Produto p1 = new Produto("Borracha", 32, 0.50);
        Produto p2 = new Produto("Caneta", 23, 0.75);
        Produto p3 = new Produto("Caneta", 39, 1.50);

        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
       

        imprimir(produtos);
        TreeSet<Produto> prodReverso = new TreeSet<Produto>(new decrescente());
        
        prodReverso.add(p1);
        prodReverso.add(p2);
        prodReverso.add(p3);
      
        System.out.println();
        System.out.println("Imprimindo na ordem decrescente a partir do preço: ");
        imprimir(prodReverso);
        
        
      

    }
    public static void imprimir(TreeSet<Produto> produtos) {

        for (Produto e : produtos) {

            System.out.print("Nome: " + e.getNome() + ", ");
            System.out.print("Codigo: " + e.getCodigo() + " ");
            System.out.println("Preço: " + e.getPreco());
        }
    }
    


}
