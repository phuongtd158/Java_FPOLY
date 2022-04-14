/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;


import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;


/**
 *
 * @author ADMIN
 */
public class GhiDuLieu_Slide5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            //Bước 1: Tạo đối tượng luồng và liên kết dữ liệu
            FileOutputStream fos = new FileOutputStream("file.txt");
            DataOutputStream dos = new DataOutputStream(fos);

            //Bước 2: Ghi dữ liệu
            System.out.println("Nhập số: ");
            int a = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập chuỗi: ");
            String b = sc.nextLine();
            dos.writeInt(a);
            dos.writeChars(b);
            dos.writeChars("Tran Duc Phuong");

            //Bước 3: Đóng luồng
            fos.flush();
            fos.close();

            //Hiển thị nội dung từ file
            System.out.println("Số nguyên: " + a);
            System.out.println("Chuỗi: " + b);
        } catch (Exception e) {
            e.printStackTrace();
        }
       
    }

}
