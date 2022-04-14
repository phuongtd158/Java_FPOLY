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
    private String maNv, tenNv;
    private int namSinh, tuoi;
    private double luong;
    Scanner sc = new Scanner(System.in);
        
    
    
    public NhanVien() {
    }

    public NhanVien(String maNv, String tenNv, int namSinh, double luong) {
        this.maNv = maNv;
        this.tenNv = tenNv;
        this.namSinh = namSinh;
        this.luong = luong;
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

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public int getTuoi() {
        return 2021 - namSinh;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    
    public String getTrangThai(){
        if (getLuong() > 5000) {
            return "Tot";
        }
        else{
            return "Binh thuong";
        }
    }
    
    @Override
    public String toString() {
        return "NhanVien{" + "maNv=" + maNv + ", tenNv=" + tenNv + ", namSinh=" + namSinh + ", luong=" + luong + ", tuoiNv="+ getTuoi() +", trangThai="+getTrangThai()+'}';
    }
    
    public void nhap(){
        tenNv = nhapChuoi("Moi ban nhao ten nhan vien: ", sc);
        maNv = nhapChuoi("Moi ban nhap ma nhan vien: ", sc);
        luong = nhapSoThuc("Moi ban nhap luong:  ", sc);
        namSinh = nhapSoNguyen("Moi ban nhap nam sinh: ", sc);
    }
    public int nhapSoNguyen(String ms, Scanner sc){
        System.out.println(ms);
        return Integer.parseInt(sc.nextLine());
    }
    public double nhapSoThuc(String ms, Scanner sc){
        System.out.println(ms);
        return Double.parseDouble(sc.nextLine());
    }
    public String nhapChuoi(String ms, Scanner sc){
        System.out.println(ms);
        return sc.nextLine();
    }
    public void inThongTin(){
        System.out.println(toString());
    }
}
