package br.blog.arruda.lista6.ex12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercicio12 {

    public static void main(String[] args) {
        
        try {
            BufferedReader in = new BufferedReader(new FileReader("TEMPOS.txt"));


            String str;
            while ((str = in.readLine()) != null) {
                int tempo = Integer.parseInt(str);
            }
            in.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        

    }
}
