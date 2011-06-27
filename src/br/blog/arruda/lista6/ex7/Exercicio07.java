package br.blog.arruda.lista6.ex7;

import br.blog.arruda.lista6.ex6.Produto;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Exercicio07 {

    public static void main(String[] args) throws IOException {
        ObjectInputStream ois = new ObjectInputStream( new FileInputStream("produtos"));
        
        try {
            ArrayList<Produto> listProdutos= (ArrayList<Produto>) ois.readObject();
            ois.close();
            for(Produto produto : listProdutos){
                System.out.println("*******");
                System.out.println(produto.getNome());
                System.out.println(produto.getCodigo());
                System.out.println(produto.getPreco());
            }
        } catch (ClassNotFoundException ex) {
        }
        
        ois.close();

    }
}
