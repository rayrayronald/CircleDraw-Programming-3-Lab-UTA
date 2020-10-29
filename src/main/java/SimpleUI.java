import Tutorial_2.shapes.Drawing;

import javax.swing.*;
import java.awt.*;

public class SimpleUI {

    static GraphicsConfiguration gc; // Class field containing config info
    public static Drawing d=new Drawing(false);
    public static void SimpleUI() {
        JFrame frame = new JFrame(gc); // Create a new JFrame
        frame.setSize(400, 500);
        frame.getContentPane().add(d);
        frame.getContentPane().add(new ButtonPanel());
        frame.setJMenuBar(new MainMenu());
        frame.setVisible(true);
        // This next line closes the program when the frame is closed
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
