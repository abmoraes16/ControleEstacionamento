package challenge;

import java.util.stream.Stream;

public class Motorista {
    private String nome;
    private int idade;
    private int pontos;
    private String habilitacao;

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public String getHabilitacao() {
        return habilitacao;
    }

    public void setHabilitacao(String habilitacao) {
        this.habilitacao = habilitacao;
    }

    private Carro carro;

    public Motorista(String name, int idade, int pontos, String habilitacao) {
        this.nome = name;
        this.idade = idade;
        this.pontos = pontos;
        this.habilitacao = habilitacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getPontos() {
        return pontos;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public static MotoristaBuilder builder(){
        return new MotoristaBuilder();
    }


}
