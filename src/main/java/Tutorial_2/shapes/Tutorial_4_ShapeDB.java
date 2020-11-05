package Tutorial_2.shapes;

import java.awt.*;
import java.util.ArrayList;

public class Tutorial_4_ShapeDB {
    private ArrayList<Shape> array = new ArrayList<>();

    void addCircle(Point pos, Color col, int radius) {
        array.add(new Circle(pos, col, radius));
    }
    void addSquare(Point pos, Color col, int side) {
        array.add(new Square(pos, col, side));
    }
    void addRectangle(Point pos, Color col, int w, int h) {
        array.add(new Rectangle(pos, col, w, h));
    }
    void drawShapes(Graphics g) {
        for (int i = 0 ; i < array.size() ; i++ ) {
            array.get(i).draw(g);
        }
    }

}
