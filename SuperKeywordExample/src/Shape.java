

public class Shape {



    // Fields
    private int x;
    private int y;

    public Shape() {
        this(0, 0);
    }
    // Constructor
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}