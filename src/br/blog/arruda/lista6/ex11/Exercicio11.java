package br.blog.arruda.lista6.ex11;

import br.blog.arruda.lista6.ex6.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Exercicio11 {

    public static void main(String[] args) {
        Produto p = new Produto("nome ", 1, new Double(1 * 100));
        Class c = p.getClass();

        for(Field field : c.getDeclaredFields()){
            System.out.println(field.getName());            
        }
        for(Method method : c.getDeclaredMethods()){
            System.out.println(method.getName());            
        }

    }
}