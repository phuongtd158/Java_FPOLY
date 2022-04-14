/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai1 {

    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
         while (true) {
             System.out.println("Nhap so: ");
           double input = Double.parseDouble(sc.nextLine());
            list.add(input);
            System.out.println("Ban có muốn nhập tiếp không(Y/N)");
            String hoi = sc.nextLine();
            if (hoi.equalsIgnoreCase("N")) {
                break;
            }
        }
          System.out.print("So vua nhap la: ");
             for(Double x:list){
                 System.out.print(" "+x);
         }
             double tong = 0;
         System.out.println("\nTong la: ");
         for(Double x:list){
             tong += x;
         }
         System.out.print(" "+  tong);
}
   
}   
