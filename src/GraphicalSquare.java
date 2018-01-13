/*
 *Aleksandr Movsesyan
 *CS 111B
 *GraphicalCircle.java
 *
 *extends Square and implements Drawable to draw a shape.
 */

import java.awt.*;
import javax.swing.*;
import javax.swing.JApplet;

public class GraphicalSquare extends Square implements Drawable
{
  private int length;
  
  public GraphicalSquare(int side)
  {
    super(side);
    length = side;
  }
    
  public void draw(Graphics g, Color c, int left, int top)
  {
    g.setColor(c);
    g.fillRect(left, top, getWidth(), getHeight());
  }
  
  public int getWidth()
  {
    return length;
  }

  public int getHeight()
  {
    return length;
  }
}
