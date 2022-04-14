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
public class Bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String soDTChuan = "0[0-9]{9,10}";
        String CMND = "[0-9]{9}";
        String hoTen, sdt, eml, cm;
        String Email = "\\w+@\\w+\\.\\w+";

        System.out.println("Nhap ho ten: ");
        hoTen = sc.nextLine();
        do {
            System.out.println("Moi nhap so dien thoai: ");
            sdt = sc.nextLine();

        } while (!sdt.matches(soDTChuan));
        do {
            System.out.println("Moi nhap so CMND: ");
            cm = sc.nextLine();

        } while (!cm.matches(CMND));
        do {
            System.out.println("Moi nhap email:  ");
            eml = sc.nextLine();

        } while (!eml.matches(Email));

        System.out.println("Ho ten: " + hoTen.toUpperCase());
        System.out.println("So dt: " + sdt);
        System.out.println("So CMND: " + cm);
        System.out.println("Email: " + eml);

    }
}
