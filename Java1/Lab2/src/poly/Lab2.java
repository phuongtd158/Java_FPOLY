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
public class Lab2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int input;
            System.out.println("\n+---------------------------------------------------+");
            System.out.println("1. Giải phương trình bậc nhất");
            System.out.println("2. Giải phương trình bậc 2");
            System.out.println("3. Tính tiền điện");
            System.out.println("4. Thong tin sinh vien");
            System.out.println("5. Kết thúc");
            System.out.println("+---------------------------------------------------+");
            System.out.println("Chọn chức năng: _");

            input = sc.nextInt();
            switch (input) {

                case 1:
                    giaiPTB1();
                    break;
                case 2:
                    giaiPTB2();
                    break;
                case 3:
                    giaiPTB3();
                    break;
                case 4:
                    giaiPTB4();
                    break;
                case 5:
                    System.exit(input);
                    break;
                default:
                    System.out.println("Chuc nang khong ton tai. Moi ban chon lai !");
                    break;
                    
                   
            }

        }

    }

    public static void giaiPTB1() {
        double a, b, x;

        System.err.println("Phuong trinh ax + b  = 0");

        Scanner sc = new Scanner(System.in);

        System.out.println("Moi ban nhap a:");
        a = sc.nextDouble();
        System.out.println("Moi ban nhap b:");
        b = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh luon dung");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            x = -b / a;
            System.out.printf("Phuong trinh co nghiem la: %.2f", x);
        }
    }

    public static void giaiPTB2() {

        double a, b, c, x, delta, sqrtDelta;

        System.out.println("Phuong trinh ax^2 + bx + c = 0");

        Scanner sc = new Scanner(System.in);

        System.out.println("Moi ban nhap a: ");
        a = sc.nextDouble();
        System.out.println("Moi ban nhap b: ");
        b = sc.nextDouble();
        System.out.println("Moi ban nhap c: ");
        c = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh luon dung");
                } else {
                    x = -c / b;
                    System.out.printf("Phuong trinh vo nghiem");
                }
            } else {
                x = -b / c;
                System.out.printf("Phuong trinh co nghiem la: %.2f", x);
            }
        } else {
            delta = Math.pow(b, 2) - 4 * a * c;
            sqrtDelta = Math.sqrt(delta);
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                double nghiemKep = -b / 2 * a;
                System.out.printf("Phuong trinh co 1 nghiem kep: %.2f", nghiemKep);
            } else {
                double x1 = -sqrtDelta / 2 * a;
                double x2 = sqrtDelta / 2 * a;
                System.out.printf("x1 = %.2f\n", x1);
                System.out.printf("x2 = %.2f", x2);
            }
        }
    }

    public static void giaiPTB3() {
        double dienNhoHon50, dienLonHon50, soDien;

        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap vao so dien: ");
        soDien = sc.nextDouble();

        if (soDien < 50) {
            dienNhoHon50 = soDien * 1000;
            System.out.printf("Tien phai tra la: %.2f", dienNhoHon50);
        } else {
            dienLonHon50 = 50 * 1000 + (soDien - 50) * 1200;
            System.out.printf("Tien phai tra la: %.2f", dienLonHon50);
        }
    }

    public static void giaiPTB4() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap ten sinh vien: ");
        String tenSv = sc.nextLine();
        System.out.println("Moi ban nhap diem Doc: ");
        double diemDoc = Double.parseDouble(sc.nextLine());
        System.out.println("Moi ban nhap diem Bv: ");
        double diemBv = Double.parseDouble(sc.nextLine());
        System.out.println("Moi ban nhap diem qua trinh: ");
        double diemQuaTrinh = Double.parseDouble(sc.nextLine());

        double TBMon = diemQuaTrinh * 0.6 + diemDoc * 0.1 + diemBv * 0.3;

        if (TBMon >= 5) {
            System.out.println("Trang thai: Dat");
        } else {
            System.out.println("Trang thai: Truot");
        }

        String xepLoai = TBMon >= 5 ? "Trang thai: Dat" : "Trang thai: Truot";
        System.out.println("" + xepLoai);

        System.out.println("Ten sinh vien la: " + tenSv);
        System.out.printf("Diem trung binh la: %.2f", TBMon);

    }
}
