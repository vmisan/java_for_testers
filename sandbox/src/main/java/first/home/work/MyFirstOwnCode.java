package first.home.work;

public class MyFirstOwnCode {
  public static void main(String[] args) {

    Point p1 = new Point(12, 18);
    Point p2 = new Point(19, 25);

    System.out.println("Расстояние между точкой " + p1 + " и " + " точкой " + p2 + " = " + distance(p1,p2));
  }
  public static double distance(Point p1, Point p2){
    double a = p1.y - p2.y;
    double b = p1.x - p2.x;
    double c = 2;
    return Math.sqrt(Math.pow(a,c) + Math.pow(b,c));
  }

}
