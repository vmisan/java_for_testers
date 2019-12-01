package first.home.work;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class DistanceTest {

  @Test
  public void testDistance(){
    Point p1 = new Point(12, 18);
    Point p2 = new Point(19, 25);
    Assert.assertNotEquals(p1.distance(p2), 0);
  }

  @Test
  public void testDistance2(){
    Point p1 = new Point(12, 18);
    Point p2 = new Point(19, 25);
    Assert.assertNotNull(p1.distance(p2), "Distance between points should not be NULL");
  }

  @Test
  public void testDistance3(){
    Point p1 = new Point(-1, 0);
    Point p2 = new Point(0, 1);
    Assert.assertEquals(p1.distance(p2), 1.4142135623730951);
  }

  @Test
  public void testDistance4(){
    Point p1 = new Point(0, 0);
    Point p2 = new Point(0, 0);
    Assert.assertEquals(p1.distance(p2), 0);
  }

  @Test
  public void testDistance5(){
    Point p1 = new Point(1, -1);
    Point p2 = new Point(-1, 1);
    Assert.assertEquals(p1.distance(p2), 2.8284271247461903);
  }

}


