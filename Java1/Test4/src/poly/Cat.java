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
public class Cat {
    String name;
    double weight;
    String color;

        //Ham tao 3 tham so
    public Cat(String name, double weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }
    //Ham tao 0 tham so
    public Cat(){
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap ten: ");
        name = sc.nextLine();
        System.out.println("Moi ban nhap can nang: ");
        weight = Double.parseDouble(sc.nextLine());
        System.out.println("Moi ban nhap mau sac: ");
        color = sc.nextLine();
    }
    
    public String getXepLoai(double weight ){
        if (weight < 1) {
            return "Coi xuong";
        }
        else if(weight < 5){
            return "Trung binh";
        }
        else{
            return "Beo phi";
        }
    }

    @Override
    public String toString() {
        return "Cat{" + "name=" + name + ", weight=" + weight + ", color=" + color + ", Xep Loai=" + getXepLoai(weight)+'}';
    }
    
    
}
