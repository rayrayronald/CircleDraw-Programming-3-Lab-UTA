import Tutorial_2.shapes.Drawing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel {
    private JButton but1;
    public ButtonPanel() {
        setLayout(new GridLayout(5,5)); // One row, one column
        but1=new JButton("Press me");
        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("BUtTON_PRESSED");
                SimpleUI.d.generateShapes();
            }
        });
        add(but1);
    }
}
