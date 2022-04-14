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
public class SinhVien {

    private String maSv, hoTen;
    private NganHocPoly nganh;

    public SinhVien() {
    }

    public SinhVien(String maSv, String hoTen, NganHocPoly nganh) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.nganh = nganh;
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

    public NganHocPoly getNganh() {
        return nganh;
    }

    public void setNganh(NganHocPoly nganh) {
        this.nganh = nganh;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSv=" + maSv + ", hoTen=" + hoTen + ", nganh=" + nganh + '}';
    }

    public void xuat() {
        System.out.println("Mã sv: " + maSv + "\n Họ tên: " + hoTen +"\n Ngành học: "+getNganhHoc(nganh));
    }

    public String getNganhHoc(NganHocPoly nganhHoc) {
        if (nganhHoc == NganHocPoly.UD) {
            return "Ứng dụng";
        } else if (nganhHoc == NganHocPoly.DL) {
            return "Du lịch";
        } else if (nganhHoc == NganHocPoly.KS) {
            return "Khách sạn";
        }else
        return "Lập trình web";
    }

}
