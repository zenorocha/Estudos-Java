/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lista6;

import java.io.BufferedWriter; // pra poder usar buffer
import java.io.FileWriter;  // operações basicas pra escrever no arquivo
import java.io.IOException;
import java.io.PrintWriter; // escrever no aqruivo usando printf e println
import java.util.Scanner;

/**
 *
 * @author LABCCET
 */
public class Exercicio02 {
    public static void main(String[] args) {
        PrintWriter writer = null;
        int i = 10;
        try{
            writer = new PrintWriter(new BufferedWriter(new FileWriter("Texto.txt"), 32000));
//            BufferedWriter bufWriter = new BufferedWriter(writer, 32000);
            writer.printf("Alol alo : %10d\n", i);
            writer.println("Alo Alo"); // ou writer.write("Alo Alo");
            writer.println("\nLinha 2");
            writer.println("\nLinha3");
            System.out.println("Entre com um texto: ");
            Scanner scan = new Scanner(System.in);
            String lol = scan.nextLine();
            writer.println(lol);
            writer.close();
            
        } catch(IOException ex){
            System.out.println("Deu zica: " +ex.getMessage());
        }
    }

}
