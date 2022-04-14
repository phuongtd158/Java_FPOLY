/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class ThongTin implements Serializable{
    private String hoTen, gioiTinh, nganhHoc, kyNang;

    public ThongTin() {
    }

    public ThongTin(String hoTen, String gioiTinh, String nganhHoc, String kyNang) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.nganhHoc = nganhHoc;
        this.kyNang = kyNang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }
    
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(String nganhHoc) {
        this.nganhHoc = nganhHoc;
    }

    public String getKyNang() {
        return kyNang;
    }

    public void setKyNang(String kyNang) {
        this.kyNang = kyNang;
    }
    
    @Override
    public String toString() {
        return "ThongTin{" + "hoTen=" + hoTen + ", gioiTinh=" + gioiTinh + ", nganhHoc=" + nganhHoc + ", kyNang=" + kyNang + '}';
    }
    
    
    
}
