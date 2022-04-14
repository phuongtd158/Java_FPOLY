/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication55;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class JavaApplication55 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do dai mang:");
        int nhap = sc.nextInt();
        int count = 0;
        int i = 2;
        while (nhap > 1) {
            if (nhap % i == 0) {
                count++;
                if (nhap == i) {
                    System.out.printf("%d^%d", i, count);

                }
                nhap /= i;
            }
        }

    }

}
