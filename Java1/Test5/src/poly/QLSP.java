/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class QLSP {
    Scanner sc = new Scanner(System.in);
    
    ArrayList<SanPham> list = new ArrayList<>();
    
    public void khoiTao(){
        list.add(new SanPham("But", 2000));
        list.add(new SanPham("Thuoc", 3000));
        list.add(new SanPham("Vo", 4000));
    }
    
    public void nhapDSSP() {
        while (true) {
            SanPham sp = new SanPham();
            sp.nhap();
            list.add(sp);
            
            System.out.println("Ban co muon nhap them khong(Y/N) ");
            String hoi = sc.nextLine();
            if (hoi.equalsIgnoreCase("N")) {
                break;
            }
        }

    }
    public void xuatDSSP(){
        for(SanPham x:list){
            x.xuat();
        }
    }
    public void xuatTheoDonGia(){
        double min, max;
        System.out.println("Moi ban nhap gia nho nhat: ");
        min = Double.parseDouble(sc.nextLine());
        System.out.println("Moi ban nhap gia lon nhat: ");
        max = Double.parseDouble(sc.nextLine());
        for(SanPham x:list){
            if (x.getDonGia() >= min && x.getDonGia() <= max) {
                x.xuat();
            }
        }
    }
    public void sapGiam(){
        //Tạo comparator định nghĩa tiêu chí so sánh giữa SV và so sánh hten
        //Nhớ import
       Comparator<SanPham> cp = new Comparator<SanPham>() {
           @Override
           public int compare(SanPham o1, SanPham o2) {
               Double d1 = o1.getDonGia();
               Double d2 = o2.getDonGia();
              return d2.compareTo(d1); //Sắp giảm đổi chỗ d1 và d2
           }
       };
        Collections.sort(list, cp); // Thực hiện sắp
        System.out.println("List sau khi sắp");
       xuatDSSP();
    }
}
