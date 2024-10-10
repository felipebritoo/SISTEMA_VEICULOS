package scr;

// Classe Skate
class Skate extends Veiculo {
    private String marca;
    private String tipoRodas;
    private int qtdPassageiros; 

    public Skate(String modelo, int anoFabricacao, String marca, String cor, double kilometragem, String tipoRodas,int qtdPassageiros ) {
        super(modelo, anoFabricacao,cor, kilometragem); // Montadora não aplicável
        this.marca = marca;
        this.tipoRodas = tipoRodas;
    }

    @Override
    public String gerarInsert() {
        return String.format("INSERT INTO Skate (modelo, anoFabricacao, marca, cor, kilometragem, tipoRodas) VALUES ('%s', %d, '%s', '%s', %.2f, '%s');",
                getModelo(), getAnoFabricacao(), marca, getCor(), getKilometragem(), tipoRodas,qtdPassageiros );
    }
}