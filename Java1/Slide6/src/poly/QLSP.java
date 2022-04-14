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
    

    public void khoiTao() {
        list.add(new SanPham("Sp1", "San pham 1", 5000));
        list.add(new SanPham("Sp2", "San pham 2", 2000));
        list.add(new SanPham("Sp3", "San pham 3", 6000));
    }

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
    public void xuat(){
        for(SanPham x:list){
           x.xuat();
        }
    }
}
