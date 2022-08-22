package oo.heranca;

public class Jogador {
    public int vida = 100;
   public int x; //posição
    public int y; //posição


    protected Jogador(int posicaoX, int posicaoY){
        this.x = posicaoX;
        this.y = posicaoY;
    }

    protected boolean atacar(Jogador oponente){
        int deltaX = Math.abs(x - oponente.x);//Math.abs() - retorna um número/resultado positivo, somente números/resultados positivos.
        int deltaY = Math.abs(y - oponente.y);//Math.abs() - retorna um número/resultado positivo, somente números/resultados positivos.

        if(deltaX == 0 && deltaY == 1){
            oponente.vida -= 10;
            return true;
        }else if(deltaX ==1 && deltaY ==0){
            oponente.vida  -= 10;
            return true;
        }else{
            return false;
        }
    }

    boolean andar(Direcao direcao) {
       switch(direcao){
           case NORTE -> y--;
           case SUL -> y++;
           case LESTE -> x++;
           case OESTE -> x--;
       }
        return true;
    }
    boolean andarSegundaOpcao(Direcao direcao) {
        switch(direcao){
            case NORTE:
                y--;
                break;
            case OESTE:
                x--;
                break;
            case LESTE:
                x++;
                break;
            case SUL:
                y++;
                break;
        }
        return true;
    }




}
