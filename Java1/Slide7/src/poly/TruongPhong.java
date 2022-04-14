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
public class TruongPhong extends NhanVien1 { //Trường phòng kế thùa nhân viên

    
    
    //Khi đó TruongPhong được phép sử dụng tài sản(Thuộc tính, phương thức ) của cha
    //Nếu cha cho phép: public, protected, default(Nếu cha con cùng gói)
    //gọi đến tài sản của cha
    
    private double trachNhiem;
    
    public TruongPhong() {
        //super(); gọi đến hàm tạo không tham số của cha
        //trachNghiem = 0
    }

    public TruongPhong(double trachNhiem, String hoTen, double luong) {
        super(hoTen, luong);
        this.trachNhiem = trachNhiem;
    }

   

    
    //set, get

    public double getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    @Override
    public String toString() {
        return super.toString() + "TruongPhong{" + "trachNhiem=" + trachNhiem + '}';
    }

    @Override
    public void nhap() {
        super.nhap(); //gọi đến phuong thức nhập của cha
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap luong trach nhiem: ");
        trachNhiem = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void xuat() {
        System.out.println(toString());
    }
    
    
}
