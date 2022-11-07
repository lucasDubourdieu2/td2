import java.util.*;

class Voiture {

  private Pilote pilote;
  
  /**
   * Le modèle de la voiture
   */
  private String modele;

  /**
   * Le prix de la voiture
   */
  private double prix;

  public Voiture(String modele, double prix, Pilote pilote) {
    this.modele = modele;
    this.prix = prix;
    this.pilote = pilote;
    
  }

  public void demarrer() {
    System.out.println("demarrer");
  }

  public void arreter() {
     System.out.println("arreter");
  }
  
  public void deplacer() {
     System.out.println("depalcer");
  }

  public void conduire()  {
    
  }

  public String toString() {
    return pilote + " pilote " + modele + " d'une valeur de " + prix;
  }

   

 
}