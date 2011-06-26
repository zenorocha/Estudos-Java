package br.blog.arruda.lista6.ex9;

import br.blog.arruda.lista6.ex6.Produto;
import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Exercicio09 {

    public static void main(String[] args) throws IOException {

        
        XMLDecoder dec = new XMLDecoder(  new BufferedInputStream(
                              new FileInputStream("produtos.xml")));

        ArrayList<Produto> listProdutos = (ArrayList<Produto>) dec.readObject();
        dec.close();
        for (Produto produto : listProdutos) {
            System.out.println("*******");
            System.out.println(produto.getNome());
            System.out.println(produto.getCodigo());
            System.out.println(produto.getPreco());
        }

    }
}
