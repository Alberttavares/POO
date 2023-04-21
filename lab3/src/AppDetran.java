import java.util.ArrayList;
import java.util.Random;

public class AppDetran {
    private ArrayList<Carro> carros;
    private ArrayList<Proprietario> proprietarios;
    private ArrayList<Multa> multas;

    private int sequencial;

    public AppDetran() {
        this.carros = new ArrayList<>();
        this.proprietarios = new ArrayList<>();
        this.multas = new ArrayList<>();
        this.sequencial = 1;
    }

    public void adicionarProprietario(String nome, String cpf) {
        Proprietario proprietario = new Proprietario(nome, cpf);
        this.proprietarios.add(proprietario);
    }

    public void adicionarCarro(Proprietario proprietario) {
        Random random = new Random();
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String placa = "";

        for (int i = 0; i < 4; i++) {
            placa += letras.charAt(random.nextInt(letras.length()));
        }

        placa += "-";
        placa += random.nextInt(10);
        placa += String.format("%03d", this.sequencial);

        Carro carro = new Carro(proprietario, placa);
        this.carros.add(carro);
        this.sequencial++;
    }

    public void adicionarMulta(Carro carro, String descricao, double valor) {
        Multa multa = new Multa(carro, descricao, valor);
        this.multas.add(multa);
    }

    public int contarProprietarios() {
        return this.proprietarios.size();
    }

    public int contarCarros() {
        return this.carros.size();
    }

    public int contarMultas() {
        return this

