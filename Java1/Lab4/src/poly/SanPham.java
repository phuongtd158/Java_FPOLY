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
public class SanPham {
    
    //Đổi các trường thành private
    private String tenSp;
    private double donGia;
    private double giamGia;
    
    //Thêm cho mỗi trường private 1 cặp set, get
    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    
        
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap ten san pham: ");
        tenSp = sc.nextLine();
        do {
            System.out.println("Moi ban nhap don gia: ");
            donGia = Double.parseDouble(sc.nextLine());
        } while (donGia < 0);
        do {
            System.out.println("Moi ban nhap giam gia: ");
            giamGia = Double.parseDouble(sc.nextLine());
        } while (giamGia < 0);
    }

    private double tinhThueNhapKhau() {
        
        return donGia * 0.1;
    }

    public void output() {
        System.out.println("Ten sp la: " + tenSp);
        System.out.println("Gia sp la: " + donGia);
        System.out.println("Giam gia: " + giamGia);
        System.out.println("Thue la: " + tinhThueNhapKhau());

    }
    //Ham tao(Contructor)

    //Ham tao gom 3 tham so0
    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;

    }

    //Ham tao khong tham so
    public SanPham() {
    }

    //Ham tao 2 tham so
    public SanPham(String tenSp, double donGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = 0;
        
    }
    
    

}
