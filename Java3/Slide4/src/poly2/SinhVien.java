/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly2;

/**
 *
 * @author ADMIN
 */
public class SinhVien {

    private String maSv, hoTen, nganh;
    private int tuoi;

    public SinhVien() {
    }

    public SinhVien(String maSv, String hoTen, String nganh, int tuoi) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.nganh = nganh;
        this.tuoi = tuoi;
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

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public double getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return maSv;
    }

}
