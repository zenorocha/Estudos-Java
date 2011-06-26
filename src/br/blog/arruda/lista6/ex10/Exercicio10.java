package br.blog.arruda.lista6.ex10;

import br.blog.arruda.lista6.ex10.DAO.ProdutoDAOSerBinaria;
import br.blog.arruda.lista6.ex10.DAO.ProdutoDAOXML;
import br.blog.arruda.lista6.ex6.*;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
        for (int i = 0; i < 3; i++) {
            Produto p = new Produto("nome " + i + 1, i + 1, new Double(i + 1 * 100));
            listaProdutos.add(p);
        }

        Scanner scanner = new Scanner(System.in);
        Class c = null;

        System.out.println("Escolha qual DAO deseja usar: ");
        System.out.println(ProdutoDAOXML.class);
        System.out.println(ProdutoDAOSerBinaria.class);

        try {
            c = Class.forName(scanner.nextLine());
        } catch (ClassNotFoundException ex) {
            System.out.println("classe não existente.");
            return;
        }



        Method meth = null;
        try {
            meth = c.getMethod("armazena", listaProdutos.getClass());
        } catch (NoSuchMethodException ex) {
            System.out.println("a");
            
        } catch (SecurityException ex) {
        }
        try {

            Object invoke = meth.invoke(c.newInstance(), listaProdutos);
            System.out.println((boolean) invoke);
        } catch (Throwable ex) {
        } 

    }
}