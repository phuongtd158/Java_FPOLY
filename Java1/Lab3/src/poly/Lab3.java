/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Lab3 {

    public static void main(String[] args) {

        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("\n");
            System.out.println("1. Kiem tra so nguyen to");
            System.out.println("2. Xuat bang cuu chuong");
            System.out.println("3. Nhap mang so nguyen tu ban phim");
            System.out.println("4. Nhap mang thong tin sinh vien");
            System.out.println("5. Bai 5");
            System.out.println("6.Bai 6");
            System.out.println("7. Thoat");
            System.out.print("Moi ban chon chuc nang: ");
            int input = sc.nextInt();

            switch (input) {
                case 1:
                    bai1();
                    break;
                case 2:
                    bai2();
                    break;
                case 3:
                    bai3();
                    break;
                case 4:
                    bai4();
                    break;
                case 5:
                    bai5();
                    break;
                case 6:
                    bai6();
                    break;
                case 7:
                    System.exit(input);
                    break;
                default:
                    System.out.println("Chuc nang khong ton tai. Vui long chon lai");
                    break;
            }
        }

    }

    public static void bai1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap so can kiem tra: ");
        int input = sc.nextInt();

        boolean ok = true;
        for (int i = 2; i <= Math.sqrt(input); i++) {
            if (input % i == 0) {
                System.out.println(input + "không là số nguyên tố");
                ok = false;
                break;
            }
        }

        if (ok == true) {
            System.out.println(input + "là số nguyên tố");
        }

    }

    public static void bai2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap bang cuu chuong: ");
        int input = sc.nextInt();

        for (int i = input; i <= input; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("\n%d * %d = %d", i, j, i * j);
            }
        }
    }

    public static void bai3() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap do dai cua mang: ");
        int input = sc.nextInt();
        int a[] = new int[input];
        for (int i = 0; i < input; i++) {

            System.out.print("So thu la " + i + 1 + ": ");
            a[i] = sc.nextInt();
        }
        System.out.print("Cac so vua nhap la: ");
        for (int i = 0; i < input; i++) {
            System.out.print(" " + a[i]);
        }
        //a
        System.out.print("\nSap xep: ");
        for (int i = 0; i < input; i++) {
            for (int j = i + 1; j < input; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.print(" " + a[i]);
        }
        //b
        int min = a[0];
        for (int i = 0; i < input; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("\nSo nho nhat la: " + min);
        //c
        int tong = 0, count = 0;
        for (int i = 0; i < input; i++) {
            if (a[i] % 3 == 0) {
                tong = tong + a[i];
                count++;
            } else {
                System.out.println("Khong co so nao chia het cho 3");
                break;
            }
        }
        double tb = (double) tong / count;
        System.out.printf("Trung binh cac so chia het cho 3 la: %.1f ", tb);
    }

    public static void bai4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ban muon nhap bao nhieu sinh vien: ");

        int input = Integer.parseInt(sc.nextLine());
        String mangSv[] = new String[input];

        String name[] = new String[mangSv.length];
        double diem[] = new double[mangSv.length];

        for (int i = 0; i < mangSv.length; i++) {
            System.out.printf("Ten sinh vien thu %d la: ", i + 1);
            name[i] = sc.nextLine();
            System.out.printf("Diem cua sinh vien thu %d la: ", i + 1);
            diem[i] = Double.parseDouble(sc.nextLine());
        }
        for (int i = 0; i < mangSv.length; i++) {
            System.out.printf("Ten cua sinh vien thu %d la: %s\n", i + 1, name[i]);
            System.out.printf("Diem  cua sinh vien thu %d la: %.1f\n", i + 1, diem[i]);
            if (diem[i] < 5) {
                System.out.print("Hoc luc: Yeu\n");
            } else if (diem[i] < 6.5) {
                System.out.print("Hoc luc: Trung Binh\n");
            } else if (diem[i] < 7.5) {
                System.out.print("Hoc luc: Kha\n");
            } else if (diem[i] < 9) {
                System.out.print("Hoc luc: Gioi\n");
            } else {
                System.out.print("Hoc luc: Xuat sac\n");
            }
        }
        System.out.println("Sau khi sap xep: ");
        for (int i = 0; i < mangSv.length; i++) {
            for (int j = i + 1; j < mangSv.length; j++) {
                //Sap xep theo ten
                if (diem[i] > diem[j]) {
                    String st = name[i];
                    name[i] = name[j];
                    name[j] = st;
                    //Sap xep diem 
                    double temp = diem[i];
                    diem[i] = diem[j];
                    diem[j] = temp;
                }
            }

            System.out.printf("Ten cua sinh vien thu %d la: %s\n Diem  cua sinh vien thu %d la: %.1f\n", i + 1, name[i], i + 1, diem[i]);
        }

    }

    public static void bai5() {

        String arr[] = {"d", "a", "e", "c", "f"};

        Arrays.sort(arr);
        System.out.println("Mang sau khi sap xep la: " + Arrays.toString(arr));

    }

    public static void bai6() {
        int numStudent[] = {40, 39, 44, 44, 41};
        String name[] = {"PT16035", "PT16037", "PT16032", "PT16041", "PT16033"};
        
        for (int i = 0; i < name.length; i++) {
            System.out.println("numStudent: " + numStudent[i] + "\t" + "name: " + name[i]);
        }

        for (int i = 0; i < name.length; i++) {
            for (int j = i + 1; j < name.length; j++) {
                //Sap xep diem
                if (numStudent[i] < numStudent[j]) {
                    int temp = numStudent[i];
                    numStudent[i] = numStudent[j];
                    numStudent[j] = temp;
                    //Hoan doi ten
                    String st = name[i];
                    name[i] = name[j];
                    name[j] = st;
                }

            }
            System.out.println("Ten lop la: " + name[i] + "\t" + "So hoc sinh la: " + numStudent[i]);
        }
        int max = numStudent[0];
        for (int i = 0; i < name.length; i++) {
            if (numStudent[i] == max) {
                System.out.println(""+name[i]);
            }
        }
       
        
    }
}
