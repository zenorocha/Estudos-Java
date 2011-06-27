package br.blog.arruda.lista6.ex8;

import br.blog.arruda.lista6.ex6.*;
import java.beans.XMLEncoder;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Exercicio08 {

    public static void main(String[] args) throws IOException {
        FileOutputStream os = new FileOutputStream("produtos.xml");
        XMLEncoder encoder = new XMLEncoder(os);
        
        ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
        for (int i = 0; i < 3; i++) {
            Produto p = new Produto("nome " + i+1, i+1, new Double(i+1 * 100));
            listaProdutos.add(p);
        }
        encoder.writeObject(listaProdutos);
        encoder.close();



    }
}