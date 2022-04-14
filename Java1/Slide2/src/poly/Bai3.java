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
public class Bai3 {

    public static void main(String[] args) {

      month();
    }
    
    public static void month(){
        int day, month, year;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap thang: ");
        month =sc.nextInt();
        System.out.println("Moi ban nhap nam: ");
        year =sc.nextInt();
        
        if (month == 1 || month == 5 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("Thang co 31 ngay");
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("Thang co 30 ngay");
        }
        
        else{
            if (year % 4 == 0 && year % 100 != 0) {
                System.out.println("Thang co 29 ngay");
            }
            else{
                System.out.println("Thang co 28 ngay");
            }
        }
    }

}
