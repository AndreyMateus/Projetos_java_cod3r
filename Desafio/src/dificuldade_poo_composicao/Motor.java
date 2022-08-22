package dificuldade_poo_composicao;

public class Motor {
    //Relação bidirecional
    final Carro carro; //objeto com valor nulo/null
    boolean ligado = false;
    double fatorInjecao = 1;

    Motor(Carro carro){
        this.carro = carro;
    }


    int giros(){
        if(!ligado){
            return 0;
        }else{
        //A Math.round()função retorna o valor de um número arredondado para o inteiro mais próximo.
        return (int)Math.round(fatorInjecao * 3000);
        }
    }


}
