package oo.heranca.desafio;

//O implements é o import da interface
//pode se herdar várias interfaces, o nome de cada uma é separado por vírgula interfaceUm, interfaceDois
// foco da interface é uma CLASSE poder herdar  de mais de um pai, ou mesmo dizer oque será obrigatório implementar.
public class Ferrari extends Carro implements Esportivo, Luxo {
    private boolean ligarTurbo = false;
    private boolean ligarAr = false;
    public Ferrari() {
        this(315);//valor padrão caso ninguém passe um parâmetro
    }

    public Ferrari(int VELOCIDADE_MAXIMA) {
        super(VELOCIDADE_MAXIMA);
        this.setDelta(15);
    }

    //    @Override //serve para avisar se o MÉTODO ABAIXO existe ou Não, é uma validação do editor, mas não é obrigatório.
//    void acelerar() {
//        super.acelerar();
//    }
    @Override
    public void ligarAr() {
        this.ligarTurbo = true;

    }

    @Override
    public void desligarAr() {
        this.ligarTurbo = false;

    }

    @Override
    public void ligarTurbo() {
        this.ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        this.ligarTurbo = false;
    }

    @Override
    public int getDelta(){
        if(ligarTurbo && !ligarAr){
            return  35;
        }else if(ligarAr && ligarTurbo){
            return 30;
        }else if(!ligarAr && !ligarTurbo){
            return 20;
        }else{
            return 15;
        }
    }
}
