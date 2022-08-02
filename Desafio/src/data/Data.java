package data;

public class Data {
    public Integer dia = 20;
    public Integer mes;
    static public Integer ano;

    // Construtor padrão
    public Data() {
        // dia = 1;
        // mes = 1;
        // ano = 1970;
        // Em métodos contrutores o THIS pode ser usado como um MÉTODO THIS(), e serve para chamar o próprio CONSTRUTOR, oque vai definir qual dos contrutores será chamado é o TIPO E ORDEM dos PARÂMETROS.
        this(1, 1, 1970);
    }

    // Construtor personalizado
    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano; 
    }

    public String obterDataFormatada() {
        String dia = this.dia.toString();
        String mes = this.mes.toString();
        String ano = this.ano.toString();
        String tudo = dia + " " + mes + " " + ano;
        return tudo;
    }
    
    // Essa seria uma segundo opção para o mesmo código acima
    String obterDataFormatada2() {
        // esse método formart transforma os parâmetros em strings
        final String formato = "%d %d %d";// é uma constante pois eu não vou alterar ela futuramente
        return String.format(formato,"%d %d %d \n", dia, mes, ano);
    }

    // Não esqueça que funções podem chamar funções dentro de outras funções
    void imprimirDataFormada() {
        // evitar usar o comando System.out.print ou qualquer comando de print dentro de
        // uma função
        // retorne o valor e não printe ele
        // esse mesmo método aqui não seria utilizado em aplicações desktop,mobile, web
        // e etc, somente em projetos de puro console.
        System.out.println(this.obterDataFormatada());
    }

}
