package scr;

//Classe Automovel
class Automovel extends Veiculo {
 private int qtdPassageiros;
 private String tipoFreio;
 private boolean airbag;

 public Automovel(String modelo, int anoFabricacao, String montadora, String cor, double kilometragem,
         int qtdPassageiros, String tipoFreio, boolean airbag) {
     super(modelo, anoFabricacao, montadora, cor, kilometragem);
     this.qtdPassageiros = qtdPassageiros;
     this.tipoFreio = tipoFreio;
     this.airbag = airbag;
 }

 @Override
 public String gerarInsert() {
     return String.format(
             "INSERT INTO Automovel (modelo, anoFabricacao, montadora, cor, kilometragem, qtdPassageiros, tipoFreio, airbag) VALUES ('%s', %d, '%s', '%s', %.2f, %d, '%s', %b);",
             getModelo(), getAnoFabricacao(), getMontadora(), getCor(), getKilometragem(), qtdPassageiros, tipoFreio,
             airbag);
 }
}