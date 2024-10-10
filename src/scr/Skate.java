package scr;

// Classe Skate
class Skate extends Veiculo {
    private String marca;
    private String tipoRodas;
    private int qtdPassageiros;

    public Skate(String modelo, int anoFabricacao, String marca, String cor, double kilometragem, String tipoRodas, int qtdPassageiros) {
        super(modelo, anoFabricacao, cor, tipoRodas, kilometragem);
        this.marca = marca;
        this.tipoRodas = tipoRodas;
        this.qtdPassageiros = qtdPassageiros; // Inicialização da quantidade de passageiros
    }

    @Override
    public String gerarInsert() {
        return String.format("INSERT INTO Skate (modelo, anoFabricacao, marca, cor, kilometragem, tipoRodas, qtdPassageiros) VALUES ('%s', %d, '%s', '%s', %.2f, '%s', %d);",
                getModelo(), getAnoFabricacao(), marca, getCor(), getKilometragem(), tipoRodas, qtdPassageiros);
    }

    // Getters e Setters, se necessário
    public String getMarca() {
        return marca;
    }

    public String getTipoRodas() {
        return tipoRodas;
    }

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }
}