/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio08;
import Exercicio08.Produto;
import java.util.Comparator;

/**
 *
 * @author Guilherme
 */
public class decrescente implements Comparator <Produto> {
     
    public int compare(Produto p1, Produto p2) {
       if(p1.getPreco()>p2.getPreco())
           return -1;
       
       if(p1.getPreco() < p2.getPreco())
           return 1;
       else
           return 0; 
    }
    // ou return p2.getPreco() - p1.getPreco();
}
