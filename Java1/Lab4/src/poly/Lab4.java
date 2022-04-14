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
public class Lab4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Bai 1");
        System.out.println("2.Bai 2");
        System.out.println("3.Bai 3");
        System.out.println("4.Bai 4");
        System.out.println("5.Bai 5");

        System.out.println("Moi ban chon chuc nang: ");
        int inp = Integer.parseInt(sc.nextLine());

        switch (inp) {
            case 1:
                SanPham sp = new SanPham();
                sp.input();

                sp.output();
                break;
            case 2:
                SanPham sp1 = new SanPham();    
                
                sp1.input();
                sp1.output();

                SanPham sp2 = new SanPham();
                sp2.input();
                sp2.output();
                break;
            case 3:
                SanPham sp3 = new SanPham("But", 10000, 2000);
                sp3.output();
                SanPham sp4 = new SanPham("Vo", 10000);
                sp4.output();
                break;
            case 4:
                SanPham sp5 = new SanPham("Sp1",20000, 2000);
                
                  sp5.getTenSp();
                    sp5.output();
                  sp5.setTenSp("Sp4");
                  System.out.println("Sau khi doi ten: ");
                  sp5.output();
                break;
            case 5:
                System.exit(inp);
                break;
            default:
                System.out.println("Chon lai");
        }
    }

}
