package iuh.fit.se;

/**
 * @description Class representing a Rectangle with methods to calculate its perimeter, area, and display its details.
 * @author: Vi, Nguyen Gia
 * @version: 1.0
 * @created: 2024-08-25
 */

public class Rectangle {

    //Attributes
    private double length;
    private double width;

    //Methods
    public Rectangle() {
    this(5.0,0.0);
    }

    /**
     * Constructs a Rectangle with specified length and width.
     * @param length the length of the rectangle
     * @param width the width of the rectangle
     */

    public Rectangle(double length, double width) {
        if(length<0.0 || width<0.0)
            throw new IllegalArgumentException("Lenght and width must be greater than 0.");

        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }
    /**
     * Description: Set the length of the rectangle
     * @param length The length of the rectangle
     * @throws IllegalArgumentException if length is less than 0.0
     */
    public void setLength(double length) {
        if(length < 0.0)
            throw new IllegalArgumentException("The length must be greater than 0.");
        this.length = length;


    }

    public double getWidth() {
        return width;
    }

    /**
     * Description: Set the width of the rectangle
     * @param width The width of the rectangle
     * @throws IllegalArgumentException if width is less than 0.0
     */
    public void setWidth(double width) {
        if(width < 0.0)
            throw new IllegalArgumentException("The width must be greater than 0.");
        this.width = width;
    }

    /**
     * Calculates the area of the rectangle.
     * @return the area of the rectangle
     */
    public double getArea() {
        return this.length * this.width;
    }

    /**
     * Calculates the perimeter of the rectangle.
     * @return the perimeter of the rectangle
     */
    public double getPerimeter() {
        return (this.length + this.width)*2;
    }
}
