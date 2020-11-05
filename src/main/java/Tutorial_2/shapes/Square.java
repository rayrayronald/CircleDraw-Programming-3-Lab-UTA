package Tutorial_2.shapes;

import java.awt.*;

public class Square extends Rectangle{
    public Square(Point initPos, Color col, int side) {
        super(initPos, col, side, side);
    }
//    @Override
//    protected void draw(Graphics g) { // A method that draws the object in g
//        g.setColor(col);
//        g.fillRect(pos.x,pos.y,side, side);
//    }
}
