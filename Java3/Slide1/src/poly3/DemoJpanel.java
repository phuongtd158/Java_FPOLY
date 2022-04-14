/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly3;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ADMIN
 */
public class DemoJpanel {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Demo JPanel");
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        JPanel p = new JPanel();
        frame.add(p);
        p.setLayout(new GridLayout(3, 3));

        JButton button[] = new JButton[9];
        for (int i = 0; i < 9; i++) {
            button[i] = new JButton("Button " + (i + 1));
            p.add(button[i]);
        }

        frame.setVisible(true);
    }
}
