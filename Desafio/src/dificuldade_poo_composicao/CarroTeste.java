package dificuldade_poo_composicao;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(  carro.estaLigado());
        carro.ligar();
        System.out.println(carro.estaLigado());
        System.out.println(carro.motor.giros());
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        System.out.println(carro.motor.giros());
        carro.frear();
        carro.frear();
        carro.frear();
        carro.frear();
        carro.frear();
        carro.frear();
        System.out.println(carro.motor.giros());


        //Faltou Encapsulamento!!
        // c1.motor.fatorInjecao = -30;

        //Relação bidirecional -  só é usada quando necessária, pois tira a coerência/sentido do código.
        carro.motor.carro.motor.carro.motor.giros();//
    }
}
