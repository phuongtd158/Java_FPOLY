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
public class TruongPhong extends NhanVien {

    private double trachNhiem;

    public TruongPhong() {
        super();
        trachNhiem = 0;
    }

    public TruongPhong(double trachNhiem, String maNv, String tenNv, double luong) {
        super(maNv, tenNv, luong);
        this.trachNhiem = trachNhiem;
    }

    public double getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    @Override
    public void nhap() {
        super.nhap(); //To change body of generated methods, choose Tools | Templates.
         Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn lương trách nhiệm: ");
        trachNhiem = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void xuat() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() +"TruongPhong{" + "trachNhiem=" + trachNhiem + '}';
    }
    
    

    @Override
    public double getThuNhap() {
       return  getLuong() + trachNhiem;
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
    
    
    
}
