package oo.abstrato;

public abstract class Mamifero extends  Animal {
    public abstract String mamar();

    @Override
    //um método FINAL - NÃO pode ser sobreescrito por sub-classes.
    public final String mover(){
        return "saindo do lugar";
    }
}
