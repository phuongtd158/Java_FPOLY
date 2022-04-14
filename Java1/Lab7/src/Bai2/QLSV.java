/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class QLSV {

    ArrayList<SinhVienPoly> list = new ArrayList<>();

    public void nhapDSSV() {
        double diem1, diem2, diem3;
        String hoTen, chuyenNganh;

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Moi ban nhap ho ten: ");
            hoTen = sc.nextLine();
            System.out.println("Moi ban nhap chuyen nganh(IT, Biz) ");
            chuyenNganh = sc.nextLine();
            if (chuyenNganh.equalsIgnoreCase("IT")) {
                System.out.println("Moi ban nhap diem Java: ");
                diem1 = Double.parseDouble(sc.nextLine());
                System.out.println("Moi ban nhap diem HTML: ");
                diem2 = Double.parseDouble(sc.nextLine());
                System.out.println("Moi ban nhap diem CSS: ");
                diem3 = Double.parseDouble(sc.nextLine());
                SinhVienIT sv = new SinhVienIT(diem1, diem2, diem3, hoTen, chuyenNganh);
                list.add(sv);
            }
            if (chuyenNganh.equalsIgnoreCase("Biz")) {
                System.out.println("Moi ban nhap diem Marketing: ");
                diem1 = Double.parseDouble(sc.nextLine());
                System.out.println("Moi ban nhap diem Sales: ");
                diem2 = Double.parseDouble(sc.nextLine());
                SinhVienBiz sv = new SinhVienBiz(diem1, diem2, hoTen, chuyenNganh);
                list.add(sv);
            }
            System.out.println("Ban co muon nhap them khong(Y/N)");
            String hoi = sc.nextLine();
            if (hoi.equalsIgnoreCase("N")) {
                break;
            }

        }

    }

    public void xuatDSSV() {
        for(SinhVienPoly x:list){
            System.out.println("Ho ten: "+x.getHoTen() + "\tChuyen nganh: " +x.getNganh() + "\t"+x.getHocLuc());
           
           
        }
    }
    
    public void svGioi(){
        for(SinhVienPoly x: list){
            if (x.getHocLuc().equalsIgnoreCase("Hoc luc: Gioi")) {
               System.out.println("Ho ten: "+x.getHoTen() + "\tChuyen nganh: " +x.getNganh() + "\t"+x.getHocLuc());
            }
        }
    }
    public void sapXep(){
        Comparator<SinhVienPoly> comparator = new Comparator<SinhVienPoly>() {
            @Override
            public int compare(SinhVienPoly o1, SinhVienPoly o2) {
                Double d1 = o1.getDiem();
                Double d2 = o2.getDiem();
                return d1.compareTo(d2);
            }
        };
        Collections.sort(list,comparator);
        xuatDSSV();
    }
}
