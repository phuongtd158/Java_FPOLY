/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import bai1.*;
import java.util.ArrayList;

import java.util.Collections;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai2 {

    String name;
    public ArrayList<String> arrayList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void input() {
        while (true) {
            System.out.println("Moi ban nhap ho ten: ");
            name = sc.nextLine();
            arrayList.add(name);
            System.out.println("Ban co muon nhap them khong(Y/N)");
            String hoi = sc.nextLine();
            if (hoi.equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    public void output() {
        System.out.println("Danh sach vua nhap la: ");
        for (String x : arrayList) {
            System.out.println(x);
        }
    }

    public void showRandom() {
        Collections.shuffle(arrayList); //Sap xep ngau nhien
        output();
    }

    public void sapGiam() {
        //c1
//        Collections.sort(arrayList); //Sap tang
//        Collections.reverse(arrayList); //Dao nguoc list
        //c2
        Collections.sort(arrayList, (a, b) -> b.compareTo(a)); //lamda expression
        System.out.println("Sap giam: ");
        output();
    }

    public void xoa() {
        System.out.println("Danh sach ho ten truoc khi xoa la: ");
        for (String x : arrayList) {
            System.out.println(x);
        }
        System.out.println("Moi ban nhap ten muon xoa: ");
        name = sc.nextLine();
        for (String x : arrayList) {
            if (x.equals(name)) {
                arrayList.remove(name);
                break;
            }
        }
         System.out.println("Danh sach ho ten sau khi xoa la: ");
        for (String x : arrayList) {
            System.out.println(x);
        }
    }

}
