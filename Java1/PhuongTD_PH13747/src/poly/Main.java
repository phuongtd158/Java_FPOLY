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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QLChicken qLChicken = new QLChicken();
        qLChicken.khoiTao();
        while (true) {
            System.out.println("1. Nhap 1 doi tuong hoac danh sach doi tuong");
            System.out.println("2. Xuat 1 doi tuong hoac danh sach doi tuong");
            System.out.println("3. In cac phan tu theo khoang gia");
            System.out.println("4. Sap tang dan theo gia");
            System.out.println("5. Tinh gia trung binh");
            System.out.println("6. Thoat");
            Scanner sc = new Scanner(System.in);
            System.out.println("Moi ban chon chuc nang: ");
            int chon = sc.nextInt();

            switch (chon) {
                
                case 1:
                    qLChicken.nhapDS();
                    break;
                case 2:
                   
                    qLChicken.xuatDS();
                    break;
                case 3:
                    qLChicken.inTheoKhoang();
                    break;
                case 4:
                    qLChicken.sapXep();
                    break;
                case 5:
                    qLChicken.tinhGiaTrungBinh();
                    break;
                case 6:
                    System.exit(0);
                    break;
                    case 7:
                    LittleChicken littleChicken = new LittleChicken(7, "ga", "den", 1);
                    littleChicken.inThongTin();
                    break;
                default:
                    System.out.println("Moi ban chon lai");
            }
        }

    }

}
