/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista6;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Guilherme
 */
public class Exercicio05 {

    public static void main(String[] args) {
        DataInputStream reader = null;
        int media = 0;
        int soma = 0;
        
        try {
            File arquivo = new File("arq.dat");
            if (arquivo.exists()) {
                reader = new DataInputStream(new BufferedInputStream(new FileInputStream(arquivo), 4096));
                
                int linha; 
                do {
                    linha = reader.readInt();
                        soma += linha;
                        media = soma /5;
                    if (linha != 0) 
                        System.out.println(linha);  
                } while (linha != 0);
                reader.close(); 
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Media: " +media);
    }
}
