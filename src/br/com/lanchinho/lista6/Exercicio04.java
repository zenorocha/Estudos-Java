/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista6;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Texto                     |  Binario
 * File Reader / writer      | FileInputStream/ OutputStream
 * Buffered Reader / writer  | BufferedInputStream/ OutputStream
 * PrintWtriter              | DataOutputStream/ InputStream
 * 
 */
public class Exercicio04 {

    public static void main(String[] args) {
        //byte[] bytes = {10, 30, 45, 78, 20, 45};
        int[] numeros = {100, 500, 200, 5, 88};
        /*FileOutputStream ostream = null;
         ou BufferedOutputStream ostream = null;*/
        DataOutputStream ostream = null;
        try {
           // ostream = new FileOutputStream("arq.dat");
          //ostream = new BufferedOutputStream(new FileOutputStream("arq.dat"), 4096);
            ostream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("arq.dat"), 4096));
            for(int i = 0; i < numeros.length; i++)
                ostream.writeInt(numeros[i]);
            //ostream.write(bytes);
            ostream.close();
        } catch (IOException ex) {
            System.out.println("deu zebra");
            ex.printStackTrace();
        }

    }
}
