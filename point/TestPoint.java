package point;

public class TestPoint {

  public static void main(String[] args) {
    Point point = new Point(2, 3);
    point.afficher();
    System.out.println(point.normeMax());
    System.out.println(Point.normeMax(2, -3));
  }
  
}