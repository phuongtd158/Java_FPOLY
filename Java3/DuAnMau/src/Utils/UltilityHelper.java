/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import static java.awt.Color.pink;
import static java.awt.Color.white;
import java.awt.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JTextField;

/**
 *
 * @author ADMIN
 */
public class UltilityHelper {

    public static boolean isValidDate(String inDate) {

        if (inDate == null) {
            return false;
        }

        //set the format to use as a constructor argument
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        if (inDate.trim().length() != dateFormat.toPattern().length()) {
            return false;
        }

        dateFormat.setLenient(false);

        try {
            //parse the inDate parameter
            dateFormat.parse(inDate.trim());
        } catch (ParseException pe) {
            return false;
        }
        return true;
    }

    public static boolean checkDate(JTextField txt) {
        String id = txt.getText();
        if (isValidDate(id)) {
            return true;
        } else {
            MsgBox.alert(txt.getRootPane(), txt.getName() + " không đúng định dạng dd-MM-yyyy");
            return false;
        }
    }

    public static boolean checkNullText(JTextField txt) {

        if (txt.getText().trim().length() > 0) {
            return true;
        } else {

            MsgBox.alert(txt.getRootPane(), "Không được để trống " + txt.getName());
            return false;
        }
    }

}
