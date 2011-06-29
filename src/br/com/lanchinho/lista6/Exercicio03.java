/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista6;

import java.io.BufferedReader; // pra ter acesso a operações como a readLine, processamento linha a linha 
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author LABCCET
 */
public class Exercicio03 {

    public static void main(String[] args) {
        BufferedReader reader = null;
        int i = 10;
        try {
            File arquivo = new File("Texto.txt");
            if (arquivo.exists()) {
                reader = new BufferedReader(new FileReader(arquivo), 4096);
                String linha = null;
                while(reader.ready()){
                     linha = reader.readLine();
                      System.out.println(linha);
                }
//                do {
//                    linha = reader.readLine();
//                    if (linha != null) {
//                        System.out.println(linha);
//                    }
//                } while (linha != null);
                reader.close();
            }
        } catch (IOException ex) {
            System.out.println("Deu zica: " + ex.getMessage());
        }
    }
}
