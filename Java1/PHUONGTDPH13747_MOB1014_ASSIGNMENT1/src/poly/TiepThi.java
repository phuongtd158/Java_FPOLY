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
public class TiepThi extends NhanVien {

    private double doanhSo, hoaHong;

    public TiepThi() {
        super();
        doanhSo = 0;
        hoaHong = 0;
    }

    public TiepThi(double doanhSo, double hoaHong, String maNv, String tenNv, double luong) {
        super(maNv, tenNv, luong);
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }


    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHoaHong() {
        return hoaHong;
    }

    public void setHoaHong(double hoaHong) {
        this.hoaHong = hoaHong;
    }
    
    @Override
    public double getThuNhap() {
        return super.getLuong() + doanhSo + hoaHong;
    }

    @Override
    public double getThueTN() {
       
        if (getThuNhap() < 9000000) {
            return 0;
        }
        else if(getThuNhap() <=15000000){
            return getThuNhap() * 0.1;
        }
        else{
            return getThuNhap() * 0.12;
        }
    }

    @Override
    public void nhap() {
        super.nhap(); //To change body of generated methods, choose Tools | Templates.
         System.out.println("Nhập doanh số: ");
        Scanner sc = new Scanner(System.in);
        doanhSo = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập hoa hồng: ");
        hoaHong = Double.parseDouble(sc.nextLine());
    }

    @Override
    public String toString() {
        return super.toString()+"TiepThi{" + "doanhSo=" + doanhSo + ", hoaHong=" + hoaHong + '}';
    }

   

    @Override
    public void xuat() {
        System.out.println(toString());
    }

   
    
    
}
