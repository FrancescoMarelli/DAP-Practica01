package shapes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


class ventanaSet {
    private JFrame frame;
    JPanel panel;
    JLabel label;

    public ventanaSet() {
        // Crear una ventana
        frame = new JFrame("Calculadora de figuras");
        frame.setSize(800, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Crear un panel
        panel = new JPanel();
        frame.add(panel, BorderLayout.CENTER);

        // Añadir un texto encima de los botones
        label = new JLabel("Seleccionar una figura: ");
        panel.add(label, BorderLayout.NORTH);
    }

    public JFrame getFrame() {
        return frame;
    }

    public JPanel getPanel() {
        return panel;
    }

    public JLabel getLabel() {
        return label;
    }
}

class BotonesSet extends JButton{
    private JButton buttonTriangle;
    private JButton buttonCircle;
    private JButton buttonSquare;
    private JButton buttonClear;

    public BotonesSet() {
        buttonCircle = new JButton("Círculo");
        buttonClear = new JButton("Borrar");
        buttonSquare = new JButton("Cuadrado");
        buttonTriangle = new JButton("Triángulo");
    }

    public JButton getButtonTriangle() {
        return buttonTriangle;
    }

    public JButton getButtonCircle() {
        return buttonCircle;
    }

    public JButton getButtonSquare() {
        return buttonSquare;
    }

    public JButton getButtonClear() {
        return buttonClear;
    }

}


class CalculadoraFigurasSet {
    private JFrame frame;
    private JPanel panel;
    private JLabel label;

    private JButton buttonTriangle;
    private JButton buttonCircle;
    private JButton buttonSquare;
    private JButton buttonClear;

    public CalculadoraFigurasSet() {

        // Crear una ventana
        frame = new ventanaSet().getFrame();
        panel = new ventanaSet().getPanel();
        label = new ventanaSet().getLabel();

        frame.add(panel, BorderLayout.CENTER);

        buttonTriangle = new BotonesSet().getButtonTriangle();
        buttonTriangle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Solicitar la base y la altura del triángulo
                double base = Double.parseDouble(JOptionPane.showInputDialog("Introduce la base del triángulo"));
                double height = Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura del triángulo"));

                // Crear un triángulo
                MyTriangle triangle = new MyTriangle(100, 100, base, height, Color.GREEN);

                // Preguntar si quiere calcular el área o el perímetro
                int opcion = JOptionPane.showOptionDialog(frame, "¿Desea calcular el área o el perímetro?", "Calculadora de figuras", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Área", "Perímetro"}, "Área");

                // Calcular el área o el perímetro según la opción seleccionada
                if (opcion == JOptionPane.YES_OPTION) {
                    double area = triangle.Area();
                    JOptionPane.showMessageDialog(frame, "El área es: " + area);
                } else {
                    double perimeter = triangle.Perimeter();
                    JOptionPane.showMessageDialog(frame, "El perímetro es: " + perimeter);
                }

                // Dibujar la figura
                Graphics g = panel.getGraphics();
                triangle.draw(g);

            }
        });
        panel.add(buttonTriangle);

        // Setear botones
        buttonCircle = new BotonesSet().getButtonCircle();
        buttonCircle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Solicitar el radio del círculo
                double radius2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio del círculo"));

                // Crear un círculo
                MyCircle circle = new MyCircle(100, 100, (float) radius2, Color.RED);

                // Preguntar si quiere calcular el área o el perímetro
                int opcion = JOptionPane.showOptionDialog(frame, "¿Desea calcular el área o el perímetro?", "Calculadora de figuras", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Área", "Perímetro"}, "Área");

                // Calcular el área o el perímetro según la opción seleccionada
                if (opcion == JOptionPane.YES_OPTION) {
                    double area = circle.Area();
                    JOptionPane.showMessageDialog(frame, "El área es: " + area);
                } else {
                    double perimeter = circle.Perimeter();
                    JOptionPane.showMessageDialog(frame, "El perímetro es: " + perimeter);
                }
                // Dibujar la figura
                Graphics g = panel.getGraphics();
                circle.draw(g);
            }
        });
        panel.add(buttonCircle);

        buttonSquare = new BotonesSet().getButtonSquare();
        buttonSquare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Solicitar el lado del cuadrado
                double side = Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado del cuadrado"));

                // Crear un cuadrado
                MySquare square = new MySquare(100, 100, (float) side, Color.BLUE);

                // Preguntar si quiere calcular el área o el perímetro
                int opcion = JOptionPane.showOptionDialog(frame, "¿Desea calcular el área o el perímetro?", "Calculadora de figuras", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Área", "Perímetro"}, "Área");

                // Calcular el área o el perímetro según la opción seleccionada
                if (opcion == JOptionPane.YES_OPTION) {
                    double area = square.Area();
                    JOptionPane.showMessageDialog(frame, "El área es: " + area);
                } else {
                    double perimeter = square.Perimeter();
                    JOptionPane.showMessageDialog(frame, "El perímetro es: " + perimeter);
                }
                // Dibujar la figura
                Graphics g = panel.getGraphics();
                square.draw(g);
            }
        });
        panel.add(buttonSquare);

        // Crear un botón para borrar la figura anterior
        buttonClear = new BotonesSet().getButtonClear();
        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Borrar la figura anterior
                Graphics g = panel.getGraphics();
                g.clearRect(0, 0, frame.getWidth(), frame.getHeight());
            }
        });
        panel.add(buttonClear);

        // Mostrar la ventana
        frame.setVisible(true);
     }
}



public class CalculadoraFiguras {
    public static void main(String[] args) {
        CalculadoraFigurasSet Frame = new CalculadoraFigurasSet();
    }
}
