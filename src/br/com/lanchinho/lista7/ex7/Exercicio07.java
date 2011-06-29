/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio07;

import java.util.*;

/**
 *
 * @author Guilherme
 */
public class Exercicio07 {
    public static void main(String[] args){
        Set<Produto> produtos = new HashSet<Produto>();
        Produto p1 = new Produto("Coca Cola", 10 , 1.35);
        Produto p2 = new Produto("Pão de Queijo", 20, 9.00);
        Produto p3 = new Produto("Sabão", 30, 9.00);
        
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        imprimir(produtos);
        
        Produto prodAlvo = new Produto("Coca Cola", 10, 1.35);
        
       if((produtos.contains(prodAlvo)) == true)
           System.out.println("O produto ja esta dentro da collection !");
       else
           System.out.println("O produto nao esta na coleção");
                   
    }
    
    public static void imprimir(Set<Produto> produto){
        for(Produto p : produto){
            System.out.print("codigo = " + p.getCodigo() + " -");
            System.out.print(" nome = " + p.getNome() + " -");
            System.out.print(" Preço = " +p.getPreco());
            System.out.println(" ");
        }
        
    }
    
}
