
/* Craig Persiko - ShapeTest.java - CS 111B
   Defines ShapeTest class to test the classes Shape, Circle,
   Rectangle, and Square for lab 2.
*/

class ShapeTest
{
  public static void main(String[] args)
  {
    Circle circ = new Circle(10);
    Circle circ2 = new Circle(2);
    Rectangle rect = new Rectangle(15, 25);
    Square sq = new Square(20);
    RightTriangle rttri = new RightTriangle(20, 25);

    System.out.println("This program examines the ratio of area to perimeter");
    System.out.println("for a few different shapes.");
    System.out.println("(The larger the ratio, the greater the efficiency of space contained)");
    System.out.println("Shape #" + circ.getId() + " 10 unit radius Circle: "
                       + ratio(circ));
    System.out.println("Shape #" + rect.getId() + " 15x25 Rectangle: "
                       + ratio(rect));
    System.out.println("Shape #" + sq.getId() + " 20 unit Square: "
                       + ratio(sq));
    System.out.println("Shape #" + circ2.getId() + " 2 unit radius Circle: "
                       + ratio(circ2));
    System.out.println("Shape #" + rttri.getId() + " Right Triangle with base 20 and height 25: "
                       + ratio(rttri));
  }
  
  public static double ratio(Shape a)
  {
    return a.area() / a.perimeter();
  }
 }

/* Output:

This program examines the ratio of area to perimeter
for a few different shapes.
(The larger the ratio, the greater the efficiency of space contained)
Shape #1 10 unit radius Circle: 5.0
Shape #3 15x25 Rectangle: 4.6875
Shape #4 20 unit Square: 5.0
Shape #2 2 unit radius Circle: 1.0

*/
