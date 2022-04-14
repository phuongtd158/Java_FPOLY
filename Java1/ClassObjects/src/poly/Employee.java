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
public class Employee {
    public String fullname;
    public double salary;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap ten: ");
        fullname = sc.nextLine();
        System.out.println("Moi ban nhap luong: ");
        salary = Double.parseDouble(sc.nextLine());
    }
    public void output(){
        System.out.println("Ten la: "+this.fullname);
        System.out.println("Luong la:"+this.salary);
    }
    public void setInfo(String fullname, double salary){
        this.fullname = fullname;
        this.salary = salary;
    }
    public double incomeTax(){
        if (this.salary < 50000) {
            return 0;
        }
        double tax = (this.salary - 50000) *10/100;
         System.out.println("Thue la: " +tax);
        return 0;
       
    }
}
