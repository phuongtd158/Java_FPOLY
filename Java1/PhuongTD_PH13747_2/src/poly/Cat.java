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
    private int age;
    private double weight;
    private String name;
    Scanner sc = new Scanner(System.in);
    public Cat() {
    }

    public Cat(int age, double weight, String name) {
        this.age = age;
        this.weight = weight;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" + "age=" + age + ", weight=" + weight + ", name=" + name + '}';
    }
    
    public void nhap(){
        name = nhapChuoi("Moi ban nhap ten: ", sc);
        age = nhapSoNguyen("Moi ban nhap tuoi: ", sc);
        weight = nhapSoThuc("Moi ban nhap can nang: ", sc);
    }
    public void xuat(){
           System.out.println(toString());
        }
    public String nhapChuoi(String ms, Scanner sc){
        System.out.println(ms);
        return sc.nextLine();
    }
    public int nhapSoNguyen(String ms, Scanner sc){
         System.out.println(ms);
        return Integer.parseInt(sc.nextLine());
    }
      public double nhapSoThuc(String ms, Scanner sc){
         System.out.println(ms);
        return Double.parseDouble(sc.nextLine());
    }
}
