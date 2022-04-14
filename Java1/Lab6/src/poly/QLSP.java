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
public class QLSP {
Scanner sc = new Scanner(System.in);
    ArrayList<SanPham> list = new ArrayList<>();

    public void nhapDSSP() {
        while (true) {
            SanPham sp = new SanPham();
            sp.nhap();
            list.add(sp);
            Scanner sc = new Scanner(System.in);
            System.out.println("Bạn có muốn nhập thêm ko(Y/N)");
            String hoi = sc.nextLine();
            
                if(hoi.equalsIgnoreCase("N")){
                    break;
                }
            
        }
    }

    public void xuatDSSP() {
       
        for (SanPham x : list) {
            if (x.getTenSp().equalsIgnoreCase("Nokia")) {
                x.xuat();
            }
        }
    }
}
