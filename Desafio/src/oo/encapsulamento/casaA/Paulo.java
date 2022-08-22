package oo.encapsulamento.casaA;

public class Paulo {
    Ana esposa = new Ana();

    void testeAcessos() {
        //System.out.println(a1.segredo); //privado/private
        System.out.println(esposa.facoDentroDeCasa);
        System.out.println(esposa.formaDeFalar);
        System.out.println(esposa.todosSabem);
    }


}
