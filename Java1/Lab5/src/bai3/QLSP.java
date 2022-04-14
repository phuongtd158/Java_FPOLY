/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class QLSP {
String name;
    Scanner sc = new Scanner(System.in);
    Bai3 b3 = new Bai3();
    ArrayList<Bai3> list = new ArrayList<>();

    public void nhapDSSP() {
        while (true) {
            Bai3 sp = new Bai3();
            sp.input();
            list.add(sp);
            
            System.out.println("Ban co muon nhap them khong(Y/N) ");
            String hoi = sc.nextLine();
            if (hoi.equalsIgnoreCase("N")) {
                break;
            }
        }

    }
    public void xuatDSSP(){
        for(Bai3 x:list){
            x.ouput();
        }
    }
    public void sapXep(){
        Comparator<Bai3> cp = new Comparator<Bai3>() {
            @Override
            public int compare(Bai3 o1, Bai3 o2) {
                Double d1 = o1.getPrice();
                Double d2 = o2.getPrice();
                return d2.compareTo(d1);
                
            }
        };
//        Collections.sort(list, (a,b) -> (int)(a.getPrice() - b3.getPrice()));
        Collections.sort(list, cp);
        xuatDSSP();
}   
    public void timVaXoa(){
        xuatDSSP();
        System.out.println("Nhap ten can xoa: ");
         name = sc.nextLine();
         Bai3 found = null;
        for(Bai3 x: list){
            if (x.getName().equals(name)) {
            list.remove(x);
            found = x;
            break;
        }
        }
        if (found != null) {
            System.out.println("XOa thanh cong. Danh sach sau khi xoa la:");
            xuatDSSP();
        }
        else{
            System.out.println("San pham ko co trong danh sach");
        }
       
       
    }
    public void giaTb(){
        double tong = 0, avg = 0;
        
        for(Bai3 x:list){
          tong += x.getPrice();
        }
        avg = tong / list.size();
        System.out.print("Gia trung binh la: "+avg);
    }
    
}
