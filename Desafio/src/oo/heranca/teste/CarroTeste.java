package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Fusca;

public class CarroTeste {
    public static void main(String[] args) {

        Ferrari f1 = new Ferrari(400);

        Carro c1 = new Fusca();

//        System.out.println(f1.velocidadeAtual);
//        System.out.println(c1.velocidadeAtual);

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.frear();
//        System.out.println(c1.velocidadeAtual);
        f1.ligarTurbo();
        f1.acelerar();
        f1.acelerar();
        f1.frear();
//        System.out.println(f1.velocidadeAtual);

        System.out.println(f1.velocidadeDoAr());
    }
}
