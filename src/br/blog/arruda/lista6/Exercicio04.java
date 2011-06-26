package br.blog.arruda.lista6;

import com.sun.imageio.plugins.common.I18N;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> listInt = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            listInt.add(scanner.nextInt());
        }
        
        FileOutputStream fileoutputstream = new FileOutputStream("foo");

        for (Integer i : listInt) {
            fileoutputstream.write(i);
        }

        fileoutputstream.close();
    }
}