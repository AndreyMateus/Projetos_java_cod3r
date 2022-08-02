package desafiopessoa;

public class Pessoa {

    String name;
    double peso;

    // Construtor padrão
    Pessoa() {

    }

    Pessoa(String name, double peso) {
        this.name = name;
        this.peso = peso;
    }

    //Passando objeto do TIPO Comida como parâmetro
    void comer(Comida comida) {
        if (comida != null) {
            this.peso += comida.peso;
        }

    }

    void apresentar(){
        System.out.println("Olá, eu sou " + name + " e peso " + peso + "Kgs.");
    }

}
