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
    Scanner sc = new Scanner(System.in);
     private String ten;
     private double donGia, giamGia;

    public SanPham(String ten, double donGia, double giamGia) {
        this.ten = ten;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
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

    @Override
    public String toString() {
        return "SanPham{" + "ten=" + ten + ", donGia=" + donGia + ", giamGia=" + giamGia + '}';
    }
    public void nhap(){
        ten = nhapChuoi("Moi ban nhap ten san pham: ", sc);
        donGia = nhapSoThuc("Moi ban nhap gia san pham: ", sc);
        giamGia = nhapSoThuc("Moi ban nhap giam gia san pham: ", sc);
    }
    public String nhapChuoi(String mss, Scanner sc){
        System.out.println(mss);
        return sc.nextLine();
    }
    public double nhapSoThuc(String mss, Scanner sc){
        System.out.println(mss);
        return Double.parseDouble(sc.nextLine());
    }
    public void xuat(){
        System.out.println(toString());
    }
}
