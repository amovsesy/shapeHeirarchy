/*Aleksandr Movsesyan
  RightTriangle.java
  CS 111B pp5
  
  Defines RightTriangle Objects which is a type of Shape so inherits from shape
 */

import java.io.*;

public class RightTriangle extends Shape
{
  protected int base, height;
  
  public RightTriangle (int b, int h)
  {
    base = b;
    height = h;  
  }
  
  public double perimeter ()
  {
    return base + height + Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
  }
  
  public double area ()
  {
    return (double)(base * height) / 2; 
  }
}
