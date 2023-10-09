package shapes;
import java.awt.*;

public class MyTriangle extends MyShape {
    public MyTriangle(int x, int y, double side1, double side2, Color color) {
        super(x, y, side1, side2, color);
    }

    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Polygon triangle = new Polygon();
        triangle.addPoint(x, y);
        triangle.addPoint(x + (int) width, y);
        triangle.addPoint(x, y + (int) height);

        g2d.setColor(color);
        g2d.fill(triangle);

    }

    public double Area(){
        return (double) (width * height / 2);
    }

    public double Perimeter(){
        return (double) (width + height + Math.sqrt(width * width + height * height));
    }


}
