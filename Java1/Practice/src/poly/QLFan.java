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
public class QLFan {

    ArrayList<Fan> list = new ArrayList<>();

    public void khoiTao() {
        list.add(new Fan("San pham 1", "den", 1));
        list.add(new Fan("San pham 2", "do", 55));
        list.add(new Fan("San pham 3", "tim", 99));
        list.add(new Fan("San pham 4", "xanh", 99));
    }

    public void nhapDSFan() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            Fan fan = new Fan();

            fan.nhap();
            list.add(fan);
            System.out.println("Ban co muon nhap them khong(Y/N)");
            String hoi = sc.nextLine();
            if (hoi.equalsIgnoreCase("N")) {
                break;
            }
        }

    }
    public void xuatDSFan(){
        for(Fan x:list){
            x.xuat();
        }
    }
    public void inMau(){
        for(Fan x:list){
            if (x.getColor().equalsIgnoreCase("blue")) {
                x.xuat();
            }
        }
    }
    public void sapGiam(){
        Comparator<Fan> comparator = new Comparator<Fan>() {
            @Override
            public int compare(Fan o1, Fan o2) {
               Double d1 = o1.getPrice();
               Double d2 = o2.getPrice();
               
               return d2.compareTo(d1);
            }
        };
        Collections.sort(list,comparator);
        xuatDSFan();
    }
    public void priceMax(){
         double  max = list.get(0).getPrice();
        for (int i = 0; i < list.size(); i++) {      
            if (list.get(i).getPrice() > max) {
                max = list.get(i).getPrice();    
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (max == list.get(i).getPrice()) {
                list.get(i).xuat();
            }
        }
       
        
    }
}
