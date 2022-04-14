/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai1 {

    public static void main(String[] args) {
        //Tạo đối tượng NhanVien dùng hàm tạo không tham số
        NhanVien1 nv = new NhanVien1();
        
        //Nhập thông tin cho nv
        nv.nhap();
        //Xuất thông tin cho nv
        nv.xuat();
        
        //Tạo đối tượng NhanVIen dùng àm tạo tham số
        NhanVien1 nv2 = new NhanVien1("Tran Duc Phuong", 10000);
        //Xuất thông tin nv2
        nv2.xuat();
        //Tạo đối tượng TruongPhong dùng hàm tạo không tham số
        TruongPhong tp = new TruongPhong();
        //Nhập thông tin cho tp
        tp.nhap();
        //Xuât thông tin trưởng phòng
        tp.xuat();
        //Tạo đối tượng TruongPhong dùng hàm tạo có tham số
        TruongPhong tp2 = new  TruongPhong(800, "Tran Duc Phuong 2", 10000);
        //Xuât thông tin trưởng phòng
        tp2.xuat();
        
    }

}
