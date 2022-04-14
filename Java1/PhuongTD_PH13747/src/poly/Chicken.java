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
public class Chicken {

    private String name, color;
    private int price;
    Scanner sc = new Scanner(System.in);

    public Chicken(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

   

    public Chicken() {
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void nhap() {
        name = nhapChuoi("Moi ban nhap ten: ", sc);
        color = nhapChuoi("Moi ban nhap mau sac: ", sc);
        price = nhapSoThuc("Moi ban nhap gia: ", sc);
    }

    public String nhapChuoi(String ms, Scanner sc) {
        System.out.println(ms);
        return sc.nextLine();
    }

    public int nhapSoThuc(String ms, Scanner sc) {
        System.out.println(ms);
        return Integer.parseInt(sc.nextLine());
    }

    public void inThongTin() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Chicken{" + "name=" + name + ", color=" + color + ", price=" + price + '}';
    }

}
