/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class help {

    public static void show(Component c, String message) {
        JOptionPane.showMessageDialog(c, message, "Hệ thống đào tạo", JOptionPane.INFORMATION_MESSAGE);
    }

}
