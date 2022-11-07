import java.util.*;

public class Pilote {

  private String nom;

  private int age;

  /**
   * Crée une instance de Pilote
   */
  public Pilote(String nom, int age) {
    this.nom = nom;
    this.age = age;
  }

  public String toString() {
    return nom + " " + age;
  }

}