/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly2;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class QuanLySinhVien {

    //Khai báo 1 list chứa SinhVien
    ArrayList<SinhVien> listSv = new ArrayList<>();

    //Xây dựng các phương thức y1 -> y9
    //Y1: Nhập danh sách sv
    public void nhapDSVS() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            SinhVien sv = new SinhVien();
            sv.input();
            listSv.add(sv);
            System.out.println("Bạn có muốn tiếp tuc không(Y/N): ");
            String hoi = sc.nextLine();
            if (hoi.equalsIgnoreCase("N")) {
                break;
            }
        }
        
    }
    public void khoiTao(){
        listSv.add(new SinhVien("Tran Duc Phuong", 10));
        listSv.add(new SinhVien("Huyen", 8));
        listSv.add(new SinhVien("Ngoc", 9));
    }
    public  void xuatDSSV(){
        for(SinhVien x:listSv){
           x.output();
        }
    }
    //Y7:
    public void sapTheoHoTen(){
        //Tạo comparator định nghĩa tiêu chí so sánh giữa SV và so sánh hten
        //Nhớ import
       Comparator<SinhVien> cp = new Comparator<SinhVien>() {
           @Override
           public int compare(SinhVien o1, SinhVien o2) {
               String s1 = o1.getHoTen();
               String s2 = o2.getHoTen();
               return s1.compareTo(s2);
           }
       };
        Collections.sort(listSv, cp); // Thực hiện sắp
        System.out.println("List sau khi sắp");
       xuatDSSV();
    }
   
     public void sapTheoDiem(){
        //Tạo comparator định nghĩa tiêu chí so sánh giữa SV và so sánh hten
        //Nhớ import
       Comparator<SinhVien> cp = new Comparator<SinhVien>() {
           @Override
           public int compare(SinhVien o1, SinhVien o2) {
               Double d1 = o1.getDiem();
               Double d2 = o2.getDiem();
              return d1.compareTo(d2); //Sắp giảm đổi chỗ d1 và d2
           }
       };
        Collections.sort(listSv, cp); // Thực hiện sắp
        System.out.println("List sau khi sắp");
        xuatDSSV();
    }
}
