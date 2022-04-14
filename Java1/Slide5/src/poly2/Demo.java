/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly2;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Tạo đối tượng quản lý sinh viên
        QuanLySinhVien sv = new QuanLySinhVien();
        
        while (true) {
            System.out.println("------------------------------------------");
            System.out.println("0. Khoi tao");
            System.out.println("1. Nhập danh sách nhân viên từ bàn phím.");
            System.out.println("2. Xuất danh sách nhân viên ra màn hình");
            System.out.println("3. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím");
            System.out.println("4. Xóa nhân viên theo mã nhập từ bàn phím.");
            System.out.println("5. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím");
            System.out.println("6. Tìm các nhân viên theo khoảng lương nhập từ bàn phím.");
            System.out.println("7. Sắp xếp nhân viên theo họ và tên.");
            System.out.println("8. Sắp xếp nhân viên theo thu nhập.");
            System.out.println("9. Xuất 5 nhân viên có thu nhập cao nhất");
            System.out.println("10. Thoat");
            System.out.println("------------------------------------------");
            System.out.println("Moi ban chon chuc nang: ");
            int input = sc.nextInt();
             sv.khoiTao();
            switch (input) {
                case 0:
            
                    break;
                case 1:
                    System.out.println("1. Nhập danh sách nhân viên từ bàn phím.");
                    
                    sv.nhapDSVS();
                   
                    break;
                case 2:
                    System.out.println("2. Xuất danh sách nhân viên ra màn hình");
                     sv.xuatDSSV();
                    break;
                case 3:
                    System.out.println("3. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím");
                    break;
                case 4:
                    System.out.println("4. Xóa nhân viên theo mã nhập từ bàn phím.");
                    break;
                case 5:
                    System.out.println("5. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím");
                    break;
                case 6:
                    System.out.println("6. Tìm các nhân viên theo khoảng lương nhập từ bàn phím.");
                    break;
                case 7:
                    System.out.println("7. Sắp xếp nhân viên theo họ và tên.");
                   
                   sv.sapTheoHoTen();
                    break;
                case 8:
                    System.out.println("8. Sắp xếp nhân viên theo thu nhập.");
                    sv.sapTheoDiem();
                    break;
                case 9:
                    System.out.println("9. Xuất 5 nhân viên có thu nhập cao nhất");
                    break;
                case 10:
                    System.exit(input);
                    break;
                default:
                    System.out.println("Chuc nang khong ton tai. Vui long chon lai");
                    break;

            }
        }
    }
}
