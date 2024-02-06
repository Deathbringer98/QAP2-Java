// This class tests the functionality of the MyRectangle class.
public class TestMyRectangle {
    public static void main(String[] args) {
        // Create two points: the top left and bottom right corners of the rectangle.
        MyPoint topLeft = new MyPoint(0, 10);
        MyPoint bottomRight = new MyPoint(10, 0);

        // Create a rectangle with the two points.
        MyRectangle rectangle = new MyRectangle(topLeft, bottomRight);

        // Print the width, height, and area of the rectangle.
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Area: " + rectangle.getArea());
    }
}