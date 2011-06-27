package br.blog.arruda.lista7;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str;
        int soma=0;
        double media=0.0;
        int numInt=0;
        while(!(str = scanner.nextLine()).equals("")){
            int i = Integer.parseInt(str);
            soma+=i;
            numInt++;
        }
        media= (double)soma/numInt;
        System.out.println("soma: " +soma + " media: "+media);
    }
}
