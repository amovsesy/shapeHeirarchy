/*Aleksandr Movsesyan
  Rectangle.java
  CS 111B PL6
 
  Defines Rectangle Objects which is a type of Shape so inherits from shape
 */

import java.io.*;

public class Rectangle extends Shape
{
  protected int height, length;
  
  public Rectangle(int h, int l)
  {
    height = h;
    length = l;
  }
  
  public double area()
  {
    return height * length;
  }
  
  public double perimeter()
  {
    return (height * 2) + (length * 2);
  }
}