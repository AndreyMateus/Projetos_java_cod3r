package oo.heranca.desafio;

public class Carro {
    protected double velocidadeAtual;
    public final int VELOCIDADE_MAXIMA;// Um dado público que NUNCA muda não tem problema.
    private int delta = 5;


    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    protected Carro() {
        this(300);
    }

    protected Carro(int velocidadeMaxima) {
        this.VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar() {
        if (this.velocidadeAtual + getDelta()> VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            this.velocidadeAtual += getDelta();
        }
    }

    public void frear() {
        if (this.velocidadeAtual > 5) {
            this.velocidadeAtual -= 5;
        } else {
            velocidadeAtual = 0;
        }
        return;
    }

    public String toString() {
        return "Essa é a velocidade atual " + velocidadeAtual + " Km/h";
    }
}
