/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class main {
    public static void main(String[] args) {
        QLSP qlsp = new QLSP();
        Scanner sc = new Scanner(System.in);
       
         while (true) {   
        System.out.println("1. Nhập danh sách sản phẩm từ bàn phím");
        System.out.println("2. Sắp xếp giảm dần theo giá và xuất ra màn hình");
        System.out.println("3. Tìm và xóa sản phẩm theo tên nhập từ bàn phím");
        System.out.println("4. Xuất giá trung bình của các sản phẩm");
        System.out.println("5. Thoat");
        System.out.print("Chon: ");
        int input = sc.nextInt();
        
                
            switch (input) {
                case 1:
                    qlsp.nhapDSSP();
                    break;
                    case 2:
                    qlsp.sapXep();
                    break;
                    case 3:
                    qlsp.timVaXoa();
                    break;
                    case 4:
                    qlsp.giaTb();
                    break;
                    case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhap lai");
            }
        }
    }
}
