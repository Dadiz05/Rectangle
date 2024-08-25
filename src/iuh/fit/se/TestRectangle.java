package iuh.fit.se;

public class TestRectangle {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(20.5, 4.0);

        System.out.println("lenght r1: " + r1.getLength());
        System.out.println("lenght r2: " + r2.getLength());
        r1.setLength(-5);
        System.out.println("Area r1: " + r1.getArea());
        System.out.println("Area r2: " + r2.getArea());

    }


}
