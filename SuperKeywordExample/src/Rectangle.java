

public class Rectangle extends Shape {

    // Fields
    private int width;
    private int height;

    // Constructor
    public Rectangle() {
        this(0, 0);
    }
    public Rectangle(int x, int y) {
        this(x, y, 0, 0); // calls 2nd constructor
    }

    public Rectangle(int x, int y, int width, int height) {
        super(x, y); // calls constructor from parent (Shape)
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "Width='" + this.width + '\'' +
                ", Height='" + this.height + '\'' + "} " +
                super.toString();
    }
}