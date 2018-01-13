/*
 *Aleksandr Movsesyan
 *CS 111B
 *GraphicalCircle.java
 *
 *extends Circle and implements Drawable to draw a shape.
 */

import java.awt.*;
import javax.swing.*;
import javax.swing.JApplet;

public class GraphicalCircle extends Circle implements Drawable
{
  public GraphicalCircle (int rad)
  {
    super(rad);
  }
    
  public void draw(Graphics g, Color c, int left, int top)
  {
    g.setColor(c);
    g.fillOval(left, top, getWidth(), getHeight());
  }
  
  public int getWidth()
  {
    return radius *2;
  }

  public int getHeight()
  {
    return radius *2;
  }
}
