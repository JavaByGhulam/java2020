

package shapes;


public class Shapes{

    private double base;
    private double height; 

    public Shapes(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public Shapes() {
    }
    
    
    
    
     public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Shapes{" + "base=" + base + ", height=" + height + '}';
    }
    
    
   
    
    
    
}
