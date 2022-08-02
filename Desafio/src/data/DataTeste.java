package data;

public class DataTeste {
    public static void main(String[] args) {

    Data data = new Data();
    //String dataStringReturnMethod = data.obterDataFormatada();
    //System.out.println(dataStringReturnMethod);
    data.imprimirDataFormada(); 

    Data data2 = new Data(31,03,2000);
    //String dataStringReturnMethod2 = data2.obterDataFormatada();
    //System.out.println(dataStringReturnMethod2);
    data2.imprimirDataFormada();




    }
}
