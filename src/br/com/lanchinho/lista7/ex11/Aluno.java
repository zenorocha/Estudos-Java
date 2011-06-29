/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio11;

import java.util.*;

/**
 *
 * @author Guilherme
 */
public class Aluno {

    public String nome;
    Set<Disciplina> disciplinas;
    Map<String, List<Integer>> notas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno(String nome) {
        this.nome = nome;
        disciplinas = new HashSet<Disciplina>();
        notas = new HashMap<String, List<Integer>>();
    }

    public Aluno() {
        this.nome = null;
        disciplinas = new HashSet<Disciplina>();
        notas = new HashMap<String, List<Integer>>();
    }

    public Set<Disciplina> getDisciplina() {
        return disciplinas;
    }

    public Map<String, List<Integer>> getNotas() {
        return notas;
    }

    public void adicionaDisciplina(Disciplina d) {
        disciplinas.add(d);
    }

    public void removeDisciplina(Disciplina d) throws Exception {
        if (!disciplinas.contains(d)) {
            throw new Exception("O aluno não esta inscrito na disciplina");
        }
        disciplinas.remove(d);
        notas.remove(d.getCodigo());

    }

    public void adicionaNota(Disciplina d, int nota) throws Exception {
        if (!disciplinas.contains(d)) {
            throw new Exception("O aluno não esta inscrito na disciplina");
        }
        if (nota < 0 || nota > 100) {
            throw new Exception("Nota invalida");
        }

        List<Integer> notaDisciplina = notas.get(d.getCodigo());

        if (notaDisciplina == null) {
            notaDisciplina = new LinkedList<Integer>();
            notas.put(d.getCodigo(), notaDisciplina);
        }
        notaDisciplina.add(nota);

    }

    public void mudaNota(Disciplina d, int numero, int novaNota) throws Exception {
        List<Integer> notaDisciplina = notas.get(d.getCodigo());
        if (!disciplinas.contains(d)) {
            throw new Exception("O aluno não esta inscrito na disciplina");
        }
        if (novaNota < 0 || novaNota > 100) {
            throw new Exception("Nota invalida");
        }
        if (numero > notaDisciplina.size()) {
            throw new Exception("Não há nota nessa posição");
        }
        notaDisciplina.remove(numero);
        adicionaNota(d, novaNota);


    }

    public boolean removeNota(Disciplina d, int numero) throws Exception {
        if (!disciplinas.contains(d)) {
            throw new Exception("Aluno nao esta matriculado");
        }
        List<Integer> notaDisciplina = notas.get(d.getCodigo());
        if (numero > notaDisciplina.size()) {
            throw new Exception("Disciplina nao contem notas");
        }
        notaDisciplina.remove(numero);
        return true;
    }

    public double media(Disciplina d) throws Exception {
        double media = 0.0;
        if (!disciplinas.contains(d)) {
            throw new Exception("Aluno nao esta matriculado");
        }
        List<Integer> notaDisciplina = notas.get(d.getCodigo());
        if (notaDisciplina == null) {
            throw new Exception("Disciplina " + d.getNome() + " do aluno " + nome + " não contem notas");
        }
        for (Integer nota : notaDisciplina) {
            media += nota;
        }
        return media / notaDisciplina.size();
    }
    
        public double mediaGeral() throws Exception{
        if (disciplinas == null)
            throw new Exception("Aluno " + nome + "nao cadastrado em nenhuma disciplina");
        double media = 0;
        for (Disciplina disciplina : disciplinas) {
            media+= media(disciplina);
        }

        return media/disciplinas.size();
    }
}
