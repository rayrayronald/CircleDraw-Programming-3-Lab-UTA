package Tutorial_2.shapes;

import java.awt.*;

public abstract class Shape {
    protected Point pos;
    protected Color col;

    public Shape(Point initPos, Color col) {
        this.pos=initPos;
        this.col=col;
    }

    abstract void draw(Graphics g);

}
