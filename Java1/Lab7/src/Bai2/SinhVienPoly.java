/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
abstract public class SinhVienPoly {
    private String hoTen, nganh;

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

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }
  
    abstract public double getDiem();
    
    public String getHocLuc(){
        if (getDiem() < 5) return "Hoc luc: Yeu";
        else if(getDiem() <6.5) return "Hoc luc: Trung Binh";
        else if(getDiem()<7.5) return "Hoc luc: Kha";
        else if(getDiem() < 9) return "Hoc luc: Gioi";
        else return "Hoc luc: Xuat sac";    
    }
    
}
