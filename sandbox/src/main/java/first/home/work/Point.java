package first.home.work;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class Point {
  public double x;
  public double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double distance(Point pointToCalculate){
    double a = this.x - pointToCalculate.x;
    double b = this.y - pointToCalculate.y;
    double c = 2;
    return Math.sqrt(Math.pow(a,c) + Math.pow(b,c));
  }

}



