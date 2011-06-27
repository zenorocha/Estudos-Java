package br.blog.arruda.lista6.ex6;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Exercicio06 {

    public static void main(String[] args) throws IOException {
        ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
        
        for (int i = 0; i < 3; i++) {
            Produto p = new Produto("nome "+i, i, new Double(i*100));
            listaProdutos.add(p);
        }
        
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("produtos"));

        oos.writeObject(listaProdutos);
        oos.close();
    }
}