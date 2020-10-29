package shapes;

public class triangle extends Shapes {

    private String type;

    public triangle(double base, double height, String type) {
         super(base, height);
        this.type = type;
       

        
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

   

    public double calculateArea(double b, double h) {

        return b * h / 2;
    }

    public double calculatePerimeter(double b, double h) {
        // Pythagoras sats
        double result = Math.pow(b, 2) + Math.pow(h, 2);

        return b + h + Math.sqrt(result);

    }

    @Override
    public String toString() {
        return "triangle{" + super.toString() + "type=" + type + '}';
    }
    
   
    
}
