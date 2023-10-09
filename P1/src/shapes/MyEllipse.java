package shapes;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class MyEllipse extends MyShape {

    public MyEllipse(int x, int y, double width, double height, Color color) {
        super(x, y, width, height, color);
    }

    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Ellipse2D.Double ellipse = new Ellipse2D.Double(x, y, width, height);

        g2d.setColor(color);
        g2d.fill(ellipse);
    }
}

