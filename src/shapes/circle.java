
package shapes;


public class circle {
   
    private final double PI=Math.PI;
    
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public circle(double radius) {
        this.radius = radius;
    }
    
      public double area(){
    
           return (PI*radius*radius);
    
    
    }
    
    
      public double circumference(){
      
         return 2*(PI)*radius;
      
      }
    
}
