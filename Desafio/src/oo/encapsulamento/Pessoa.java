package oo.encapsulamento;

public class Pessoa {
    private String nome;
    private int idade;
    public Pessoa(String nome,String sobrenome, int idade) {
        setIdade(idade);
        setNome(nome);
        setSobrenome(sobrenome);
    }

    private String sobrenome;


    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Getter
    public int getIdade() {
        return idade;
    }
    public String getNomeCompleto(){
        return getNome() + getSobrenome();
    }
    //Setter
    public void setIdade(int idade) {
        idade = Math.abs(idade);// Math.abs transforma qualquer valor negativo em positivo.
        if (idade >= 0 && idade <= 120) {
            this.idade = idade;
        }
        return;
    }

    public String toString() {
        return "Olá eu sou o " + getNome() + " e tenho " + getIdade() + " anos.";
    }

}
