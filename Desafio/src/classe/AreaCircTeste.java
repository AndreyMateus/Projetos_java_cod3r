package classe;

import java.awt.geom.Area;

public class AreaCircTeste{
    public static void main(String[] args) {

        AreaCirc a1 = new AreaCirc(5.6);
        System.out.println(a1.area());

        AreaCirc a2 = new AreaCirc(5.6);
        System.out.println(a2.area());

        // Acessando o valor de PI que está associada a classe e modificando o valor.
        AreaCirc.pi = 20;

        System.out.println(AreaCirc.PI2);
        System.out.println(AreaCirc.area(4));

    }
}
