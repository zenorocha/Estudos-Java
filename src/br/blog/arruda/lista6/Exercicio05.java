package br.blog.arruda.lista6;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Exercicio05 {

    public static void main(String[] args) throws IOException {
        ObjectInputStream ois = new ObjectInputStream( new FileInputStream("foo"));
        
        try {
            ArrayList<Integer> listInt = (ArrayList<Integer>) ois.readObject();
            ois.close();
            double media = 0.0;
            for(Integer integer : listInt){
                media += integer;
                System.out.println(integer);
            }
            media /=listInt.size();
            System.out.println(media);
        } catch (ClassNotFoundException ex) {
        }
        
        ois.close();

    }
}
