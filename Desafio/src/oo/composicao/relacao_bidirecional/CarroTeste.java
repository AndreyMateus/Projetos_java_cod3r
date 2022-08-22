package oo.composicao.relacao_bidirecional;

public class CarroTeste {
    public static void main(String[] args) {

        Carro c1 = new Carro();

        System.out.println(c1.estaLigado());

        c1.ligar();
        System.out.println(c1.estaLigado());


        System.out.printf("%.2f \n", c1.motor.fatorInjecao);
        c1.acelerar();

        c1.acelerar();
        System.out.printf("%.2f \n", c1.motor.fatorInjecao);

        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        System.out.printf("%.2f \n", c1.motor.fatorInjecao);

        //Relação bidirecional
        System.out.println(c1.motor.carro.motor.carro.motor.giros());

        // Faltou Encapsulamento!!
        // c1.motor.fatorInjecao = -30; // não posso conseguir fazer isso

    }
}
