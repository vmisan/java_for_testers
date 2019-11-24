package first.home.work;

import java.sql.SQLOutput;

public class MyFirstProgram {
  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Viktar");

    Square s = new Square(5);
    System.out.println("Плащадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4,6);
    System.out.println("Плащадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
  }
  public static void hello(String somebody){
    System.out.println("Hello, " + somebody + "!");
  }

}
