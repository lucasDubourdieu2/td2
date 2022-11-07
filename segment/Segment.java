package segment;

public class Segment {

  private int extr1;

  private int extr2;

  public Segment(int extr1, int extr2) {

    this.extr1 = extr1;
    this.extr2 = extr2;

  }

  private void ordonne() {
    if (extr1 > extr2) {
      int sav;
      sav = extr1;
      extr2 = extr1;
      extr1 = sav;
    }
  }

  public int longueur() {   
    return extr2 - extr1;
  }

  public boolean appartient(int x) {
    
    return x <= extr2 && x >= extr1;
  }

  public int getExtr1() {
    return extr1;
  }

   public int getExtr2() {
    return extr2;
  }

  
  public String toString() {
    return extr1 + " " + extr2;
  }

}