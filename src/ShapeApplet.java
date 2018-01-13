/*
 Aleksandr Movsesyan
  ShapeApplet.java
  CS 111B PL6
 
  Shape applet using the Shape, Rectangle, Square, and Circle classes. This version uses a vector.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class ShapeApplet extends JApplet
{
  JLabel shapeSize, title, areaLabel;
  JTextField size;
  JButton saveCircle, saveSquare, display;
  Container mainContainer;
  
  ShapeCanvas canvas = new ShapeCanvas();
  
  public void init()
  {   
    mainContainer = getContentPane();
    mainContainer.setLayout(new FlowLayout());
    
    title = new JLabel("------------------------Aleksandr's ShapeApplet" +
                       "------------------------");
    title.setFont(new Font("Default", Font.BOLD, 18));
    mainContainer.add(title);
    
    shapeSize = new JLabel("Shape Size:");
    mainContainer.add(shapeSize);
    
    size = new JTextField (40);
    mainContainer.add(size);
    
    saveCircle = new JButton("Save Circle with above radius");
    saveCircle.addActionListener(
              new ActionListener()
              {
                public void actionPerformed(ActionEvent ae)
                {
                  int height;
                  boolean allDigits = true;
                  String[] sizes = size.getText().split("\\s");
                  size.setText("");
                  for (int strIdx=0; strIdx<sizes.length; strIdx++)
                  {
                    allDigits = true;
                    for(int charIdx=0; charIdx<sizes[strIdx].length() 
                           && allDigits; charIdx++)
                      if(!Character.isDigit(sizes[strIdx].charAt(charIdx)))
                    allDigits = false;
                    if(allDigits)
                    {
                      height = Integer.parseInt(sizes[strIdx]);
                      canvas.shapes.add(new GraphicalCircle(height));
                    }
                  }
                }
              } );
    mainContainer.add(saveCircle);

    saveSquare = new JButton("Save Square with above side length");
    saveSquare.addActionListener(
              new ActionListener()
              {
                public void actionPerformed(ActionEvent ae)
                {
                  int height;
                  boolean allDigits = true;
                  String[] sizes = size.getText().split("\\s");
                  size.setText("");
                  for (int strIdx=0; strIdx<sizes.length; strIdx++)
                  {
                    allDigits = true;
                    for(int charIdx=0; charIdx<sizes[strIdx].length() 
                           && allDigits; charIdx++)
                      if(!Character.isDigit(sizes[strIdx].charAt(charIdx)))
                        allDigits = false;
                    if(allDigits)
                    {
                      height = Integer.parseInt(sizes[strIdx]);
                      canvas.shapes.add(new GraphicalSquare(height));
                    }
                  }
                }
              } );

    mainContainer.add(saveSquare);

    display = new JButton("Display saved shapes");
    display.addActionListener(
              new ActionListener()
              {
                public void actionPerformed(ActionEvent ae)
                {
                  DecimalFormat fmt = new DecimalFormat("#,##0.##");
                  canvas.repaint();
                  areaLabel.setText("Area of the above shapes is: " 
                                    + fmt.format(canvas.area()) + " pixels.");
                }
              } );
    mainContainer.add(display);

    mainContainer.add(canvas);
    
    areaLabel = new JLabel();
    mainContainer.add(areaLabel);
  }
}
