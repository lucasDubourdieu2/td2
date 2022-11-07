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

  public int normeMax() {
    int a = Math.abs(this.x);
    int b = Math.abs(this.y);
    
    return (a >= b ? a:b);
  }

    public static int normeMax(int x, int y) {
      int a = Math.abs(x);
      int b = Math.abs(y);
      
      return (a >= b ? a:b);
  }
}
