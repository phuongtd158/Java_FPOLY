/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Sllide6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập họ tên: ");
        String name = sc.nextLine();
        System.out.println("Họ tên vừa nhập là: " + name);
        System.out.println("Họ tên in hoa: " + name.toUpperCase());

        //Tìm vị trí xuât hiện đầu tiên của khoảng trắng
        int vtd = name.indexOf(" ");
        //Tìm vị trí xuât hiện cuối của khoảng trắng
        int vtc = name.lastIndexOf(" ");
        //Lấy chuỗi ở vị trí phù hợp
        String ho = name.substring(0, vtd);
        String tenDem = name.substring(vtd + 1, vtc);
        String ten = name.substring(vtc + 1);
        
        System.out.println("Họ là: "+ho.toUpperCase());
        System.out.println("Tên đệm là: " +tenDem.toUpperCase());
        System.out.println("Tên là: " +ten.toUpperCase());
    }

}
