package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {


    void testeAcessos() {
        Ana sogra = new Ana();
        //System.out.println(a1.segredo); //privado/private
        //System.out.println(a1.facoDentroDeCasa); //package - não está dentro do mesmo pacote
        //System.out.println(formaDeFalar);//protected - acessado via herança, porém aqui NÃO HÁ HERANÇA.
        System.out.println(sogra.todosSabem);// public - visível a todos
    }

}
