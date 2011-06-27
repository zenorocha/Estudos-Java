package br.blog.arruda.lista6;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        

        String dir = scanner.nextLine();

        File diretorio = new File(dir);
        File fList[] = diretorio.listFiles();

        System.out.println("Numero de arquivos no diretorio : " + fList.length);

        for (int i = 0; i < fList.length; i++) {
            
            System.out.println("*****");
            System.out.println("Nome: "+fList[i].getName());
            System.out.println("Tamanho: " + fList[i].length() );
            System.out.println("Data Alteracao: " + new Date(fList[i].lastModified()));
        }
    }
}
