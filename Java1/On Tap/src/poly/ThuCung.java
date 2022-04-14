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
public class ThuCung extends DongVat{
    private String maThuCung;

    public ThuCung() {
    }

    public ThuCung(String maThuCung, String ten, int cangNang, int gioiTinh) {
        super(ten, cangNang, gioiTinh);
        this.maThuCung = maThuCung;
    }

    public String getMaThuCung() {
        return maThuCung;
    }

    public void setMaThuCung(String maThuCung) {
        this.maThuCung = maThuCung;
    }

    @Override
    public String toString() {
        return super.toString() + "ThuCung{" + "maThuCung=" + maThuCung + '}';
    }

    @Override
    public void xuat() {
        System.out.println(toString());
    }
    
   
}
