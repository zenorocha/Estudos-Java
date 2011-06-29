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
public class Exercicio10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        TreeMap<Integer,Produto> Arvmap = new TreeMap<Integer,Produto>();
        Produto p1 = new Produto(100, "Camisa", 25.00);
        Produto p2 = new Produto(25, "Super Smash Bros Brawl", 189.00);
        Produto p3 = new Produto(19, "Razer Naga", 300.00 );
        
        Arvmap.put(100,p1);
        Arvmap.put(25,p2);
        Arvmap.put(19, p3);
        
        System.out.println("Entre com o codigo do produto");
        int cod = input.nextInt();
        
        if(Arvmap.containsKey(cod)== true){
            System.out.println("O produto existe !!!");
            System.out.println("Nome: "+Arvmap.get(cod).getNome());
            System.out.println("Preço: "+Arvmap.get(cod).getPreco());
            System.out.println();
           
         
        }else{
            System.out.println("Produto não existe !!!");
            System.out.println();
        }
        
        System.out.println("Mudando o codigo do produto ...");
        if(Arvmap.containsKey(cod) == true){
             Arvmap.put((cod*10), Arvmap.get(cod));
            Arvmap.remove(cod);
        }
        else
            System.out.println("Não foi possivel modificar o codigo do produto");
        
      
       System.out.println();
       System.out.println("Codigo dos produtos que estão presentes na estrutura: ");
       System.out.println(Arvmap.keySet());
       
        

        
    }
    
}
