/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author ADMIN
 */
public class FileDoc {

    public static void main(String[] args) {
        try {
            File f = new File("IT_UDPM.txt");
            FileReader fRead = new FileReader(f);
            
            //B2: Đọc dữ liệu
            BufferedReader bfReader = new BufferedReader(fRead);
            String s;
            int i = 0;
            while ((s = bfReader.readLine()) != null) {                
                //Đọc từng dòng, đến khi null -> kết thúc
                
                i++;
                System.out.println(i + " " + s);
            }
            //B3: Đóng luồng
            fRead.close();
            bfReader.close();
        } catch (Exception e) {
        }

    }
}
