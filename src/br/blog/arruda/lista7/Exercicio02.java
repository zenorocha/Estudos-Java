package br.blog.arruda.lista7;

import java.beans.XMLEncoder;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        FileOutputStream os=null;
        try {
            os = new FileOutputStream("inteiros.xml");
        } catch (FileNotFoundException ex) {
            return;
        }
        XMLEncoder encoder = new XMLEncoder(os);
        
        ArrayList<Integer> listaInteiros = new ArrayList<Integer>();
        String str;
        while(!(str = scanner.nextLine()).equals("")){
            int i = Integer.parseInt(str);
            listaInteiros.add(i);
        }
        
        encoder.writeObject(listaInteiros);
        encoder.close();



    }
}