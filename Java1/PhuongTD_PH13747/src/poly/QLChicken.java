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
public class QLChicken {

    ArrayList<Chicken> list = new ArrayList<>();
    public void khoiTao(){
        list.add(new Chicken("Ga 1", "Den", 5000));
        list.add(new Chicken("Ga 2", "Do", 2000));
        list.add(new Chicken("Ga 3", "Vang", 9000));
    }
    public void nhapDS() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            Chicken ck = new Chicken();
            ck.nhap();
            list.add(ck);
            System.out.println("Ban co muon nhap them khong(Y/N)");
            String hoi = sc.nextLine();
            if (hoi.equalsIgnoreCase("N")) {
                break;
            }

        }
    }
    public void xuatDS(){
        for(Chicken x:list){
            x.inThongTin();
        }
    }
    
    public void inTheoKhoang(){
        int min, max;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Moi bban nhap khoang gia thap nhat: ");
        min = sc.nextInt();
        System.out.println("Moi ban nhap khoang gia cao nhat: ");
        max = sc.nextInt();
        for(Chicken x:list){
            if (x.getPrice() >= min && x.getPrice() <= max) {
                x.inThongTin();
            }
        }
    }
    public void sapXep(){
        Comparator<Chicken> comparator = new Comparator<Chicken>() {
            @Override
            public int compare(Chicken o1, Chicken o2) {
                Integer d1 = o1.getPrice();
                Integer d2 = o2.getPrice();
                return d1.compareTo(d2);
            }
        };
        Collections.sort(list,comparator);
        System.out.println("Danh sach sau khi sap tang dan la: ");
        xuatDS();
    }
    public void tinhGiaTrungBinh(){
        int tong = 0, tb = 0;
        for(Chicken x:list){
            tong += x.getPrice();
        }
        tb = tong/list.size();
        System.out.println("Gia trung binh la: "+tb);
        
    }

}
