package Tutorial_4;

import javax.swing.*;

public class ShapeSelector extends JPanel {
    JRadioButton bCirc = new JRadioButton("Circle");
    JRadioButton bRect = new JRadioButton("Rectangle");
    JRadioButton bSquare = new JRadioButton("Square");
    ButtonGroup BG = new ButtonGroup();

    public ShapeSelector() {
        bCirc.setSelected(true);
        BG.add(bCirc);
        BG.add(bRect);
        BG.add(bSquare);
        add(bCirc);
        add(bRect);
        add(bSquare);
    }

    String getCurrentShape() {
        if (bCirc.isSelected()) {
            return "Circle";
        } else if (bRect.isSelected()) {
            return "Rectangle";
        } else if (bSquare.isSelected()) {
            return "Square";
        }
        return "";
    }
}
