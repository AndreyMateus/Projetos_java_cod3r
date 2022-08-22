package oo.heranca;

public class Monstro extends Jogador {
   public Monstro() {
        super(0, 0);
    }

    public Monstro(int x, int y) {
        super(x, y);
    }
    @Override
    public boolean atacar(Jogador oponente){
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

}
