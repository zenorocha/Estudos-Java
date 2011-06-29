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
public class Exercicio06 {

    public static void main(String[] args) {
        TreeSet<Integer> Tree1 = new TreeSet<Integer>();
        TreeSet<Integer> Tree3 = new TreeSet<Integer>();
        Scanner leitor = new Scanner(System.in);

        System.out.println("Entre com o tamanho que vc quer ");
        int n = leitor.nextInt();

        int num;
        for (int i = 0; i < n; i++) {
            System.out.println("Entre com os numeros");
            num = leitor.nextInt();
            Tree1.add(num);
            if (num > 1 && num < 10) {
                Tree3.add(num);
            }
        }

        TreeSet<Integer> Tree2 = new TreeSet<Integer>();
        ArrayList<Integer> AUX = new ArrayList<Integer>();
        AUX.addAll(Tree1);
        Tree2.addAll(AUX.subList(0, 4));
        AUX.clear();
        System.out.println("Tree 2: " + Tree2);

        System.out.println();
        System.out.println("Tree 3: " + Tree3);

        Tree2.clear();
        Tree2.addAll(Tree1);
        AUX.addAll(Tree2);
        Tree2.clear();

        for (int i = 0; i < AUX.size(); i++) {
            if (AUX.get(i) >= 2 && AUX.get(i) < 10) {
                if (AUX.get(i) % 2 == 0) {
                    AUX.remove(i);
                }
            }
        }

        Tree2.addAll(AUX);
        AUX.clear();
        System.out.println("Tree 2, sem os numeros pares entre 2 e 10 :" + Tree2);



        //„h Multiplique os dois ultimos numeros da arvore 2 por 10 e armazene o resultado em
//lugar dos numeros originais. 
        AUX.addAll(Tree2);
        int a, b;
        a = 10 * AUX.get(AUX.size() - 2);
        b = 10 * AUX.get(AUX.size() - 1);
        AUX.set(AUX.size() - 2, a);
        AUX.set(AUX.size() - 1, b);
        
        Tree2.clear();
        Tree2.addAll(AUX);
        AUX.clear();
        
        System.out.println("Tree 2, com os 2 ultimos elementos multiplicados por 10:" + Tree2);


        System.out.println("Entre com um numero");
        int numb = leitor.nextInt();

        System.out.println("Arv1 tem o numero entrado (T/F) ?" + Tree1.contains(numb));
        System.out.println("Arv2 tem o numero entrado (T/F) ?" + Tree2.contains(numb));
        System.out.println("Arv3 tem o numero entrado (T/F) ?" + Tree3.contains(numb));

        System.out.println("As listas 1, 2 e 3 possuem os numeros 2, 4 e 5?");
        if ((Tree1.contains(2) && Tree1.contains(4) && Tree1.contains(5)) == true) {
            System.out.println("Sim a Arv 1  possui os numeros");
        } else {
            System.out.println("A Arv 1  nao possui estes numeros");
        }

        if ((Tree2.contains(2) && Tree2.contains(4) && Tree2.contains(5)) == true) {
            System.out.println("Sim a Arv 2  possui os numeros");
        } else {
            System.out.println("A Arv 2  nao possui estes numeros");
        }

        if ((Tree3.contains(2) && Tree3.contains(4) && Tree3.contains(5)) == true) {
            System.out.println("Sim a Arv 3  possui os numeros");
        } else {
            System.out.println("A Arv 3 nao possui estes numeros");
        }


    }
}
