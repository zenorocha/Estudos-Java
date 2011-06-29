/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista7;

import java.beans.XMLEncoder;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Exercicio02 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de numeros que vc deseja inserir");
        int n = scan.nextInt();
        numeros.ensureCapacity(n);
        int num;

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            num = scan.nextInt();
            numeros.add(num);
        }

        XMLEncoder encoder = null;
        try {
            encoder = new XMLEncoder(new FileOutputStream("numeros.xml"));
            encoder.writeObject(numeros);
            encoder.close();
        } catch (IOException e) {
            System.out.println("DEU CAGADA");
        }

    }
}
