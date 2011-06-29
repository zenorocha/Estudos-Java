/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio11;

/**
 *
 * @author Guilherme
 */
public class testeAluno {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Joana");
        Aluno a2 = new Aluno("Marcelo");
        Disciplina d1 = new Disciplina("D01", "PCS");
        Disciplina d2 = new Disciplina("D02", "EDD1");

        a1.adicionaDisciplina(d1);
        a1.adicionaDisciplina(d2);

        a2.adicionaDisciplina(d1);
        try {
            a1.adicionaNota(d1, 90);
            a1.adicionaNota(d1, 80);
            a1.adicionaNota(d2, 70);

            System.out.println(a1.media(d1));
            System.out.println(a1.mediaGeral());

            a1.mudaNota(d1, 0, 95);

            System.out.println(a1.media(d1));
            System.out.println(a1.mediaGeral());
            a1.removeNota(d2, 0);

            a1.adicionaNota(d2, 60);
            a1.adicionaNota(d2, 90);

            System.out.println(a1.media(d2));
            System.out.println(a1.mediaGeral());
            try {
                a2.removeDisciplina(d2);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            try {
                a2.adicionaNota(d2, 100);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

            try {
                //Tente mudar a quinta nota de PCS da aluna Joana para 100 (deve receber uma exceção)
                a1.mudaNota(d1, 4, 100);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

            try {
                //Tente mudar a segunda nota de PCS da aluna Joana para 200 (deve receber uma exceção)
                a1.mudaNota(d1, 1, 200);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

            try {
                a1.mudaNota(d1, 1, -10);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            try {
//            Tente obter a media de Marcelo na disciplina PCS (deve receber uma exceção)
//            Tente obter a media geral de Marcelo (deve receber uma exceção)
                a2.media(d1);
                a2.mediaGeral();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

            try {
                /*Adicione a disciplina D02 a Marcelo.
                Tente obter a media de Marcelo na disciplina ED1 (deve receber uma exceção)
                Tente obter a media geral de Marcelo (deve receber uma exceção)*/
                a2.adicionaDisciplina(d2);
                a2.media(d2);
                a2.mediaGeral();


            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
