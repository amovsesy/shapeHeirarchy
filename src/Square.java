/*Aleksandr Movsesyan
  Square.java
  CS 111B PL6
 
  Defines Square Objects which is a type of Rectangle so inherits from shape
 */

import java.io.*;

public class Square extends Rectangle 
{   
  public Square (int side)
  {
    super(side, side);
  }
  
  public String toString()
  {
    return (super.toString() + "Square with side " + length);
  }
}