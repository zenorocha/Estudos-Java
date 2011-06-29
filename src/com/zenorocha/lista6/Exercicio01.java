/*
 * Lista 6
 * Projeto e Construção de Sistemas
 * Professor: Alexandre Correa
 *
 * Implementado por Zeno Rocha
 * Em 28/06/2011
 *
 * --------------------------------------------------------------------------------------------
 *
 * Exercício 1
 *
 *	Faça um programa que liste os arquivos existentes no diretório estabelecido pelo usuário
 *      e liste o nome, tamanho e data da última modificação de todos os arquivos existentes
 *      neste diretório.
 * 
 */

package com.zenorocha.lista6;

import java.io.File;
import java.util.Scanner;

public class Exercicio01 {

    public static void main (String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.print("Entre com o diretório escolhido: ");
        String dir = input.next();

        File diretorio = new File(dir);

        File[] arquivos = diretorio.listFiles();

        for (int i = 0; i < arquivos.length; i++) {
            System.out.println("\nNome: " + arquivos[i].getName());
            System.out.println("Tamanho: " + arquivos[i].getTotalSpace() + " bytes");
            System.out.println("Última modificação: " + arquivos[i].lastModified());
        }

    }

}
