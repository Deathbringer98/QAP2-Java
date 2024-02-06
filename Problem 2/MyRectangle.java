// This class represents a rectangle, defined by two points: the top left and bottom right corners.
public class MyRectangle {
    // The top left and bottom right corners of the rectangle.
    private MyPoint topLeft;
    private MyPoint bottomRight;

    // Constructor that initializes the top left and bottom right corners.
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Method to calculate the width of the rectangle.
    public int getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    // Method to calculate the height of the rectangle.
    public int getHeight() {
        return Math.abs(bottomRight.getY() - topLeft.getY());
    }

    // Method to calculate the area of the rectangle.
    public int getArea() {
        return getWidth() * getHeight();
    }
}