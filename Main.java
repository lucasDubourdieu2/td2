public class Main {

  public static void main(String... args) {
    Pilote pilote = new Pilote("pilote", 18);
    Voiture voiture = new Voiture("Kia", 7450.88, pilote);

    System.out.println(voiture);
  }
}