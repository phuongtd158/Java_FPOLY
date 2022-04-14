/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import bai1.*;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Bai2 b2 = new Bai2();
        while (true) {
            System.out.println("1.Bai 1");
            System.out.println("2.Bai 2");
            System.out.println("3.Bai 3");
            System.out.println("4.Bai 4");
            System.out.println("5.Bai 5");
            System.out.println("6.THoat");
            System.out.println("Chon: ");
            int inp = sc.nextInt();
            switch (inp) {
                case 1:
                    b2.input();
                    break;
                case 2:
                    b2.output();
                    break;
                case 3:
                    b2.showRandom();
                    break;
                case 4:
                    b2.sapGiam();
                    break;
                case 5:
                    b2.xoa();
                    break;
                case 6:
                    System.exit(inp);
                    break;
                default:
                    System.out.println("Nhap lai");
            }
        }
    }
}
