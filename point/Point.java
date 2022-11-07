package point;

public class Point {
  
  private int x;
  
  private int y;
  
  public Point (int x, int y) {
    this.x = x ;
    this.y = y ;
  }
  
  public void afficher () {
    System.out.println ("Coordonnées " + x + " " + y) ;
  }
}
