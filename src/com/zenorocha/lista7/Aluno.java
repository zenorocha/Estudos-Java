/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zenorocha.lista7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author zeno
 */
public class Aluno {

    private String nome;
    private HashSet<Disciplina> disciplinas;
    private HashMap<String, ArrayList<Integer>> notas;

    public Aluno() {}

    public Aluno(String nome) {
        this.nome = nome;
        this.disciplinas = new HashSet<Disciplina>();
        this.notas = new HashMap<String, ArrayList<Integer>>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private void adicionaDisciplina(Disciplina d) {
        this.disciplinas.add(d);
    }

    private void removeDisciplina(Disciplina d) throws Exception {

        if (!this.disciplinas.contains(d)) {
            throw new Exception("O aluno não esta inscrito na disciplina");
        }

        this.disciplinas.remove(d);
        this.notas.remove(d.getCodigo());
        
    }

    private void adicionaNota(Disciplina d, int nota) throws Exception {

        if (!this.disciplinas.contains(d)) {
            throw new Exception("Aluno não cadastrado nessa disciplina.");
        }

        if (nota < 0 || nota > 100) {
            throw new Exception("Valores irreais.");
        }

        this.notas.get(d.getCodigo()).add(nota);
    }

    private void mudaNota(Disciplina d, int numero, int novaNota) throws Exception {

        if (!this.disciplinas.contains(d)) {
            throw new Exception("Aluno não cadastrado nessa disciplina.");
        }

        if (novaNota < 0 || novaNota > 100) {
            throw new Exception("Valores irreais.");
        }

        this.notas.get(d.getCodigo()).add(numero, novaNota);
    }

    private void removeNota(Disciplina d, int numero) throws Exception {
        
        if (!this.disciplinas.contains(d)) {
            throw new Exception("Aluno não cadastrado nessa disciplina.");
        }

        if (this.notas.get(d.getCodigo()).indexOf(numero) == -1) {
            throw new Exception("Nota não encontrada.");
        }
        
        this.notas.get(d.getCodigo()).remove(numero);
    }

    private double media(Disciplina d) throws Exception {

        int totalDeNotas = this.notas.get(d.getCodigo()).size();

        if (!this.disciplinas.contains(d)) {
            throw new Exception("Aluno não cadastrado nessa disciplina.");
        }

        if (totalDeNotas == 0) {
            throw new Exception("Não há notas cadastradas");
        }

        int soma = 0;

        for (int i = 0; i < totalDeNotas; i++) {
            soma += this.notas.get(d.getCodigo()).get(i);
        }

        return soma / totalDeNotas;
    }

    private double mediaGeral() throws Exception {

        int soma = 0;
        int iterator = 0;

        if (disciplinas == null) {
            throw new Exception("Aluno não cadastrado em nenhuma disciplina.");
        }

        for (Disciplina disciplina : disciplinas) {
            soma += media(disciplina);
        }

        return soma / disciplinas.size();
    }

}
