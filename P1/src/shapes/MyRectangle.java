package shapes;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class MyRectangle extends MyShape {

    public MyRectangle(int x, int y, double width, double height, Color color) {
        super(x, y, width, height, color);
    }

    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Rectangle2D.Double rectangle = new Rectangle2D.Double(x, y, width, height);

        g2d.setColor(this.color);
        g2d.fill(rectangle);
    }

}
