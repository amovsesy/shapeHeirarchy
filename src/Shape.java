/*Aleksandr Movsesyan
  Shape.java
  CS 111B PL6

  Defines Shape Objects 
   */

import java.io.*;

 abstract class Shape 
 {
   protected int shapeID;
   private static int IDnext = 1;
     
   protected Shape()
   {
     shapeID = IDnext;
     IDnext++;
   }
   
   public int getId()
   {
     return shapeID;
   }
   
   public String toString()
   {
     return ("Shape #" + getId() + ": ");
   }
   
   abstract public double perimeter ();
   
   abstract public double area ();
 }
