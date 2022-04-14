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
public class NhanVien {
    private String maNv;
    private String tenNv;
    private double luong;
    
    
    public NhanVien(String maNv, String tenNv, double luong) {
        this.maNv = maNv;
        this.tenNv = tenNv;
        this.luong = luong;
    }

    public NhanVien() {
    }
   
    public String getMaNv() {
        return maNv;
    }

    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }

    public String getTenNv() {
        return tenNv;
    }

    public void setTenNv(String tenNv) {
        this.tenNv = tenNv;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập mã nhân viên: ");
        maNv = sc.nextLine();
        System.out.println("Mời bạn nhập tên nhân viên: ");
        tenNv = sc.nextLine();
        System.out.println("Mời bạn nhập lương nhân viên: ");
        luong = Double.parseDouble(sc.nextLine());
    }
  public double getThuNhap(){
      return luong;
  }
       
    public double getThueTN(){
        if (luong < 9000000) {
            return 0;
        }
        else if(luong <=15000000){
            return luong * 0.1;
        }
        else{
            return luong * 0.12;
        }
    }
    public void xuat(){
        System.out.println(toString());
    }
    
    @Override
    public String toString() {
        return "NhanVien{" + "maNv = " + maNv + "\t"+ "tenNv = " + tenNv + "\t"+ "\t"+ "Thu nhap = " + getThuNhap() + "\t"+ "\t"+ "thueTn = " + getThueTN() +'}';
    }

    void compareTo(NhanVien a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
