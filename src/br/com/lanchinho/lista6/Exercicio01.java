/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lista6;

import java.io.File;

/**
 *
 * @author LABCCET
 */
public class Exercicio01 {
    public static void main(String[] args){
       File diretorio = new File("C:/Users/Guilherme/Documents/NetBeansProjects/Lista6");

       String [] arquivos = diretorio.list();
       for(String umArquivo : arquivos)
           System.out.println(umArquivo);

       File[] fileList = diretorio.listFiles();
       for(File aFile : fileList){

           System.out.println(aFile.getAbsolutePath());
           System.out.println(aFile.getName());
           System.out.println("É arquivo? " + aFile.isFile());
           System.out.println("Tamanho: " + aFile.getTotalSpace() + " bytes");
           System.out.println("Data de ultima modificação: " + aFile.lastModified());
        }
       File x = new File("build.xml");
       System.out.println("Aqrvuio build.xml existe? " + x.exists());




    }

}
