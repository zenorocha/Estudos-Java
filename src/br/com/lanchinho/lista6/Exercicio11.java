/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista6;

import java.lang.reflect.*;

/**
 *
 * @author Guilherme
 */
public class Exercicio11 {

    public static void main(String[] args) {
        Produto p = new Produto();
        
         System.out.println("INFORMAÇÕES DAS OPERAÇÕES: ");

        try {
            Class cls = Class.forName("lista6.Produto");
            Method methlist[] = cls.getDeclaredMethods();

            for (int i = 0; i < methlist.length; i++) {
                Method m = methlist[i];
                System.out.print(Modifier.toString(m.getModifiers()) + " " 
                        + m.getReturnType() + " " +m.getName());
                System.out.println(" ");     
            }
            
            System.out.println("--------------------------");
            System.out.println("INFORMAÇÕES DOS ATRIBUTOS: ");

            Field fieldlist[] = cls.getDeclaredFields();
            for (int i = 0; i < fieldlist.length; i++) {
                Field fld = fieldlist[i];
                System.out.println("nome atributo = " + fld.getName());
                System.out.println("tipo = " + fld.getType());
                int mod = fld.getModifiers();
                System.out.println("modificadores = " + Modifier.toString(mod));
                System.out.println("-----");

            }

        } catch (Throwable e) {
            System.err.println(e);
        }

        for (Constructor c : p.getClass().getConstructors()) {
            System.out.print(Modifier.toString(c.getModifiers()));
            System.out.print(" " + c.getDeclaringClass().getSimpleName() + "(");
            for (int i = 0; i < c.getParameterTypes().length; i++) {
                if (i > 0) {
                    System.out.print(",");
                }
                System.out.print(c.getParameterTypes()[i].getSimpleName());

            }
            System.out.println(");");

        }

    }
}
