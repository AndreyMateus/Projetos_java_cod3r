package oo.polimorfismo;

public class Comida {
    private double peso;
    public Comida(){
    }
    public Comida(double peso){
        setPeso(peso);
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        peso = Math.abs(peso);
        if(peso >= 0){
            this.peso = peso;
        }
    }
}
