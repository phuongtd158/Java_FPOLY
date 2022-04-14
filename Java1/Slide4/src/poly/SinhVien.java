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
public class SinhVien {

    //Khai báo thuộc tính
    private String hoTen;
    private double diem;
    
    //Hàm tạo (Constructor): Phương thức đặc biệt dùng để tạo đối tương
    //Phương thức này có tên giông tên lớp, không có giá trị trả về, không tham số
    
    //Trong 1 lớp có thể xây dựng nhiều hàm tao khác nhau
    
    //Nếu ko xây dựng hàm tạo thì java cho 1 hàm tạo mặc định ko tham số
    //để tạo đối tượng. Nếu xây dựng rồi thì ko cho nữa
    
    //Hàm tạo 2 tham số
    public SinhVien(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }
    
    //Hàm tạo không tham số
    public SinhVien() {
    }
    
    //---------------------------------------------------------------
    //Các phương thức set, get
    //Các phương thức set(thiết lập, gán): gán giá trị cho các thuộc tính
    //Các phương thức get(lấy về): lấy giá trị của các thuộc tính

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    
    
    //Nhập thông tin cho các thuộc tính
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.print("Mời bạn nhâp điểm: ");
        diem = Double.parseDouble(sc.nextLine());

    }

    //Xuất thông tin cho các thuộc tính + các thông tin khác
    public void output() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Điểm: " + diem);
        System.out.println("Xếp loại: " + getXepLoai(diem));
//        System.out.println(hoTen + "\t" + diem + "\t" +getXepLoai(diem));
    }

    public String getXepLoai(double diem) {
        if (diem < 5) {
            return "Trượt";
        } else {
            return "Đạt";
        }
    }

    //-------------------------------------------------------------
    //Nạp chồng phương thức (overloading): Trong 1 lớp ta có thể xây dựng nhiều phương thưc cùng tên 
    //Chỉ cần khác nhau về số tham số, kiểu tham số, trật tự thứ tự tham số
    //VD: ta đã xây dựng getXepLoai() có 1 tham số
    //Bây h ta có thể xây dựng getXepLoai không tham số
    public String getXepLoai() {
        if (diem < 5) {
            return "Trượt";
        } else {
            return "Đạt";
        }
    }

    
    
    @Override
    public String toString() {
        return "SinhVien{" + "hoTen=" + hoTen + ", diem=" + diem + "Xep loai = " +getXepLoai()+  '}';
    }
    
}
