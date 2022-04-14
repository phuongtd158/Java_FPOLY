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
public class DongVat {
    
    private String ten;
    private int cangNang, gioiTinh;
    Scanner sc = new Scanner(System.in);
    public DongVat() {
    }

    public DongVat(String ten, int cangNang, int gioiTinh) {
        this.ten = ten;
        this.cangNang = cangNang;
        this.gioiTinh = gioiTinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getCangNang() {
        return cangNang;
    }

    public void setCangNang(int cangNang) {
        this.cangNang = cangNang;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "DongVat{" + "ten=" + ten + ", cangNang=" + cangNang + ", gioiTinh=" + gioiTinh + '}';
    }
    
    public void nhap(){
        ten = nhapChuoi("Moi ban nhap ten: ", sc);
        do {
             cangNang = nhapSoThuc("Moi ban nhap can nang: ", sc);
             if (cangNang < 0) {
                System.out.println("Nhap lai");
            }
        } while (cangNang < 0);
        
        do {
             gioiTinh = nhapSoThuc("Moi ban nhap gioi tinh (1. Duc, 2.Cai)", sc);
             System.out.println("Nhap lai: ");
        } while (gioiTinh != 1 && gioiTinh != 2);
        
    }
    public void xuat(){
        System.out.println(toString());
    }
    public String nhapChuoi(String ms, Scanner sc){
        System.out.println(ms);
        return sc.nextLine();
        
    }
    public int nhapSoThuc(String ms, Scanner sc){
        System.out.println(ms);
        return Integer.parseInt(sc.nextLine());
    }
    
    
}
