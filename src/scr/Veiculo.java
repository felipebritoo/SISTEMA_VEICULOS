package scr;

//Classe base Veiculo
abstract class Veiculo {
 private String modelo;
 private int anoFabricacao;
 private String montadora;
 private String cor;
 private double kilometragem;

 public Veiculo(String modelo, int anoFabricacao, String montadora, String cor, double kilometragem) {
     setModelo(modelo);
     setAnoFabricacao(anoFabricacao);
     this.montadora = montadora;
     this.cor = cor;
     this.kilometragem = kilometragem;
 }

 public String getModelo() {
     return modelo;
 }

 public void setModelo(String modelo) {
     if (modelo == null || modelo.isEmpty()) {
         throw new IllegalArgumentException("Modelo é obrigatório.");
     }
     this.modelo = modelo;
 }

 public int getAnoFabricacao() {
     return anoFabricacao;
 }

 public void setAnoFabricacao(int anoFabricacao) {
     if (anoFabricacao < 1886 || anoFabricacao > 2024) { // Considerando o primeiro carro e um ano futuro
         throw new IllegalArgumentException("Ano de fabricação inválido.");
     }
     this.anoFabricacao = anoFabricacao;
 }

 public String getMontadora() {
     return montadora;
 }

 public void setMontadora(String montadora) {
     this.montadora = montadora;

     System.out.println("DEBUG: motadora: " + this.montadora);
 }

 public String getCor() {
     return cor;
 }

 public void setCor(String cor) {
     this.cor = cor;
 }

 public double getKilometragem() {
     return kilometragem;
 }

 public void setKilometragem(double kilometragem) {
     this.kilometragem = kilometragem;
 }

 public abstract String gerarInsert();
}