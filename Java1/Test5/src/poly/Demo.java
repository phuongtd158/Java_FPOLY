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
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLSP sp = new QLSP();
        sp.khoiTao();
        while (true) {
            System.out.println("1. Nhap DSSP");
            System.out.println("2 Xuat DSSP");
            System.out.println("3. Nhap DSSP theo don gia");
            System.out.println("4. Xep DSSP giam");
            System.out.println("5. THhoat");
            System.out.println("Moi ban chon: ");
            int chon = sc.nextInt();

            switch (chon) {
                case 1:
                    sp.nhapDSSP();
                    break;
                case 2:
                    sp.xuatDSSP();
                    break;
                case 3:
                    sp.xuatTheoDonGia();
                    break;
                case 4:
                   SP sp1 = new SP(1, "s", 2);
                   sp1.xuat();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    throw new AssertionError();
            }
        }

    }

}
