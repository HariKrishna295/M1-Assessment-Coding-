package question3;
import java.util.*;
public abstract class ShapesFactory
{
     abstract double area();
}
class Circle extends ShapesFactory
{
       private double radius;
       Circle(double radius)
       {
           this.radius=radius;
       }
      double area()
      {
          return 3.14*radius*radius;
      }
}
class Rectangle extends ShapesFactory
{
     private double length,breadth;
     Rectangle(double length,double breadth)
     {
          this.length=length;
          this.breadth=breadth;
     }
      double area()
     {
         return length*breadth;
     }
}
class  ShapeFactory
{
      ArrayList<ShapesFactory> slist = new ArrayList<>();  
      public ShapeFactory()  {  }
        
      public void addShape(ShapesFactory s)
       {
                slist.add(s);
        }
        public ArrayList<ShapesFactory> getCircles()
        {
              ArrayList<ShapesFactory> circleList=new ArrayList<>();
              Iterator<ShapesFactory> iter= slist.iterator();
              while (iter.hasNext()) 
              {
            	  ShapesFactory temp=iter.next();
                  if(temp.getClass().getName()=="Circle")
                  {
                	  circleList.add(temp);
                  }
                  
              }
              return circleList;  
        }
       public ArrayList<ShapesFactory> getRectangles()
        {
              ArrayList<ShapesFactory> rectangleList=new ArrayList<>();
              Iterator<ShapesFactory> iter= slist.iterator();
              while (iter.hasNext()) 
              {
            	  ShapesFactory temp=iter.next();
                  if(temp.getClass().getName()=="Rectangle")
                  {
                	  rectangleList.add(temp);
                  } 
              }
              return rectangleList;
        }
        public boolean  deleteShape(ShapeFactory s)
        {
                  if(slist.contains(s))
                  {
                     slist.remove(slist.indexOf(s)); 
                  }
                  return slist.contains(s);
        }
        
}