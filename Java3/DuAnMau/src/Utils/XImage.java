/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.awt.Image;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;

/**
 *
 * @author ADMIN
 */
public class XImage {

    //Phuong thuc dung de save anh
    public static boolean save(File src) {
        File dst = new File("src\\Hinh", src.getName()); //Lưu vào thư mục
        if (!dst.getParentFile().exists()) {//Kiem tra su ton tai cua File
            dst.getParentFile().mkdirs(); //Tao thu muc
        }
        try {
            Path fromPath = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(dst.getAbsolutePath());
            Files.copy(fromPath, to, StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static ImageIcon read(String fileName) {
        File path = new File("src\\Hinh", fileName);
        return new ImageIcon(new ImageIcon(path.getAbsolutePath()).getImage().getScaledInstance(149, 192, Image.SCALE_DEFAULT));
    }
}
