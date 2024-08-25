package iuh.fit.se;

/**
 * @description Test class to demonstrate the usage of the Rectangle class by creating an instance,
 * inputting dimensions, and displaying the perimeter, area, and string representation of the rectangle.
 * @author: Vi, Nguyen Gia
 * @version: 1.0
 * @created: 2024-08-25
 */

public class TestRectangle {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(20.5, 4.0);

        System.out.println("lenght r1: " + r1.getLength());
        System.out.println("lenght r2: " + r2.getLength());
//      r1.setLength(-5);
        System.out.println("Area r1: " + r1.getArea());
        System.out.println("Area r2: " + r2.getArea());
        System.out.println("Perimeter r1: " + r1.getPerimeter());

    }


}
