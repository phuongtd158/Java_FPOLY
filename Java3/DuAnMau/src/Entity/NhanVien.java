/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author ADMIN
 */
public class NhanVien {

    private String maNv, matKhau, hoTen, vaiTro = "Trưởng phòng";

    public NhanVien() {
    }

    public NhanVien(String maNv, String matKhau, String hoTen, String vaiTro) {
        this.maNv = maNv;
        this.matKhau = matKhau;
        this.hoTen = hoTen;
        this.vaiTro = vaiTro;
    }

    public String getMaNv() {
        return maNv;
    }

    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(String vaiTro) {
        this.vaiTro = vaiTro;
    }

    public boolean isVaiTro() {
        if (getVaiTro().equals("Trưởng phòng")) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "NhanVien{" + "maNv=" + maNv + ", matKhau=" + matKhau + ", hoTen=" + hoTen + ", vaiTro=" + vaiTro + '}';
    }

}
