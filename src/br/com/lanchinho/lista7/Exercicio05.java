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
public class Exercicio05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        int n;
        System.out.println("Entre com a quantidade de numeros");
        n = scan.nextInt();
        int num;


        for (int i = 0; i < n; i++) {
            System.out.println("Entre com os numeros");
            num = scan.nextInt();
            set1.add(num);
            if (num <= 10) {
                set2.add(num);
            }
        }

        System.out.println("SET2: " + set2);

        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.ensureCapacity(set2.size());
        lista.addAll(set2);


        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) > 2 && lista.get(i) < 10) {
                if (lista.get(i) % 2 == 0) {
                    lista.remove(i);
                }
            }
        }
        set2.clear();
        set2.addAll(lista);
        lista.clear();


        System.out.println("SET2 após remoção dos numeros pares entre 2 e 10: " + set2);


        System.out.println("Entre com um numero: ");
        int numb = scan.nextInt();
        System.out.println("Tem no conjunto 1: " + set1.contains(numb));
        System.out.println("Tem no conjunto2: " + set2.contains(numb));
        System.out.println();

        System.out.println("Os conjuntos 1 e 2 possuem os numeros 2, 4 e 5?");
        if ((set1.contains(2) && set1.contains(4) && set1.contains(5)) == true) {
            System.out.println("O conjunto 1 possui os numeros");
        } else {
            System.out.println("O conjunto 1 nao possui estes numeros");
        }

        if ((set2.contains(2) && set2.contains(4) && set2.contains(5)) == true) {
            System.out.println("O conjunto 2 possui os numeros");
        } else {
            System.out.println("O conjunto 2 nao possui estes numeros");
        }

        ArrayList<Integer> lista2 = new ArrayList<Integer>();
        lista.addAll(set2);
        lista2.ensureCapacity(set1.size());
        lista2.addAll(set1);

        while (lista.indexOf(10) != -1 && lista2.indexOf(10) != -1) {

            lista.set(lista.indexOf(10), 20);
            lista2.set(lista2.indexOf(10), 20);
        }
        set1.clear();
        set2.clear();
        
        set1.addAll(lista2);
        set2.addAll(lista);
        
        System.out.println("SET1 depois da troca: "+set1);
        System.out.println("SET2 depois da troca: "+set2);
    }
}


