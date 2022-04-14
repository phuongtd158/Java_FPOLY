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
public class Main {
    public static void main(String[] args) {
        QLSV qlsv = new QLSV();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Xuất thông tin danh sách sinh viên");
            System.out.println("3. Xuất danh sách sinh viên có học lực giỏi");
            System.out.println("4. Sắp xếp danh sách sinh viên theo điểm");
            System.out.println("5. Kết thúc");
            System.out.println("Chon chuc nang: ");
            int chon = sc.nextInt();
            
            switch (chon) {
                case 1:
                    qlsv.nhapDSSV();
                    break;
                    case 2:
                    qlsv.xuatDSSV();
                    break;
                    case 3:
                    qlsv.svGioi();
                    break;
                    case 4:
                    qlsv.sapXep();
                    break;
                    case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chuc nang khong ton tai");
            }
            
        }
        }
}
