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
   private String tenSp;
   private double donGia;

    public SanPham(String tenSp, double donGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
    }
    public SanPham(){
        
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
    
    
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap ten san pham: ");
        tenSp = sc.nextLine();
        System.out.println("Moi ban nhap gia san pham: ");
        donGia = Double.parseDouble(sc.nextLine());
        
    }
    public void xuat(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "SanPham{" + "tenSp=" + tenSp + ", donGia=" + donGia + '}';
    }
    
}
