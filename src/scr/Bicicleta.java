package scr;

// Classe Bicicleta
class Bicicleta extends Veiculo {
    private String marca;
    private String material;
    private int qtdMarchas;
    private boolean amortecedor;
    private int qtdPassageiros;

    public Bicicleta(String modelo, int anoFabricacao, String marca, String cor, double kilometragem,
            String material, int qtdMarchas, boolean amortecedor, int qtdPassageiros) {
        super(modelo, anoFabricacao, cor,material, kilometragem); // Montadora não aplicável
        this.marca = marca;
        this.material = material;
        this.qtdMarchas = qtdMarchas;
        this.amortecedor = amortecedor;
        this.qtdPassageiros = qtdPassageiros;
    }

    @Override
    public String gerarInsert() {
        return String.format(
                "INSERT INTO Bicicleta (modelo, anoFabricacao, marca, cor, kilometragem, material, qtdMarchas, amortecedor, passageiros) VALUES ('%s', %d, '%s', '%s', %.2f, '%s', %d, %b);",
                getModelo(), getAnoFabricacao(), marca, getCor(), getKilometragem(), material, qtdMarchas, amortecedor,qtdPassageiros);
    }
}