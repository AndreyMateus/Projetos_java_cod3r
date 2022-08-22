package dificuldade_poo_composicao;

public class Carro {
    //Atributo de instância
    //Motor motor = new Motor();//iniciando o TIPO motor com seu valor padrão.
    //OU
    final Motor motor; //valor NULL/NULO

    Carro(){
        this.motor = new Motor(this);// o this faz referência a própria classe em que ele está dentro, aqui ele faz referência a classe carro, ou seja: this == new Carro();
    }


    void acelerar() {
        if(this.motor.fatorInjecao < 2.5){
            this.motor.fatorInjecao += 0.4;
        }
    }
    void frear() {
        if(this.motor.fatorInjecao > 0.5){
            this.motor.fatorInjecao -= 0.4;
        }
    }

    void ligar() {
        //ligando o motor
        this.motor.ligado = true;
    }

    void desligar() {
        //desligando o motor
        this.motor.ligado = false;
    }

    boolean estaLigado(){
        return this.motor.ligado;
    }
}
