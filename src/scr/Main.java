package scr;

//Classe Main
public class Main {
  public static void main(String[] args) {
      Automovel carro = new Automovel("gol", 1970, "Volkswagen", "Azul", 123456.78, 5, "disco", true);
      Motocicleta moto = new Motocicleta("Ninja", 2020, "Kawasaki", "verde", 10000, 650, 100.5, 2);
      Caminhao caminhao = new Caminhao("Scania", 2018, "Scania", "Branco", 20000, 4, 25000, 8);
      Bicicleta bicicleta = new Bicicleta("Mountain Bike", 2022, "Caloi", "Vermelha", 150.0, "Alumínio", 18, true, 1);
      Skate skate = new Skate("Skate Pro", 2021, "Penny", "Preto", 0, "flexível", 1);

      System.out.println("Modelo: " + carro.getModelo() + " Ano:" + carro.getAnoFabricacao() + " Montadora: "
              + carro.getMontadora() + " Cor: " + carro.getCor() + " KM: " + carro.getKilometragem());// Carro

      System.out.println("Modelo: " + moto.getModelo() + " Ano:" + moto.getAnoFabricacao() + " Montadora: "
              + moto.getMontadora() + " Cor: " + moto.getCor() + " KM: " + moto.getKilometragem());// Moto

      System.out.println("Modelo: " + caminhao.getModelo() + " Ano:" + caminhao.getAnoFabricacao() + " Montadora: "
              + caminhao.getMontadora() + " Cor: " + caminhao.getCor() + " KM: " + caminhao.getKilometragem());// Caminhao

      System.out.println("Modelo: " + bicicleta.getModelo() + " Ano:" + bicicleta.getAnoFabricacao() + " Montadora: "
              + bicicleta.getMontadora() + " Cor: " + bicicleta.getCor() + " KM: " + bicicleta.getKilometragem());// bicicleta

      System.out.println("Modelo: " + skate.getModelo() + " Ano:" + skate.getAnoFabricacao() + " Montadora: "
              + skate.getMontadora() + " Cor: " + skate.getCor() + " KM: " + skate.getKilometragem()); // skate

  }
}