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
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Moi ban nhap diem: ");
        double point = Double.parseDouble(sc.nextLine()); //Nhap vao 1 chuoi
                                                          //Roi chuyen chuoi thanh so thuc
        System.out.print("Moi ban nhap ten: ");
        String name = sc.nextLine();
        
        
        System.out.printf("Ten cua ban la: %s \nDiem cua ban la: %.2f", name, point);
        
       
//        String xepLoai =  point >= 5  ? "Dat" : "Truot";
//        
//        System.out.println(""+xepLoai);
        
        while (1>0) {            
            if (point < 5) {
            System.out.println("\nTruot");
        } else if(point <= 7) {
            System.out.println("\nTB");
        }
        else if(point <= 8){
            System.out.println("\nKha");
        }
        else{
            System.out.println("\nGioi");
        }
        }
    }
    
}
