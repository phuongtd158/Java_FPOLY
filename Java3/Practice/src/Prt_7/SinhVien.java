/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prt_7;

/**
 *
 * @author ADMIN
 */
public class SinhVien {

    private String maSv, hoTen;

    public SinhVien() {
    }

    public SinhVien(String maSv, String hoTen) {
        this.maSv = maSv;
        this.hoTen = hoTen;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    @Override
    public String toString() {
        return maSv;
    }

}
