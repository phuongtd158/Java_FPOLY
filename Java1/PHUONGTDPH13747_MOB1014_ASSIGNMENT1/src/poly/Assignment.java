/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Assignment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLNV qlnv = new QLNV();
        ArrayList<NhanVien> list =  new ArrayList<>();
        qlnv.khoiTao();
        while (true) {
            System.out.println("------------------------------------------");
            System.out.println("1. Nhập danh sách nhân viên từ bàn phím.");
            System.out.println("2. Xuất danh sách nhân viên ra màn hình");
            System.out.println("3. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím");
            System.out.println("4. Xóa nhân viên theo mã nhập từ bàn phím.");
            System.out.println("5. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím");
            System.out.println("6. Tìm các nhân viên theo khoảng lương nhập từ bàn phím.");
            System.out.println("7. Sắp xếp nhân viên theo họ và tên.");
            System.out.println("8. Sắp xếp nhân viên theo thu nhập.");
            System.out.println("9. Xuất 5 nhân viên có thu nhập cao nhất");
            System.out.println("0. Thoat");
            System.out.println("------------------------------------------");
            System.out.println("Moi ban chon chuc nang: ");
            int input = sc.nextInt();

            switch (input) {

                case 1:
                    System.out.println("1. Nhập danh sách nhân viên từ bàn phím.");
                   qlnv.listNhanVien();
                    break;
                case 2:
                    System.out.println("2. Xuất danh sách nhân viên ra màn hình");
                    qlnv.xuatDSNV();
                    break;
                case 3:
                    System.out.println("3. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím");
                    qlnv.timNv();
                    break;
                case 4:
                    System.out.println("4. Xóa nhân viên theo mã nhập từ bàn phím.");
                    qlnv.xoaNv();
                    break;
                case 5:
                    System.out.println("5. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím");
                    qlnv.capNhatNv();
                    break;
                case 6:
                    System.out.println("6. Tìm các nhân viên theo khoảng lương nhập từ bàn phím.");
                    qlnv.timTheoKhoangLuong();
                    break;
                case 7:
                    System.out.println("7. Sắp xếp nhân viên theo họ và tên.");
                    qlnv.sapTheoTen();
                    break;
                case 8:
                    System.out.println("8. Sắp xếp nhân viên theo thu nhập.");
                    qlnv.sapTheoThuNhap();
                    break;
                case 9:
                    System.out.println("9. Xuất 5 nhân viên có thu nhập cao nhất");
                    qlnv.topNv();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chuc nang khong ton tai. Vui long chon lai");
                    break;

            }
        }

    }

}
