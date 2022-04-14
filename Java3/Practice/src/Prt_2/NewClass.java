/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prt_2;

import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class NewClass {

    public static void show(Component component, String mess) {
        ImageIcon img = new ImageIcon("src/icon/Funny.png");
        JOptionPane.showMessageDialog(component, mess, "Câu hỏi", JOptionPane.INFORMATION_MESSAGE, img);
    }
}
