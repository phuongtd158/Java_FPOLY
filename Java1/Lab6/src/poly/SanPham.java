/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class SanPham {

    Scanner sc = new Scanner(System.in);
    private String tenSp, hangSp;
    private double giaSp;

    public SanPham() {
    }

    public SanPham(String tenSp, String hangSp, double giaSp) {
        this.tenSp = tenSp;
        this.hangSp = hangSp;
        this.giaSp = giaSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public String getHangSp() {
        return hangSp;
    }

    public void setHangSp(String hangSp) {
        this.hangSp = hangSp;
    }

    public double getGiaSp() {
        return giaSp;
    }

    public void setGiaSp(double giaSp) {
        this.giaSp = giaSp;
    }

    public void nhap() {

        hangSp = nhapChuoi("Moi ban nhap hang sp: ", sc);
        tenSp = nhapChuoi("Moi ban nhap ten sp: ", sc);
        giaSp = nhapSoThuc("Moi ban nhap gia sp: ", sc);

    }

    public void xuat() {
        System.out.println(toString());
    }

    public String nhapChuoi(String mss, Scanner sc) {
        System.out.println(mss);
        return sc.nextLine();
    }

    public double nhapSoThuc(String mss, Scanner sc) {
        System.out.println(mss);
        return Double.parseDouble(sc.nextLine());
    }

    @Override
    public String toString() {
        return "SanPham{" + "tenSp=" + tenSp + ", hangSp=" + hangSp + ", giaSp=" + giaSp + '}';
    }
}
