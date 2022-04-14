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

    private String maSp, tenSp;
    private double donGia;
    Scanner sc = new Scanner(System.in);

    public SanPham() {
    }

    public SanPham(String maSp, String tenSp, double donGia) {
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.donGia = donGia;
    }

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

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

   

    public void nhap() {
       maSp =  nhapChuoi("Mời bạn nhập mã sản phẩm: ", sc);
        tenSp = nhapChuoi("Mời bạn nhập tên sản phẩm: ", sc);
       donGia = nhapGia("Mời bạn nhập giá sản phẩm: ", sc);

    }

    public String nhapChuoi(String mss, Scanner sc) {
        System.out.println(mss);
        return sc.nextLine();
    }
    public double nhapGia(String ss, Scanner sc){
        System.out.println(ss);
        return Double.parseDouble(sc.nextLine());
    }
    public void xuat() {
        System.out.println(toString());
    }
     @Override
    public String toString() {
        return "SanPham{" + "maSp=" + maSp + ", tenSp=" + tenSp + ", donGia=" + donGia + '}';
    }
}
