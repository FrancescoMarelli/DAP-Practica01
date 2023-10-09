package shapes;
import java.awt.*;

public abstract class MyShape implements Drawable {
    protected int x, y;
    protected double width, height;
    protected Color color;

    protected MyShape(int x, int y, double width, double height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double Area() {
        return width * height;
    }

    public double Perimeter() {
        return 2 * (width + height);
    }
}
