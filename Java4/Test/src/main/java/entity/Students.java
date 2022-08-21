package entity;

import java.util.Date;

public class Students {
    private String maSv, hoTen, gioiTinh, chuyenNganh, sdt, email;
    private Date thoiGianTao;

    public Students(){

    }

    public Students(String maSv, String hoTen, String gioiTinh, String chuyenNganh, String sdt, String email, Date thoiGianTao) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.chuyenNganh = chuyenNganh;
        this.sdt = sdt;
        this.email = email;
        this.thoiGianTao = thoiGianTao;
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

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getThoiGianTao() {
        return thoiGianTao;
    }

    public void setThoiGianTao(Date thoiGianTao) {
        this.thoiGianTao = thoiGianTao;
    }

    @Override
    public String toString() {
        return "Students{" +
                "maSv='" + maSv + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", chuyenNganh='" + chuyenNganh + '\'' +
                ", sdt='" + sdt + '\'' +
                ", email='" + email + '\'' +
                ", thoiGianTao=" + thoiGianTao +
                '}';
    }
}
