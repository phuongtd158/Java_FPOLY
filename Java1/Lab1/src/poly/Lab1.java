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
public class Lab1 {

    public static void main(String[] args) {

        //Bai 1:
        double diem;
        String tenSv;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap ho ten: ");
        tenSv = scanner.nextLine();
        System.out.println("Moi ban nhap diem TB: ");
        diem = scanner.nextDouble();

//        System.out.println("Ho ten cua ban la: " +tenSv);
//        System.out.println("Diem TB cua ban la: " +diem);
        System.out.printf("Ten sinh vien la: %s \nDiem la: %.3f", tenSv, diem);

        //Bai 2:

        double chieuDai, chieuRong, chuVi, dienTich, canhNhoNhat;

        Scanner sc = new Scanner(System.in); //Tao doi tuong scanner
        System.out.println("\nMoi ban nhap chieu dai: ");
        chieuDai = sc.nextDouble();         //Doc vao 1 so thuc, gan gia tri cho chieu dai
        System.out.println("Moi ban nhap chieu rong: ");
        chieuRong = sc.nextDouble();        //Doc vao 1 so thuc, gan gia tri cho chieu rong

        chuVi = (chieuDai + chieuRong) * 2;
        dienTich = chieuDai * chieuRong;
        canhNhoNhat = Math.min(chieuDai, chieuRong);

        System.out.printf("Chu vi la: %.2f \nDien tich la: %.2f \nCanh nho nhat la: %.2f", chuVi, dienTich, canhNhoNhat);


        //Bai 3

        double canh, theTich;

        Scanner input = new Scanner(System.in);
        System.out.println("Moi ban nhap canh: ");
        canh = input.nextDouble();

        //theTich = canh * canh * canh;
        theTich = Math.pow(canh, 3);

        System.out.printf("The tich la: %.2f", theTich);

        //Bai 4

        int a, b, c;
        double delta, canDelta;

        Scanner newSc = new Scanner(System.in);
        System.out.println("Nhap he so thu 1: ");
        a = newSc.nextInt();
        System.out.println("Nhap he so thu 2: ");
        b = newSc.nextInt();
        System.out.println("Nhap he so thu 3: ");
        c = newSc.nextInt();

        delta = Math.pow(b, 2) - 4 * a * c;
        canDelta = Math.sqrt(delta);

        if (delta == 0) {
            double x = -b/2*a;
            System.out.printf("Phuong trinh co nghiem 1 nghiem kep la: %f", x);
        }
        else if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        }
        else{
            double x1 = -canDelta/2*a;
            double x2 = canDelta/2*a;

            System.out.printf("Phuong trinh co 2 nghiem x1 = %.2f, x2 = %.2f", x1,x2);
        }

        System.out.printf("\nDelta: %.2f \nCan delta: %.2f", delta, canDelta);

    }
}
