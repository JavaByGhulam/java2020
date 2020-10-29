package shapes;

public class rectangle extends Shapes{

    public rectangle(double base, double height) {
        super(base,height);
    }

    public double calculateArea(double b, double h) {
        return b * h;
    }

    public double calculatePerimeter(double b, double h) {
        return b + b + h + h;
    }
    
  

}
