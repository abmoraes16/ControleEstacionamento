package challenge;

import java.util.stream.Stream;

public class CarroBuilder {
    private String placa;
    private Cor cor;
    private Motorista motorista;

    public CarroBuilder withCor(Cor cor) {
        this.cor = cor;
        return this;
    }

    public CarroBuilder withPlaca(String placa) {
        this.placa = placa;
        return this;
    }

    public CarroBuilder withMotorista(Motorista motorista) {
        this.motorista = motorista;
        return this;
    }

    public Carro build(){
        Stream.of(placa).findAny().orElseThrow(NullPointerException::new);
        Stream.of(cor).findAny().orElseThrow(NullPointerException::new);

        return new Carro(this.placa,this.cor,this.motorista);
    }
}
