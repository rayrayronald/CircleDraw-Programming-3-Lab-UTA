import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;
import shapes.Square;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Random;

public class Drawing extends Canvas {
    // A private field called f of class Frame. This is also in the AWT.
    private Frame f;
    private Random random = new Random();
    private ArrayList<Shape> array = new ArrayList<>();


    // The constructor
    public Drawing() {
        setupFrame();
        setCanvas();

        for (int i = 0 ; i < 5 ; i++ ) {
            array.add(new Circle(new Point(10*random.nextInt(40),10*random.nextInt(40)), new Color(0x992266),10*random.nextInt(10)));
            array.add(new Rectangle(new Point(10*random.nextInt(40),10*random.nextInt(40)), new Color(0x992266),10*random.nextInt(10),10*random.nextInt(10)));
            array.add(new Square(new Point(10*random.nextInt(40),10*random.nextInt(40)), new Color(0x992266),10*random.nextInt(10)));

        }
    }

    private void setCanvas() {
        setBackground(Color.WHITE);
        setSize(400,400);
    }

    private void setupFrame() {
        f = new Frame("My window");
        f.add(this);
        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {// Closes the program if close window clicked
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }

    public void paint(Graphics g){
        for (int i = 0 ; i < array.size() ; i++ ) {
            array.get(i).draw(g);
        }
    }
}