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
public class QLDV {
    
    ArrayList<DongVat> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    public void nhapDSDV(){
        while (true) {            
            DongVat dv = new DongVat();
            dv.nhap();
            list.add(dv);
            System.out.println("Ban co muon nhap them khong (Y/N)");
            String hoi = sc.nextLine();
            if (hoi.equalsIgnoreCase("N")) {
                break;
            }
        }
    }
    public void xuatDSDV(){
        for(DongVat x:list){
            x.xuat();
    }
    }
    public void timTheoTen(){
        System.out.println("Moi ban nhap ten can tim: ");
        String ten = sc.nextLine();
        boolean check = false;
        for(DongVat x:list){
            if (ten.equalsIgnoreCase(x.getTen())) {
                x.xuat();
                check = true;
                break;
        }
        }
        
        if (check == false) {
            System.out.println("Khong co dong vat co ten "+ten);
        }
    }
    public void inTheoKhoangCanNang(){
        int min, max;
        System.out.println("Moi ban nhap khoang can nang thap nhap: ");
        min = Integer.parseInt(sc.nextLine());
        System.out.println("Moi ban nhap khoang can nang cao nhat: ");
        max = Integer.parseInt(sc.nextLine());
        for(DongVat x: list){
            if (x.getCangNang() >= min && x.getCangNang() <= max) {
                x.xuat();
            }
        }
    }
    public String tiengKeu(){
        return "";
    }
    public String tiengKeu(String tiengKeu){
        return tiengKeu;
    }   
}
      
