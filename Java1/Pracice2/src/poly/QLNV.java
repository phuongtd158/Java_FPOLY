/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class QLNV {
    ArrayList<NhanVien> list = new ArrayList<>();
     Scanner sc = new Scanner(System.in);
     
    public void khoiTao(){
        list.add(new NhanVien("NV1", "Phuong", 2002, 1000));
        list.add(new NhanVien("NV2", "Ahuong", 2001, 300));
        list.add(new NhanVien("NV3", "Zhuong", 2000, 5100));
        list.add(new NhanVien("NV4", "Bhuong", 2004, 6000));
        list.add(new NhanVien("NV5", "Hhuong", 2005, 2000));
    }
    public void nhapDSNV(){
      
        while (true) {
            NhanVien nv = new NhanVien();
            nv.nhap();
            list.add(nv);
            System.out.println("Co nhap tiep khong(Y/N)");
            String hoi = sc.nextLine();
            if (hoi.equalsIgnoreCase("N")) {
                break;
            }
        }
    }
    public void xuatDSNV(){
        for(NhanVien x:list){
            x.inThongTin();
        }
    }
    public void xuatNv500(){
         for(NhanVien x:list){
             if (x.getLuong() > 500) {
                 x.inThongTin();
             }
         }
    }
    public void xuatTheoKhoang(){
       
        System.out.println("Moi ban nhap luong thap nhat: ");
        double min = Double.parseDouble(sc.nextLine());
        System.out.println("Moi ban nhap luong cao nhat: ");
        double max = Double.parseDouble(sc.nextLine());
        for(NhanVien x: list){
            if (x.getLuong() >= min && x.getLuong() <= max) {
                x.inThongTin();
            }
        }
    }
    public void timNvTheoMa(){
        System.out.println("Moi ban nhap ma nhan vien can tim: ");
        String maNhanVien = sc.nextLine();
        boolean check = true;
        for(NhanVien x:list){
            if (maNhanVien.equalsIgnoreCase(x.getMaNv())) {
                x.inThongTin();
               
           }

        }
    }
    public void xuatNhanVienTheoTuoi(){
        System.out.println("Cac nhan vien co tuoi tu 18 den 30 la: ");
        for(NhanVien x: list){
            if (x.getTuoi()>= 18 && x.getTuoi()<= 30) {
                x.inThongTin();
            }
        }
    }
    public void demNvTuoiTren18(){
        int count = 0;
        for(NhanVien x:list){
            if (x.getTuoi() > 18) {
                count++;
            }
        }
        System.out.println("So nhan vien co tuoi tren 18 la: "+count);
    }
    public void sapTheoTen(){
        Comparator<NhanVien> comparator = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
               return o2.getTenNv().compareTo(o1.getTenNv());
            }
        };
        System.out.println("Ten sau khi sap la: ");
        Collections.sort(list,comparator);
        xuatDSNV();
    }
     public void sapTheoLuong(){
            Comparator<NhanVien> comparator = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
               Double d1 = o1.getLuong();
               Double d2 = o2.getLuong();
               return d2.compareTo(d1);
            }
        };
            System.out.println("Luong sau khi sap la: ");
        Collections.sort(list,comparator);
        xuatDSNV();
    }
    public void sapTheoTuoi(){
            Comparator<NhanVien> comparator = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
               Integer i1 = o1.getTuoi();
               Integer i2 = o2.getTuoi();
               return i1.compareTo(i2);
            }
        };
            System.out.println("Tuoi sau khi sap la: ");
        Collections.sort(list,comparator);
        xuatDSNV();
    }
    public void timTheoMa(){
        System.out.println("Moi ban nhap ma nhan vien can tim: ");
        String maNv = sc.nextLine();
        boolean check = true;
        for(NhanVien x:list){
            if (maNv.equalsIgnoreCase(x.getMaNv())) {
                x.inThongTin();
                check = true;
                break;
            }
        }
        if (check == false) {
            System.out.println("Khong tim thay nhan vien co ma: "+maNv);
        }
    }
     public void timTheoTen(){
        System.out.println("Moi ban nhap ten nhan vien can tim: ");
        String tenNv = sc.nextLine();
        boolean check = true;
        for(NhanVien x:list){
            if (tenNv.equalsIgnoreCase(x.getTenNv())) {
                x.inThongTin();
                check = true;
                break;
            }
        }
        if (check == false) {
            System.out.println("Khong tim thay nhan vien co ten: "+tenNv);
        }
    }
    public void sapTheoTrangThai(){
        Comparator<NhanVien> comparator = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
               return o2.getTrangThai().compareTo(o1.getTrangThai());
            }
        };
        System.out.println("Trang sau khi sap la: ");
        Collections.sort(list,comparator);
        xuatDSNV();
    }
    public void xoaTheoMa(){
        System.out.println("Nhap ma nhan vien can xoa: ");
        String maNv = sc.nextLine();
        for(NhanVien x:list){
            if (maNv.equalsIgnoreCase(x.getMaNv())) {
                list.remove(x);
                break;
            }
        }
        System.out.println("Danh sach sau khi xoa la: ");
        xuatDSNV();
    }
    public void xuatTheoTuoiChan(){
        for(NhanVien x:list){
            if (x.getTuoi()% 2 == 0) {
                x.inThongTin();
            }
        }
    }
    public void xuatTheoTuoiLe(){
        for(NhanVien x:list){
            if (x.getTuoi()% 2 != 0) {
                x.inThongTin();
            }
        }
    }
}