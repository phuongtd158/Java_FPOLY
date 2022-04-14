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
        
        QLSP qlsp = new QLSP();
        qlsp.khoiTao();
         while (true) {
            System.out.println("1. Nhap DSSP");
            System.out.println("2 Xuat DSSP");
            System.out.println("3. Don gia tb");
            System.out.println("4. Xep DSSP tang");
            System.out.println("5. Xoa sp");
             System.out.println("0. Thoat");
            System.out.println("Moi ban chon: ");
            Scanner sc = new Scanner(System.in);
            int chon = sc.nextInt();

            switch (chon) {
                case 1:
                    qlsp.nhapDSSP();
                    break;
                case 2:
                    qlsp.xuatDSSP();
                    break;
                case 3:
                   
                     qlsp.donGiaTrungBinh();
                    break;
                case 4:
                    qlsp.sapXep();
                    break;
                case 5:
                    qlsp.xoaSp();
                    break;
                 case 0:
                     System.exit(0);
                     break;
                default:
                    System.out.println("Chuc nang khong ton tai. Nhap lai");
            }
        }

    }
        
    }
    

