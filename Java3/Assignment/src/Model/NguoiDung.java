/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ADMIN
 */
public class NguoiDung {

    private String tenDangNhap, matKhauDangNhap, vaiTro;

    public NguoiDung() {
    }

    public NguoiDung(String tenDangNhap, String matKhauDangNhap, String vaiTro) {
        this.tenDangNhap = tenDangNhap;
        this.matKhauDangNhap = matKhauDangNhap;
        this.vaiTro = vaiTro;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMatKhauDangNhap() {
        return matKhauDangNhap;
    }

    public void setMatKhauDangNhap(String matKhauDangNhap) {
        this.matKhauDangNhap = matKhauDangNhap;
    }

    public String getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(String vaiTro) {
        this.vaiTro = vaiTro;
    }

}
