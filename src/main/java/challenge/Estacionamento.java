package challenge;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class Estacionamento {
    private int vagas;
    private List<Carro> carros = new ArrayList<>();

    public void estacionar(Carro carro) {
        Stream.of(carro).filter(x->x.getMotorista()!=null).findAny().orElseThrow(EstacionamentoException::new);
        Stream.of(carro.getMotorista()).filter(x->x.getIdade()>18).findAny().orElseThrow(EstacionamentoException::new);
        Stream.of(carro).filter(x->x.getMotorista().getPontos()<=20).findAny().orElseThrow(EstacionamentoException::new);

        if(carros.size()>=10) {
            carros.stream().filter(x->x.getMotorista().getIdade()<60).findAny().orElseThrow(EstacionamentoException::new);
            carros.add(carro);
            carros.remove(carros.stream().filter(x->x.getMotorista().getIdade()<60).findFirst().get());
        }
        else {
            carros.add(carro);
        }
    }

    public int carrosEstacionados() {
        return carros.size();
    }

    public boolean carroEstacionado(Carro carro) {
        return carros.contains(carro);
    }
}
