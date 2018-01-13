/* Aleksandr Movsesyan
   ShapeCanvas.java
   PL6

   Draws the Drawable objects in an array on its canvas
   Intended for use with Applet for Programming Lab 4.  This version uses a vector.
*/

import java.awt.*;
import java.util.*;

public class ShapeCanvas extends Canvas
{
  static final int WIDTH = 500;
  static final int HEIGHT = 300;
  double totalArea = 0.0;

  public Vector shapes = new Vector();
  public Iterator draw;

  public ShapeCanvas()
  {
    setBackground(Color.yellow);

    setSize(WIDTH, HEIGHT);
  }

  public void paint(Graphics g)
  {
    draw = shapes.iterator();
      
    int x = 0, y = 0; // coordinates for next shape
    int width, height;  // size of shape
    int rowHeight = 0; // max height of shapes on this row

    while(draw.hasNext())
    {
      Object s = draw.next();
      if (shapes.isEmpty()) break; // stop loop if null reference: array not full
      if (s instanceof GraphicalCircle)
      {  
        width = ((GraphicalCircle)(s)).getWidth();  // get shape's dimension
        height = ((GraphicalCircle)(s)).getHeight(); // to help with layout
      }
      else if (s instanceof GraphicalSquare)
      {
        width = ((GraphicalSquare)(s)).getWidth();  // get shape's dimension
        height = ((GraphicalSquare)(s)).getHeight(); // to help with layout
      }
      else
        return;
      
      if(x + width > WIDTH && x > 0)
      {   // there's more space on next row
        x = 0;
        y += rowHeight;
        rowHeight = 0;
      }
      
      if (s instanceof GraphicalCircle)  
        ((GraphicalCircle)(s)).draw(g, Color.blue, x, y); // draw the shape)
      else if (s instanceof GraphicalSquare)
        ((GraphicalSquare)(s)).draw(g, Color.blue, x, y); // draw the shape
      else
        return;
      
      x += width;
      if (height > rowHeight)
        rowHeight = height;
    }
  }
  
  public double area()
  {
    Iterator  access = shapes.iterator();
    totalArea = 0.0;
    
    while(access.hasNext())
    {
      Object p = access.next();
      totalArea += ((Shape)(p)).area();
    }
    
    return totalArea;
  }
}
