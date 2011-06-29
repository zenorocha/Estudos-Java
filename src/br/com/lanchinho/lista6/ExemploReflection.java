/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista6;

import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LABCCET
 */
public class ExemploReflection {

    public static void main(String[] args) {
        ProdutoEspecial[] p = new ProdutoEspecial[3];
        p[0] = new ProdutoEspecial(9, "CERVEJA", 1.65);
        p[1] = new ProdutoEspecial(10, "HD", 135.00);
        p[2] = new ProdutoEspecial(11, "Monitor", 335.00);

        try {
            Object p1 = Class.forName("lista6.ProdutoEspecial").newInstance();
            Method m;
            m = p1.getClass().getDeclaredMethod("setCodigo", Integer.TYPE);
            m.invoke(p1, 10);
            m = p1.getClass().getDeclaredMethod("setNome", String.class);
            m.invoke(p1, "NomeXPTO");
            m = p1.getClass().getDeclaredMethod("setPreco", Double.TYPE);
            m.invoke(p1, 6.00);

            ProdutoEspecial pEsp = (ProdutoEspecial) p1;
            System.out.println(pEsp.getCodigo());
            System.out.println(pEsp.getNome());
            System.out.println(pEsp.getPreco());


        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(ExemploReflection.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
}
