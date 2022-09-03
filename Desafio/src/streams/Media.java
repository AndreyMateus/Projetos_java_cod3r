package streams;

public class Media {

    private double total;
    private int quantidade;

    //retornando a própria instância atual
    public Media adicionar(double valor) {
        total += valor;
        quantidade++;
        return this;// retornando o próprio objeto/classe
    }

    public double getValor() {
        return total / quantidade;//retornando a média
    }

    public static Media combinar(Media m1, Media m2) {
        Media resultante = new Media();
        resultante.total = m1.total + m2.total;
        resultante.quantidade = m1.quantidade + m2.quantidade;
        return resultante;
    }
}
