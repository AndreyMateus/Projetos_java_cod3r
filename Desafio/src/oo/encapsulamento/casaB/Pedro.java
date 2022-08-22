package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {



    void testeAcessos() {
        //System.out.println(a1.segredo); //privado/private
        //System.out.println(a1.facoDentroDeCasa); //package - não está dentro do mesmo pacote
        System.out.println(formaDeFalar);//protected - acessado via herança, através da própria classe.
        System.out.println(todosSabem);// public - visível a todos
    }


}
