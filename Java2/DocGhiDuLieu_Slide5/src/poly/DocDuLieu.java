/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.IOException;


/**
 *
 * @author ADMIN
 */
public class DocDuLieu {
    public static void main(String[] args) {
        try {
            //Bước 1: Tạo đối tượng luồng và liên kết dữ liệu
            FileInputStream fis = new FileInputStream("file.txt");
            DataInputStream dis =  new DataInputStream(fis);
            
            //Bước 2: Đọc dữ liệu
            int n = dis.readInt();
            char m = dis.readChar();

            //Bước 3: Đóng luồng
            fis.close();
            dis.close();

            //Hiển thị nội dung từ file
            System.out.println("Số nguyên: " + n);
            System.out.println("Chuỗi: " + m);
        } catch (IOException e) {
        }
    }
}
