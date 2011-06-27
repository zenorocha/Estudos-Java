package br.blog.arruda.lista7;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Exercicio03 {

    public static void main(String[] args){
        
        XMLDecoder dec=null;
        try {
            dec = new XMLDecoder(  new BufferedInputStream( new FileInputStream("inteiros.xml")));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Exercicio02.class.getName()).log(Level.SEVERE, null, ex);
        }

        ArrayList<Integer> listInteiros = (ArrayList<Integer>) dec.readObject();
        dec.close();
        int soma=0;
        double media=0.0;
        for (Integer i : listInteiros) {
            soma+=i;            
        }
        media=(double)soma/listInteiros.size();
        System.out.print(media);
        
    }
}