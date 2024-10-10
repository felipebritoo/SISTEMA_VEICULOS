package scr;

//Classe Motocicleta
class Motocicleta extends Veiculo {
 private int cilindrada;
 private double torque;
 private int qtdPassageiros; 

 public Motocicleta(String modelo, int anoFabricacao, String montadora, String cor, double kilometragem,
         int cilindrada, double torque, int qtdPassageiros) {
     super(modelo, anoFabricacao, montadora, cor, kilometragem);
     this.cilindrada = cilindrada;
     this.torque = torque;
 }

 @Override
 public String gerarInsert() {
     return String.format(
             "INSERT INTO Motocicleta (modelo, anoFabricacao, montadora, cor, kilometragem, cilindrada, torque) VALUES ('%s', %d, '%s', '%s', %.2f, %d, %.2f);",
             getModelo(), getAnoFabricacao(), getMontadora(), getCor(), getKilometragem(), cilindrada, torque, qtdPassageiros);
 }
}
