package Tutorial_4;

import javax.swing.*;
import java.awt.*;

public class UIControllerController {
    static GraphicsConfiguration gc; // Class field containing config info

    public UIControllerController(){
        DrawingUIController UI = new DrawingUIController();
        JFrame frame = new JFrame(gc); // Create a new JFrame
        frame.setSize(500, 600);
        frame.add(UI.getMainPanel());
        frame.setVisible(true);
        // This next line closes the program when the frame is closed
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
