/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Exercicio01 {
    public static void main(String[] args){
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de numeros que vc deseja inserir");
        int n = scan.nextInt();
        numeros.ensureCapacity(n);
        int num;
        
        int media = 0;
        int soma = 0;
       
        for(int i = 0; i <n; i++){
          System.out.println("Digite um numero: ");
          num = scan.nextInt();
          numeros.add(num);
          soma += numeros.get(i);
        }
        media = soma/n;
        System.out.println("A media é: " +media);
        
    }
    
}
