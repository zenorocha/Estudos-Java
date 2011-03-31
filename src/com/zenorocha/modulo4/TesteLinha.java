package com.zenorocha.modulo4;

public class TesteLinha {
    public static void main(String[] args) {
        Locomotiva l1 = new Locomotiva(50);
        Locomotiva l2 = new Locomotiva(30);
        Vagao[] vagoes = { new Vagao(10, 10), new Vagao(10, 20), new Vagao(10, 20) };
        Vagao v1 = new Vagao(20, 20);
        Recurso[] recursosTrem = new Recurso[] { l1, vagoes[0], vagoes[1], vagoes[2] };
        Trem trem = new Trem(recursosTrem);
        Recurso[] recursosEstacionados = new Recurso[] { l2, v1, trem };
        LinhaFerroviaria linha = new LinhaFerroviaria(recursosEstacionados);
        System.out.println("ocupacao da linha = " + linha.getOcupacao());
    }
}
