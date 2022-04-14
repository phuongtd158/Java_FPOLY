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
public class Test3{

  
    public static void main(String[] args) {
        
        while (true) {            
            Scanner sc = new Scanner(System.in);
        
        System.out.println("\n1.Bai 1");
        System.out.println("2.Bai 2");
        System.out.println("3.Bai 3");
        System.out.println("1.Bai 1");
        System.out.println("Chon: ");
        int input = sc.nextInt();
       switch(input){
           case 1:
               bai1();
               break;
                case 2:
               bai2();
               break;
                case 3:
               
               break;
       }
        }
    }
    public static void bai1() {
        Scanner sc = new Scanner(System.in);
        //Bang nhan 5
        for (int i = 1; i < 10; i++) {
            System.out.printf("5 * %d = %d", i, 5 * i);
        }
        
       //Bang cuu chuong
        for (int i = 1; i <= 10; i++) {
           
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
            System.out.println("");
        }
    }
    public static void bai2(){
        int arr[] = {1, 2, 3, 5 ,6};
        System.out.println("Kich thuoc mang la: "+arr.length);
        System.out.println("Phan tu dau tien la: "+arr[0]);
        System.out.println("Phan tu cuoi cung la: "+arr[arr.length -1]);
        System.out.println("Phan tu thu 3 la: "+arr[2]);
        
        //Xuat mang for - each
        for(double x: arr){
            System.out.print(x +" ");
        }
        //Xuat mang dung tien ich Arrays
        System.out.println("\nXuat mang dung tien ich arrays:"+Arrays.toString(arr));
        //Sap xep dung sorts
        Arrays.sort(arr);
        System.out.println("Xap xep mang tang dan"+Arrays.toString(arr));

    }
    
}
