package scr;

//Classe Caminhao
class Caminhao extends Veiculo {
 private int qtdEixos;
 private double pesoBruto;
 private int qtdPassageiros;

 public Caminhao(String modelo, int anoFabricacao, String montadora, String cor, double kilometragem,
         int qtdEixos, double pesoBruto,int qtdPassageiros) {
     super(modelo, anoFabricacao, montadora, cor, kilometragem);
     this.qtdEixos = qtdEixos;
     this.pesoBruto = pesoBruto;
 }

 @Override
 public String gerarInsert() {
     return String.format(
             "INSERT INTO Caminhao (modelo, anoFabricacao, montadora, cor, kilometragem, qtdEixos, pesoBruto,qtdPassageiros) VALUES ('%s', %d, '%s', '%s', %.2f, %d, %.2f);",
             getModelo(), getAnoFabricacao(), getMontadora(), getCor(), getKilometragem(), qtdEixos, pesoBruto, qtdPassageiros);
 }
}