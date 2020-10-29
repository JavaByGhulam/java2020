package shapes;

import java.util.ArrayList;
import java.util.Scanner;

public class Classesandobject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String more;

        ArrayList<Shapes> shape = new ArrayList<>();

        do {
            Scanner feedBack = new Scanner(System.in);
            System.out.println("Select among Shapes \n 1) Circle \n 2) Triangle \n 3) Rectangle ");

            int number = feedBack.nextInt();
            switch (number) {
                case 1:
                    int val = decision();
                    System.out.println("Enter value for radius:");
                    double radius = feedBack.nextDouble();
                    circle c = new circle(radius);

                    //c.setRadius(radius);
                    switch (val) {
                        case 1: {

                            System.out.println("Circle with radius " + c.getRadius() + " has area : " + (String.format("%.2f", (c.area()))));
                            break;
                        }
                        case 2: {
                            // c.circumference();
                            System.out.println("Circle with radius " + c.getRadius() + " has circumference : " + (String.format("%.2f", (c.circumference()))));

                            break;
                        }
                        case 3: {
                            System.out.println("Circle with radius " + c.getRadius() + " has area : " + (String.format("%.2f", (c.area())))
                                    + " \nand circumference is :" + (String.format("%.2f", (c.circumference()))));
                            break;
                        }
                    }
                    break;
                case 2:
                    val = decision();
                    System.out.println("Enter value for base:");
                    double base = feedBack.nextDouble();
                    System.out.println("Enter value for height:");
                    double height = feedBack.nextDouble();
                    feedBack.nextLine();
                    System.out.println("Enter value for  tryinge type:");
                    String type = feedBack.nextLine();

                    triangle t = new triangle(base, height, type);
                    shape.add(t);
                    System.out.println("Triangle you choose is" + t.toString());
                    switch (val) {

                        case 1: {

                            System.out.println("Triangle with base " + t.getBase() + " and hight " + t.getHeight() + " has area : " + String.format("%.2f", (t.calculateArea(t.getBase(), t.getHeight()))));
                            break;
                        }
                        case 2: {
                            // c.circumference();
                            System.out.println("Triangle with base " + t.getBase() + " and hight " + t.getHeight() + " has omkrets : " + String.format("%.2f", (t.calculatePerimeter(t.getBase(), t.getHeight()))));

                            break;
                        }
                        case 3: {
                            System.out.println("Triangle with base " + t.getBase() + " and hight " + t.getHeight() + " has area : " + String.format("%.2f", (t.calculateArea(t.getBase(), t.getHeight()))) + " and omkrets " + String.format("%.2f", (t.calculatePerimeter(t.getBase(), t.getHeight()))));
                            break;
                        }
                    }
                    break;
                case 3:
                    val = decision();
                    System.out.println("Enter value for base:");

                    base = feedBack.nextDouble();
                    System.out.println("Enter value for height:");
                    height = feedBack.nextDouble();
                    rectangle r = new rectangle(base, height);

                    shape.add(r);

                   

                    //c.setRadius(radius);
                    switch (val) {
                        case 1: {

                            System.out.println("Rectangle with base " + r.getBase() + " and hight " + r.getHeight() + " has area : " + String.format("%.2f", (r.calculateArea(r.getBase(), r.getHeight()))));
                            break;
                        }
                        case 2: {
                            // c.circumference();
                            System.out.println("Rectangle with base " + r.getBase() + " and hight " + r.getHeight() + " has omkrets : " + String.format("%.2f", (r.calculatePerimeter(r.getBase(), r.getHeight()))));

                            break;
                        }
                        case 3: {
                            System.out.println("Rectangle with base " + r.getBase() + " and hight " + r.getHeight() + " has area : " + String.format("%.2f", (r.calculateArea(r.getBase(), r.getHeight()))) + " and omkrets " + String.format("%.2f", (r.calculatePerimeter(r.getBase(), r.getHeight()))));
                            break;
                        }
                    }
                    break;

            }
            System.out.println("Do you want to continue? (y/n)");
            feedBack.nextLine();
            more = feedBack.nextLine();
        } while ((more.equals("y")) || (more.equals("Y")));
    }

    public static int decision() {
        Scanner feedBack = new Scanner(System.in);
        System.out.println("Select among functions: \n 1) Area \n 2) Omkrets \n 3) Both");
        int svar = feedBack.nextInt();
        feedBack.nextLine();

        return svar;

    }

}
