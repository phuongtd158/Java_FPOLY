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
public class Test2 {
    
    public static void main(String[] args) {
       Bai1();
       Scanner sc = new Scanner(System.in);
       
    }
    
    public static void menu() {
        System.out.println("----------------------");
        System.out.println("1.Bai 1               ");
        System.out.println("2.Bai 2               ");
        System.out.println("0.Thoat               ");
        System.out.println("----------------------");
    }
    public  static  void Bai1(){
         int input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ban muon nhap bang cuu chuong bao nhieu: ");
        input = sc.nextInt();
     
        for (int i = input; i <= input; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i*j);
            }
        }
    }

}
