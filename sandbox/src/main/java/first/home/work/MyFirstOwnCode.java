package first.home.work;

public class MyFirstOwnCode {
  public static void main(String[] args) {

    Point p1 = new Point(12, 18);
    Point p2 = new Point(19, 25);

    System.out.println("Расстояние между точкой " + p1 + " и " + " точкой " + p2 + " = " + p1.distance(p2));
  }
}

