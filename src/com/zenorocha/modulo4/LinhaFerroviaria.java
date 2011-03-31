package com.zenorocha.modulo4;

public class LinhaFerroviaria {
    public int numero;
    public Recurso[] recursosEstacionados;

    public LinhaFerroviaria(Recurso[] recursos) {
        this. recursosEstacionados = recursos;
    }

    public int getOcupacao() {
        int ocupacao = 0;
        for (int i = 0; i < recursosEstacionados.length; i++) {
            if (recursosEstacionados[i] instanceof Vagao)
                ocupacao = ocupacao + ((Vagao) recursosEstacionados[i]).comprimentoEngates + ((Vagao) recursosEstacionados[i]).comprimentoTesteiras;
            else if (recursosEstacionados[i] instanceof Locomotiva)
                ocupacao = ocupacao + ((Locomotiva) recursosEstacionados[i]).comprimento;
            else {
                Trem trem = ((Trem) recursosEstacionados[i]);
                for (int j = 0; j < trem.recursosDoTrem.length; j++) {
                    if (trem.recursosDoTrem[j] instanceof Vagao)
                        ocupacao = ocupacao + ((Vagao) trem.recursosDoTrem[j]).comprimentoEngates + ((Vagao) trem.recursosDoTrem[j]).comprimentoTesteiras;
                    else if (trem.recursosDoTrem[j] instanceof Locomotiva)
                        ocupacao = ocupacao + ((Locomotiva) trem.recursosDoTrem[j]).comprimento;
                }
            }
        }

        return ocupacao;
    }
}
