/* Craig Persiko - Drawable.java - CS 111B
   Interface for a drawable item on the screen.
*/

import java.awt.*;

interface Drawable
{
  public void draw(Graphics g, Color c, int left, int top);
  // draw the item using the Graphics object and Color specified,
  // starting at the coordinates specified.

  public int getWidth();
  // return the width of the item when drawn

  public int getHeight();
  //return the height of the item when drawn
}

