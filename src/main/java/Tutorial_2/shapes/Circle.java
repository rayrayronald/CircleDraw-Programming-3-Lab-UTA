package Tutorial_2.shapes;

import java.awt.*; /**
 * The Tutorial_2.shapes.Circle class encapsulates the information describing a circle and can draw it in
 * an AWT Graphics object using AWT library methods
 * */
public class Circle extends Shape{
    private int rad; // Fields

    public Circle(Point initPos, Color col, int radius){ // The constructor
        super(initPos, col);
        rad=radius; // Initialize fields

    }
    @Override
    protected void draw(Graphics g) { // A method that draws the object in g
        g.setColor(col);
        g.fillOval(pos.x,pos.y,rad, rad);
    }
}