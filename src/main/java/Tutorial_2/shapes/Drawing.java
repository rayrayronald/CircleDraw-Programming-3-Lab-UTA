package Tutorial_2.shapes;


import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class Drawing extends Canvas {
    // A private field called f of class Frame. This is also in the AWT.
    private Frame f;
    private Random random = new Random();
    private Tutorial_4_ShapeDB shapeDB = new Tutorial_4_ShapeDB();


    // The constructor
    public Drawing() {
        setupFrame();
        setCanvas();
        generateShapes();
    }
    public Drawing(Boolean bool) {
        setCanvas();
        generateShapes();
    }
    public Drawing(Boolean bool, Boolean bool_2) {
    }

    public void addCircle(Point pos, Color col, int radius) {
        shapeDB.addCircle(pos, col, radius);
    }
    public void addSquare(Point pos, Color col, int side) {
        shapeDB.addSquare(pos, col, side);

    }
    public void addRectangle(Point pos, Color col, int w, int h) {
        shapeDB.addRectangle(pos, col, w, h);

    }
    public void generateShapes() {
        addRectangle(new Point(10*random.nextInt(40),10*random.nextInt(40)), new Color(0x992266),10*random.nextInt(10),10*random.nextInt(10));
        addSquare(new Point(10*random.nextInt(40),10*random.nextInt(40)), new Color(0x992266),10*random.nextInt(10));
        addCircle(new Point(10*random.nextInt(40),10*random.nextInt(40)), new Color(0x992266),10*random.nextInt(10));
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
//    public void repaint(Graphics g){
//        shapeDB.drawShapes(g);
//    }
    public void paint(Graphics g){
        shapeDB.drawShapes(g);
    }
}