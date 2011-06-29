/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio11;

/**
 *
 * @author Guilherme
 */
public class Disciplina implements Comparable <Disciplina>{
    private String codigo;
    private String nome;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Disciplina(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        return codigo.hashCode() + nome.hashCode();
    }

    public int compareTo(Disciplina d) {

        if (codigo.compareTo(d.codigo) == 0) {
            return nome.compareTo(d.nome);
        } else 
            return codigo.compareTo(d.codigo);
        

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Disciplina outraDisc = (Disciplina) obj;

        return codigo.equals(outraDisc.getCodigo());

    }
}
//
//Exercício 11:
//Crie uma classe Aluno com a seguinte definição:
//Atributos:
// nome : String
// disciplinas : conjunto de objetos da classe Disciplina (Set de Disciplina)
// notas: mapeamento <código disciplina, lista de notas>, ou seja, para cada código
//de disciplina (chave do mapa) existe uma lista de notas do aluno nessa disciplina.
//Exemplo:
//Nome: João
//Disciplinas: [ (T011, Disciplina-1), (T022, Disciplina-2) ]
//Notas: [ (T011, [100, 90, 95]), (T022, [50, 80, 90, 100]) ]
//Operações:
// Construtor recebendo nome
// Operação get/set para nome
// Operação adicionaDisciplina(Disciplina d) que adiciona a disciplina d ao conjunto
//de disciplinas do aluno.
// Operação removeDisciplina(Disciplina d) que remove a disciplina d do conjunto
//de disciplinas do aluno e remove a entrada relativa a essa disciplina da estrutura
//de dados das notas. Se o aluno não estiver inscrito na disciplina d, a operação
//deve arremessar uma exceção.
// Operação adicionaNota(Disciplina d, int nota) que adiciona a nota na lista
//referente ao código da disciplina d. A nota deve ser acrescentada na última
//posição dessa lista. Se o aluno não estiver inscrito na disciplina d ou se a nota for
//< 0 ou > 100, a operação deve arremessar uma exceção.
// Operação mudaNota(Disciplina d, int numero, int novaNota) que modifica a nota
//existente na posição dada pelo parâmetro numero da lista de notas da disciplina
//para a nova nota passada como parâmetro. Se o aluno não estiver inscrito na
//disciplina d ou se não possuir a nota com número de ordem passado como
//parâmetro ou se a novaNota for < 0 ou > 100, a operação deve arremessar uma
//exceção.
// Operação removeNota(Disciplina d, int numero) que remove a nota na lista
//referente ao código da disciplina d presente na posição dada pelo parâmetro
//numero. Se o aluno não estiver inscrito na disciplina ou se não possuir a nota com
//número de ordem passado como parâmetro, a operação deve arremessar uma
//exceção.
// Operação media(Disciplina d) que retorna a média das notas do aluno na
//disciplina d. Se o aluno não possuir notas na disciplina d ou se ele não estiver
//inscrito na disciplina d, a operação deve arremessar uma exceção.
// Operação mediaGeral() que retorna a média das médias do aluno nas suas
//disciplinas. Se o aluno não estiver inscrito em nenhuma disciplina ou se não
//possuir notas em uma das disciplinas em que ele estiver inscrito, a operação deve
//arremessar uma exceção.
//Faça uma outra classe (TesteAluno) que teste a implementação da classe Aluno, com o
//seguinte cenário de execução
//Crie as disciplinas (D01 – PCS) e (D02 – ED1)
//Crie os alunos Joana e Marcelo
//Adicione a disciplina D01 a Joana
//Adicione a disciplina D02 a Joana
//Adicione a disciplina D01 a Marcelo
//Adicione a primeira nota 90 a Joana em PCS
//Adicione a segunda nota 80 a Joana em PCS
//Adicione a primeira nota 70 a Joana em ED1
//Obtenha a media de Joana em PCS (85)
//Obtenha a media geral de Joana (77.5)
//Mude a nota 90 de Joana em PCS para 95
//Obtenha a media de Joana em PCS (87.5)
//Obtenha a media geral de Joana (78.75)
//Remova a primeira nota 70 de Joana em ED1
//Adicione a primeira nota 60 a Joana em ED1
//Adicione a segunda nota 90 a Joana em ED1
//Obtenha a media de Joana em ED1 (75)
//Obtenha a media geral de Joana (81.25)
//Tente remover a disciplina D02 de Marcelo (deve receber uma exceção)
//Tente adicionar a nota 100 na disciplina D02 a Marcelo (deve receber uma exceção)
//Tente mudar a quinta nota de PCS da aluna Joana para 100 (deve receber uma exceção)
//Tente mudar a segunda nota de PCS da aluna Joana para 200 (deve receber uma exceção)
//Tente mudar a segunda nota de PCS da aluna Joana para -10 (deve receber uma exceção)
//Tente remover a quinta nota de PCS da aluna Joana (deve receber uma exceção)
//Tente obter a media de Marcelo na disciplina PCS (deve receber uma exceção)
//Tente obter a media geral de Marcelo (deve receber uma exceção)
//Adicione a disciplina D02 a Marcelo.
//Tente obter a media de Marcelo na disciplina ED1 (deve receber uma exceção)
//Tente obter a media geral de Marcelo (deve receber uma exceção)