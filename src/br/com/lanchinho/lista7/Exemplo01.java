/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author LABCCET
 */
public class Exemplo01 {

    public static void imprime(/*List*/Set<Integer> lista) {
        for (int i : lista) {
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
//      ArrayList<Integer> numeros = new ArrayList<Integer>();
        //List<Integer> numeros = new LinkedList<Integer>();   //nao tem justificativa em usar o tipo da variavel
        // como arraylist ou linkedlist, a nao ser que vc va usar alguma operação especial
//
//        Set<Integer> numeros = new HashSet<Integer>(); // No set as repetições são ignoradas !!
//        Set<Integer> other = new HashSet<Integer>();

         Set<Integer> numeros = new TreeSet<Integer>();
         Set<Integer> other = new TreeSet<Integer>(); //No TreeSet é imprimido em ordem simétrica

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(15);
        numeros.add(35);
        numeros.add(80);
   
        imprime(numeros);
        System.out.println("------------");
        
        other.addAll(numeros); // permite que vc adicione todos os elementos de uma lista em um conjunto, ou um conjunto em outro conjunto.
        System.out.print("Outros: ");
        System.out.println(other);

        numeros.add(15);
        numeros.add(20);
        numeros.add(20);

        System.out.println("------------");
        System.out.println(numeros);

//        System.out.println("--------------");
//        //   System.out.println(numeros.get(2));
//
//        System.out.println(numeros.isEmpty());
//        System.out.println(numeros.size());
//       //    System.out.println(numeros.set(2, 40)); // imprime o que ta no intervaolo.
//
//        System.out.println(numeros.contains(20));
//        //  System.out.println(numeros.indexOf(80));
//
//        System.out.println("-------------");
//        //  Collections.sort(numeros); // serve pra lista e *arraylist*
//        System.out.println(numeros);
//
//// ensureCapacity aumenta a capacidade do arraylist. O usuario escolhe a capacidade ...
//// ^Não funciona em linked list !

        System.out.println("elementos obtidos a partir do iterator:");
        Iterator<Integer> iterator = numeros.iterator();  //Percorre coleções !
       while(iterator.hasNext()) // Enquanto tiver proximo imprima ...
           System.out.println(iterator.next());

    }
}
