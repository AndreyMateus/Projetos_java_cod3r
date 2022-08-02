package classe;
import data.Data;
public class ValorVsReferencia {
    public static void main(String[] args) {

        double a = 2;
        double b = a;// atribuição por valor

        a++;
        b--;
        System.out.println(a + " "+b);

        Data d1 = new Data();
        Data d2 = d1;// atribuição por referência

        d1.dia = 31;
        d2.mes = 12;
        d1.ano = 2025;

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        //
        int c = 5;
        alterarPrimitivo(c);
        // a variável não será alterada pelo método, pois quando é um valor primitivo é passado, é gerada uma cópia dessa variável com o valor, diferente de uma atribuição por referência.
        System.out.println(c);

    }

    static void voltarDataParaValorPadrão(Data d){
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;// valor padrão iunix
    }

    static void  alterarPrimitivo(int c){
        c++;
    }

}
