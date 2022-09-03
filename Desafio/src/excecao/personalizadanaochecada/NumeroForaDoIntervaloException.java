package excecao.personalizadanaochecada;

public class NumeroForaDoIntervaloException extends RuntimeException{
    //imagine uma CLASSE onde não pode haver número negativo, uma DATA ou HORA.

    private  String nomeDoAtributo;

    public NumeroForaDoIntervaloException(String nomeDoAtributo){
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage() {
        return String.format("O atributo '%s' está negativo", nomeDoAtributo);
    }

}
