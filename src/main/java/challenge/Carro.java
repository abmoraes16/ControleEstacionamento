package challenge;

public class Carro {
    private String placa;
    private Cor cor;
    private Motorista motorista;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Carro(String placa, Cor cor, Motorista motorista){
        this.placa = placa;
        this.cor = cor;
        this.motorista = motorista;
    }

    public static CarroBuilder builder(){
        return new CarroBuilder();
    }
}
