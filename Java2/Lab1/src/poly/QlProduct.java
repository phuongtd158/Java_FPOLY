/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

import poly.Product;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class QlProduct {
    ArrayList<Product> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void khoiTao(){
        list.add(new Product("1", 2));
        list.add(new Product("2", 5));
        list.add(new Product("3", 3));
        
    }
    public void nhapDS(){
        Product prd = new Product();
        while (true) {
            prd.nhap();
            list.add(prd);
            System.out.println("Bạn có muốn nhập thêm không(Y/N)");
            String hoi = sc.nextLine();
           
            if (hoi.equalsIgnoreCase("N")) {
                break;
            }
        }
       
    }
    public void xuatDS(){
        for(Product x:list){
            x.xuat();
        }
    }
}
