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
public class NhanVienTuVan extends NhanVien {
    private String ngoaiNgu;

    public NhanVienTuVan() {
    }

    public NhanVienTuVan(String ngoaiNgu, String maNv, String tenNv, int namSinh, double luong) {
        super(maNv, tenNv, namSinh, luong);
        this.ngoaiNgu = ngoaiNgu;
    }

    public String getNgoaiNgu() {
        return ngoaiNgu;
    }

    public void setNgoaiNgu(String ngoaiNgu) {
        this.ngoaiNgu = ngoaiNgu;
    }

    @Override
    public void inThongTin() {
        System.out.println(toString());
    }

       
    @Override
    public String toString() {
        return super.toString() + "NhanVienTuVan{" + "ngoaiNgu=" + ngoaiNgu + '}';
    }
    
   
}
