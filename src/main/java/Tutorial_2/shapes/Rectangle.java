package Tutorial_2.shapes;

import java.awt.*; /**
 * The Tutorial_2.shapes.Circle class encapsulates the information describing a circle and can draw it in
 * an AWT Graphics object using AWT library methods
 * */
public class Rectangle extends Shape {
    private int width; // Fields
    private int height; // Fields

    public Rectangle(Point initPos, Color col, int width, int height){
        super(initPos, col);
        this.width=width; // Initialize fields
        this.height=height; // Initialize fields
    }
    @Override
    protected void draw(Graphics g) { // A method that draws the object in g
        g.setColor(col);
        g.fillRect(pos.x,pos.y,width, height);
    }
}