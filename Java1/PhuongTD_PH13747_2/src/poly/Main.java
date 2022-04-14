/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

import java.awt.peer.LightweightPeer;
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
        QLCat qlcat = new QLCat();
        qlcat.khoiTao();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Nhap");
            System.out.println("2. Xuat");
            System.out.println("3. In thong tin can nang");
            System.out.println("4. Sap giam");
            System.out.println("5. Age min");
            System.out.println("6.Ke thua");
            System.out.println("0. Thoat");
            System.out.println("Moi ban chon chuc nang: ");

            int chon;
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    qlcat.nhapDSCat();
                    break;
                case 2:
                    qlcat.xuatDSCat();
                    break;
                case 3:
                    qlcat.inCanNang();

                    break;
                case 4:
                    qlcat.sapGiam();
                    break;
                case 5:
                    qlcat.min();
                    break;
                case 6:
                    LittleCat littleCat = new LittleCat("Tom 2", "Black", 1, 2);
                    littleCat.xuat();
                    break;
                case 0:
                    System.exit(0);
                    break;

                default:
                    throw new AssertionError();
            }
        }

    }

}
