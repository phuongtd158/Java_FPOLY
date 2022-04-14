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
public class QLCat {

    ArrayList<Cat> list = new ArrayList<>();

    public void khoiTao() {
        list.add(new Cat(1, 2, "Tom 1"));
        list.add(new Cat(2, 1, "A 2"));
        list.add(new Cat(4, 5, "Z 3"));
        list.add(new Cat(3, 3, "B 4"));
    }
    public void nhapDSCat(){
         Scanner sc = new Scanner(System.in);
        while (true) {
            Cat cat = new Cat();
            cat.nhap();
            list.add(cat);
            System.out.println("Ban co muon nhap them khong(Y/N)");
            String hoi = sc.nextLine();
            if (hoi.equalsIgnoreCase("N")) {
                break;
            }
        }
       
        
    }
    public void xuatDSCat(){
        for(Cat x:list){
            x.xuat();
        }
    }
    public void inCanNang(){
        for(Cat x:list){
            if (x.getWeight() >= 3 && x.getWeight() <=5) {
                x.xuat();
            }
        }
    }
    public void sapGiam(){
        Comparator<Cat> comparator = new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                String s1 = o1.getName();
                String s2 = o2.getName();
                return s2.compareTo(s1);
            }
        };
        Collections.sort(list,comparator);
        xuatDSCat();
    }
    public void min(){
        int min = list.get(0).getAge();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAge() < min) {
                min = list.get(i).getAge();
            }
        }
        System.out.println("");
        for (int i = 0; i < list.size(); i++) {
            if (min == list.get(i).getAge()) {
                list.get(i).xuat();
            }
        }
    }
}
