/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Moi nhap a");
        int a = Integer.parseInt(sc.nextLine());
         System.out.println("Moi nhap b");
         int b = Integer.parseInt(sc.nextLine());
        
        float x = (float)-b /a;
        
        System.out.println("x = " +x);
    }
    
    
}
