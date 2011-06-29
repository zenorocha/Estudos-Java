/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lista7;

import java.util.*;

/**
 *
 * @author LABCCET
 */
public class ExemploProdutos {
    public static void main(String[] args){
        Produto p1 = new Produto(10,"Arroz",2.50);
        Produto p2 = new Produto(30,"Coca - Cola",2.50);
        Produto p3 = new Produto(10,"Sabonete",3.50);

        Map<Integer, Produto> mapProdutos = new HashMap<Integer,Produto>();
        mapProdutos.put(p1.getCodigo(), p1);
        mapProdutos.put(p2.getCodigo(), p2);
        mapProdutos.put(p3.getCodigo(), p3);
       

        Produto p = mapProdutos.get(10);
        System.out.println(p.getNome() + " - " + p.getPreco());

        Set<Produto> produtos = new /*Hash*/TreeSet<Produto>();
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);

        imprime(produtos);

    }

    private static void imprime(Set<Produto> produtos){
            for(Produto p : produtos){
            System.out.print("codigo = " + p.getCodigo());
            System.out.print(" nome = " + p.getNome());
            System.out.println(" ");
        }
    }
}


