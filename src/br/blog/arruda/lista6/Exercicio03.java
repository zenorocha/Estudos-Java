package br.blog.arruda.lista6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercicio03 {

    public static void main(String[] args) throws IOException {
        try {
            BufferedReader in = new BufferedReader(new FileReader("foo.txt"));


            String str;
            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
            in.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
