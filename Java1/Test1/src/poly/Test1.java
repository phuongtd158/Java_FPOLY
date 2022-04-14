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
public class Test1 {

    public static void main(String[] args) {
        String name, gender;
        double weight;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Moi ban nhap can nang: ");
        weight = scanner.nextDouble();
        //scanner.nextLine();
        System.out.println("Moi ban nhap ten: ");
        name = scanner.nextLine();  
        System.out.println("Moi ban nhap gioi tinh: ");
        gender = scanner.nextLine();

        System.out.println("Can nang: " + weight + " kg");
        System.out.println("Ten la: " + name);
        System.out.println("Gioi tinh:: " + gender);

        System.out.printf("Ten la: %s \nGioi tinh: %s \nCan nang: %.2f kg", name, gender, weight);

    }
}
