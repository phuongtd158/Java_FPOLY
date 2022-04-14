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
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QLFan qLFan = new QLFan();
        qLFan.khoiTao();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Nhap 1 doi tuong hoac danh sach doi tuong");
            System.out.println("2. Xuat 1 doi tuong hoac danh sach doi tuong");
            System.out.println("3. In theo mau");
            System.out.println("4.Sap giam");
            System.out.println("5. Price max");
            System.out.println("0. Thoat");
            System.out.println("Chon chuc nang: ");
            int chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    qLFan.nhapDSFan();
                    break;
                case 2:
                     qLFan.xuatDSFan();
                    break;
                case 3:
                     qLFan.inMau();
                    break;
                case 4:
                     qLFan.sapGiam();
                    break;
                case 5:
                    qLFan.priceMax();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chuc nang khong ton tai");
            }
        }
    }

}
