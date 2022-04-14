/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai3 {

    Scanner sc = new Scanner(System.in);
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

  

    public Bai3() {

    }

    public void input() {

        System.out.println("Moi ban nhap ten sp: ");
        name = sc.nextLine();
        System.out.println("Moi ban nhap gia sp: ");
        price = Double.parseDouble(sc.nextLine());

    }

    public void ouput() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Bai3{" + "name=" + name + ", price=" + price + '}';
    }

}
