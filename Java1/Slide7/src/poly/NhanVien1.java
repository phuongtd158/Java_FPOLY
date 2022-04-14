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
public class NhanVien1 {
  private String hoTen;
   private double luong;

    public NhanVien1(String hoTen, double luong) {
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public NhanVien1() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.println("Nhap luong: ");
        luong = Double.parseDouble(sc.nextLine());
    }
    
    public void xuat(){
        System.out.println(toString());
    }
    
    @Override
    public String toString() {
        return "Bai1{" + "hoTen=" + hoTen + ", luong=" + luong + '}';
    }
    
}
