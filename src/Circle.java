/*Aleksandr Movsesyan
  Circle.java
  CS 111B PL6
  
  Defines Circle Objects which is a type of Shape so inherits from shape
 */

import java.io.*;

public class Circle extends Shape 
{
  
  protected int radius;
  
  public Circle (int r)
  {
    super();
    radius = r;
  }
  
  public double area()
  {
    return Math.pow(radius, 2) * Math.PI;
  }
  
  public double perimeter()
  {
    return Math.PI * 2 * radius;
  }
  
  public String toString()
  {
    return (super.toString() + "Circle with radius " + radius);
  }
}