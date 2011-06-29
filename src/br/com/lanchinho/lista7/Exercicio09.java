/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista7;

import java.util.*;

/**
 *
 * @author Guilherme
 */
public class Exercicio09 {

    public static void main(String[] args) {
        Produto p1 = new Produto(10, "DVD", 55.00);
        Produto p2 = new Produto(4, "Revista", 10.00);
        Produto p3 = new Produto(90, "Monitor", 350.00);
        Scanner scan = new Scanner(System.in);

        HashMap<Integer, Produto> mapaProd = new HashMap<Integer, Produto>();
        mapaProd.put(10, p1);
        mapaProd.put(4, p2);
        mapaProd.put(90, p3);

        System.out.println("Hey Cara, entre com o codigo do produto");
        int cod = scan.nextInt();

        if (mapaProd.containsKey(cod) == true) {
            System.out.println("O produto existe");
            System.out.println("Nome: " + mapaProd.get(cod).getNome());
            System.out.println("Preco: " + mapaProd.get(cod).getPreco());
        } else {
            System.out.println("Produto inexistente");
        }
        
        System.out.println("Lista com os  códigos dos produtos existentes:");
        System.out.println(mapaProd.keySet());
        

    }
}

