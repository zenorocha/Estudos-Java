/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista7;

import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;


/**
 *
 * @author Guilherme
 */
public class Exercicio03 {

    public static void main(String[] args) {
        XMLDecoder decoder = null;
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        int soma = 0;
        int i = 0;
        int media = 0;
        try {
            decoder = new XMLDecoder(new FileInputStream("numeros.xml"));
            numeros = (ArrayList<Integer>) decoder.readObject();

            for (i = 0; i < numeros.size(); i++) {
                soma += numeros.get(i);
                media = soma / numeros.size();
            }


            decoder.close();

        } catch (IOException e) {
            System.out.println("ERRO");
        }

        System.out.println("Soma: " + soma);
        System.out.println("A media é: " + media);

    }
}
