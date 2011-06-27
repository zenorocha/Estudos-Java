package br.blog.arruda.lista6;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> listInt = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            listInt.add(scanner.nextInt());
        }
        
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("foo"));

        oos.writeObject(listInt);
        oos.close();
    }
}