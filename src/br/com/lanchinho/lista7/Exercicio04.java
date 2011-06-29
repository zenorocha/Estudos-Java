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
public class Exercicio04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> lista1 = new ArrayList<Integer>();

        System.out.println("Entre com a quantidade de numeros:");
        int n = scan.nextInt();
        int num;
        lista1.ensureCapacity(n);


        for (int i = 0; i < n; i++) {
            System.out.println("Entre com um numero");
            num = scan.nextInt();
            lista1.add(num);
        }

        ArrayList<Integer> lista2 = new ArrayList<Integer>();

        lista2.addAll(lista1.subList(0, 4));
        System.out.println("Lista 2:" + lista2);

        ArrayList<Integer> lista3 = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (lista1.get(i) <= 10) {
                lista3.add(lista1.get(i));
            }

        }
        System.out.println("Lista 3: " + lista3);

        for (int i = 0; i < lista2.size(); i++) {
            if (lista2.get(i) >= 2 && lista2.get(i) <= 10) {
                if (lista2.get(i) % 2 == 0) {
                    lista2.remove(i);
                }
            }
        }
        System.out.println("Lista 2 sem os numeros pares entre 2 e 10: " + lista2);

        lista2.clear();
        lista2.addAll(lista1.subList(0, 4));
        
         // Multiplique os dois últimos números da lista 2 por 10 e armazene o resultado em
        //lugar dos números originais. 
        
        int a,b;
        a = 10 *lista2.get(lista2.size()-2);  
        b = 10* lista2.get(lista2.size()-1);
        
        
        lista2.set(lista2.size()-2, a);
        lista2.set(lista2.size()-1, b);
        
        System.out.println("Nova lista 2: " + lista2);

        System.out.println("Entre com um numero");
        int numb = scan.nextInt();
        System.out.println("Lista 1 tem ele ? " + lista1.contains(numb));
        System.out.println("Lista 2 tem ele ? " + lista2.contains(numb));
        System.out.println("List  3 tem ele ? " + lista3.contains(numb));
        System.out.println();



        System.out.println("As listas 1, 2 e 3 possuem os numeros 2, 4 e 5?");
        if ((lista1.contains(2) && lista1.contains(4) && lista1.contains(5)) == true) {
            System.out.println("Sim a lista 1  possui os numeros" + " e eles estão nas respectivas posições: "
                    +lista1.indexOf(2)+ " "+lista1.indexOf(4)+" "+lista1.indexOf(5));
        } else {
            System.out.println("A lista 1  nao possui estes numeros");
        }

        if ((lista2.contains(2) && lista2.contains(4) && lista2.contains(5)) == true) {
            System.out.println("Sim a lista 2  possui os numeros" + "e eles estão nas respectivas posições: "
                    +lista2.indexOf(2)+ " "+lista2.indexOf(4)+" "+lista2.indexOf(5));
        } else {
            System.out.println("A lista 2  nao possui estes numeros");
        }

        if ((lista3.contains(2) && lista3.contains(4) && lista3.contains(5)) == true) {
            System.out.println("Sim a lista 3  possui os numeros" + "e eles estão nas respectivas posições: "
                    +lista3.indexOf(2)+ " "+lista3.indexOf(4)+" "+lista3.indexOf(5));
        } else {
            System.out.println("A lista 3 nao possui estes numeros");
        }

        System.out.println();

        Collections.sort(lista1);
        System.out.println("Lista 1: " + lista1);
        Collections.sort(lista2);
        System.out.println("Lista 2: " + lista2);
        Collections.sort(lista3);
        System.out.println("Lista 3: " + lista3);


        while (lista1.indexOf(10) != -1
                && lista2.indexOf(10) != -1
                && lista3.indexOf(10) != -1) {
            lista1.set(lista1.indexOf(10), 20);
            lista2.set(lista2.indexOf(10), 20);
            lista3.set(lista3.indexOf(10), 20);
        }

        System.out.println();
        System.out.println("Lista 1 depois da troca: " + lista1);
        System.out.println("Lista 2 depois da troca: " + lista2);
        System.out.println("Lista 3 depois da troca: " + lista3);



    }
}
