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
public class Fan {
        String name, color;
        double price;
        Scanner sc = new Scanner(System.in);
    public Fan() {
    }

    public Fan(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public void nhap(){
        name = nhapChuoi("Moi ban nhap ten: ", sc);
        color = nhapChuoi("Moi ban nhap mau: ", sc);
        price = nhapSothuc("Moi ban nhap gia: ", sc);
    }
    public void xuat(){
        System.out.println(toString());
    }
    public String nhapChuoi(String ms, Scanner sc){
        System.out.println(ms);
        return sc.nextLine();
    }
    public double nhapSothuc(String ms, Scanner sc){
        System.out.println(ms);
        return Double.parseDouble(sc.nextLine());
    }
    
    @Override
    public String toString() {
        return "Fan{" + "name=" + name + ", color=" + color + ", price=" + price + '}';
    }
        
    
}
