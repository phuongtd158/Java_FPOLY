/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly3;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class NewClass {

    public static void main(String[] args) {
        String name[] = {"123456789", "a", "adv", "12345", "12345678"};

        int max = 0;
        int a = 0;
        for (int i = 0; i < name.length; i++) {
            if (name[i].length() > max) {
                max = name[i].length();
                a = i;
            }
        }
        System.out.println("Tên có độ dài lớn nhất là: " + max + "Và là: " + name[a]);
    }
}
