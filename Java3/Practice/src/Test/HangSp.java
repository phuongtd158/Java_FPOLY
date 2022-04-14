/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author ADMIN
 */
public class HangSp {
    
    public String maSp, tenSP;
    public double gia;
    public int maHang;
    
    public HangSp() {
    }
    
    public HangSp(String maSp, String tenSP, double gia, int maHang) {
        this.maSp = maSp;
        this.tenSP = tenSP;
        this.gia = gia;
        this.maHang = maHang;
    }
    
    public String getMaSp() {
        return maSp;
    }
    
    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }
    
    public String getTenSP() {
        return tenSP;
    }
    
    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }
    
    public double getGia() {
        return gia;
    }
    
    public void setGia(double gia) {
        this.gia = gia;
    }
    
    public int getMaHang() {
        return maHang;
    }
    
    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }
    
    @Override
    public String toString() {
        return String.valueOf(maHang);
        
        
    }
    
}
