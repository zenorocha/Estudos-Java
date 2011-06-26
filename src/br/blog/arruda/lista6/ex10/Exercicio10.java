package br.blog.arruda.lista6.ex10;

import br.blog.arruda.lista6.ex10.DAO.ProdutoDAOSerBinaria;
import br.blog.arruda.lista6.ex10.DAO.ProdutoDAOXML;
import br.blog.arruda.lista6.ex10.DAO.ProdutoDAOXML;
import br.blog.arruda.lista6.ex6.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Exercicio10 {

    public static void main(String[] args) {
        ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
        for (int i = 0; i < 3; i++) {
            Produto p = new Produto("nome " + i + 1, i + 1, new Double(i + 1 * 100));
            listaProdutos.add(p);
        }

        Scanner scanner = new Scanner(System.in);
        Class c = null;
        ProdutoDAOXML pDAOXml = new ProdutoDAOXML();
        ProdutoDAOSerBinaria pDAOBin = new ProdutoDAOSerBinaria();

        System.out.println("Escolha qual DAO deseja usar: ");
        System.out.println(pDAOXml.getClass());
        System.out.println(pDAOBin.getClass());
        
        try {
            c = Class.forName(scanner.nextLine());
        } catch (ClassNotFoundException ex) {
            System.out.println("classe não existente.");
            return;
        }

        if (c.isInstance(pDAOBin)) {
            System.out.println(pDAOBin.armazena(listaProdutos));

        } else if (c.isInstance(pDAOXml)) {
            System.out.println(pDAOXml.armazena(listaProdutos));

        }




    }
}