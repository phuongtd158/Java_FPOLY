/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

/**
 *
 * @author ADMIN
 */
public class RauSach {
    private String ten, diaChi;
    private double gia, khoangCach;

    public RauSach() {
    }

    public RauSach(String ten, String diaChi, double gia, double khoangCach) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.gia = gia;
        this.khoangCach = khoangCach;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public double getKhoangCach() {
        return khoangCach;
    }

    public void setKhoangCach(double khoangCach) {
        this.khoangCach = khoangCach;
    }
    
    
    
}
