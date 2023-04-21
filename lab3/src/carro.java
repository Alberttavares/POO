public class Carro {
    private Proprietario proprietario;
    private String placa;

    public Carro(Proprietario proprietario, String placa) {
        this.proprietario = proprietario;
        this.placa = placa;
    }

    public Proprietario getProprietario() {
        return this.proprietario;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
