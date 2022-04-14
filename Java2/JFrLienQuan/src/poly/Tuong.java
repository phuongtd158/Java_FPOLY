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
public class Tuong {
    public String tenTuong, kyNang, loaiTuong;

    public Tuong() {
    }

    public Tuong(String tenTuong, String kyNang, String loaiTuong) {
        this.tenTuong = tenTuong;
        this.kyNang = kyNang;
        this.loaiTuong = loaiTuong;
    }

    public String getTenTuong() {
        return tenTuong;
    }

    public void setTenTuong(String tenTuong) {
        this.tenTuong = tenTuong;
    }

    public String getKyNang() {
        return kyNang;
    }

    public void setKyNang(String kyNang) {
        this.kyNang = kyNang;
    }
    public String getLoaiTuong(){
        return loaiTuong;
    }
    public void setLoaiTuong(String loaiTuong){
        this.loaiTuong = loaiTuong;
    }
}
