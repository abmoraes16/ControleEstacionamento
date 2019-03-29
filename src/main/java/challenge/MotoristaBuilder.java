package challenge;

import java.util.Objects;
import java.util.stream.Stream;

public class MotoristaBuilder {

    private String nome;
    private int idade;
    private int pontos;
    private String habilitacao;

    public Motorista build(){
        Stream.of(nome).findAny().orElseThrow(NullPointerException::new);
        Stream.of(habilitacao).findAny().orElseThrow(NullPointerException::new);

        return new Motorista(nome,idade,pontos,habilitacao);
    }

    public MotoristaBuilder withNome(String name) {
        this.nome = name;
        return this;
    }

    public MotoristaBuilder withIdade(int idade) {
        Stream.of(idade).filter(x->x>0).findAny().orElseThrow(IllegalArgumentException::new);
        this.idade = idade;
        return this;
    }

    public MotoristaBuilder withPontos(int pontos) {
        Stream.of(pontos).filter(x->x>0).findAny().orElseThrow(IllegalArgumentException::new);
        this.pontos = pontos;
        return this;
    }

    public MotoristaBuilder withHabilitacao(String habilitacao) {
        this.habilitacao = habilitacao;
        return this;
    }

}
