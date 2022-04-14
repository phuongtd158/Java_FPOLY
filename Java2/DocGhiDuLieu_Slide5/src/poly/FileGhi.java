/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

import java.io.FileWriter;
import java.io.File;

/**
 *
 * @author ADMIN
 */
public class FileGhi {
    public static void main(String[] args) {
        try {
            File f = new File("IT_UDPM.txt");
            FileWriter fileWriter = new FileWriter(f);
            
            //B2: Đọc dữ liệu
            fileWriter.write("Trần Đức Phương ");
            fileWriter.write("\nPH13747");
            fileWriter.write("\nTrần Đức Phương ");
            fileWriter.write("\nPH13747");
            fileWriter.write("\nTrần Đức Phương ");
            fileWriter.write("\nPH13747");
            fileWriter.write("\nTrần Đức Phương ");
            fileWriter.write("\nPH13747");
            fileWriter.write("\nTrần Đức Phương ");
            fileWriter.write("\nPH13747");
            fileWriter.write("\nTrần Đức Phương ");
            fileWriter.write("\nPH13747");
            
            //B3: Đóng luồng
            fileWriter.close();
            
        } catch (Exception e) {
        }
    }
}
