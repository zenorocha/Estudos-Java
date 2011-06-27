package br.blog.arruda.lista6;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        try {
            PrintWriter out = new PrintWriter(new FileWriter("foo.txt"));

            String conteudo = "";
            while (true) {
                conteudo = scanner.nextLine();
                if(conteudo.equals("")){
                    break;
                }
                out.println(conteudo);

            }
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
