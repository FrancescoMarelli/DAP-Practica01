package shapes;
import java.awt.*;

public class MyCircle extends MyEllipse{
    public MyCircle(int x, int y, double radius, Color color) {
        super(x, y, radius, radius, color);
    }

    public double Perimeter() {
        return (double) (2 * Math.PI * width);
    }

    public double Area() {
        return (double) (Math.PI * width * width);
    }
}
