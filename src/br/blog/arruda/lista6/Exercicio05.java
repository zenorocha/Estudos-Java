package br.blog.arruda.lista6;

import java.io.FileInputStream;
import java.io.IOException;

public class Exercicio05 {

    public static void main(String[] args) throws IOException {
        FileInputStream fileinputstream = new FileInputStream("foo");

        int numberBytes = fileinputstream.available();
        byte bytearray[] = new byte[numberBytes];

        fileinputstream.read(bytearray);

        double media = 0.0;
        for (int i = 0; i < numberBytes; i++) {
            media += (int)bytearray[i];
            System.out.println(bytearray[i]);
        }
        media /= numberBytes;
        System.out.println(media);

        fileinputstream.close();
    }
}
