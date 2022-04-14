/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly2;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
abstract public class SinhVienPoky {//Lớp trừu tượng
    //Khai báo thuộc tính, phưng thức,... bình thường

    private String hoTen, nganh;
    
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        hoTen = sc.nextLine();
        System.out.println("Nhap nganh: ");
        nganh = sc.nextLine();
    }
    public SinhVienPoky() {
    }

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
    
    public SinhVienPoky(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }
    
    abstract public double getDiem();

    public String getHocLuc() {
        if (getDiem() < 5) {
            return "Yếu";
        } else if (getDiem() < 6.5) {
            return "Trung bình";
        }
        else if(getDiem() <= 7.5){
            return "Khá";
        }
        else if(getDiem() <= 9){
            return "Giỏi";
        }
        else{
            return "Xuất sắc";
        }
        //Ngoài ra lớp có phương thức getDiem() không biết cách làm => phương thức trừu tượng
        //PHương thức trừu tượng: không có thân, khai báo dùng abstract
    }
}