package Tutorial_4;

import Tutorial_2.shapes.Drawing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class DrawingUIController extends JPanel{
    private JPanel mainPanel = new JPanel();
    private JPanel controlsPanel = new JPanel();
    private ShapeSelector sSel = new ShapeSelector();
    private Drawing d = new Drawing(false, false);
    Random random = new Random();

    public DrawingUIController() {
        mainPanel.setLayout(new GridLayout(2,1)); // One row, one column
        controlsPanel.setLayout(new GridLayout(3,1)); // One row, one column
        mainPanel.setBackground(Color.WHITE);

        controlsPanel.add(sSel);
        mainPanel.add(controlsPanel);
        d.addRectangle(new Point(10*random.nextInt(40),10*random.nextInt(20)), new Color(0x990000),10*random.nextInt(10),10*random.nextInt(10));
        d.addSquare(new Point(10*random.nextInt(40),10*random.nextInt(20)), new Color(0x009900),10*random.nextInt(10));
        d.addCircle(new Point(10*random.nextInt(40),10*random.nextInt(20)), new Color(0x000099),10*random.nextInt(10));
        d.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {

            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                switch (sSel.getCurrentShape()) {
                    case "Circle":
                        d.addCircle(mouseEvent.getPoint(), new Color(0x000099),10*random.nextInt(10));
                        break;
                    case "Rectangle":
                        d.addRectangle(mouseEvent.getPoint(), new Color(0x990000),10*random.nextInt(10),10*random.nextInt(10));
                        break;
                    case "Square":
                        d.addSquare(mouseEvent.getPoint(), new Color(0x009900),10*random.nextInt(10));
                        break;
                }
                d.repaint();
            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });
        mainPanel.add(d);
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

}
