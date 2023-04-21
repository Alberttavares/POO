import java.time.LocalDate;

public class Multa {
    private Carro carro;
    private String descricao;
    private double valor;
    private LocalDate dataM;
    private static int numMultas = 0;

    public Multa(Carro carro, String descricao, double valor) {
        this.carro = carro;
        this.descricao = descricao;
        this.valor = valor;
        this.data = LocalData.now();
        numMultas++;
    }
    public Carro getCarro() {
        return carro;
    }
    public String getDescricao() {
        return descricao;
    }
    public double getValor() {
        return valor;
    }
    public LocalDate getData() {
        return dataM;
    }
    public static int getNumMultasCriadas() {
        return numMultas;
    }
}
