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
public class QLSP {
    Scanner sc = new Scanner(System.in);
    ArrayList<SanPham> list = new ArrayList<>();
    SanPham sp = new SanPham();
    public void khoiTao() {
        list.add(new SanPham("Sp1", 10000, 500));
        list.add(new SanPham("Sp2", 20000, 600));
        list.add(new SanPham("Sp3", 30000, 700));
        list.add(new SanPham("Sp4", 40000, 800));
        list.add(new SanPham("Sp5", 50000, 900));
    }

    public void nhapDSSP() {
        while (true) {
            SanPham sp = new SanPham();
            sp.nhap();
            list.add(sp);
            
            String hoi = sp.nhapChuoi("Ban muon nhap them sp khong(Y/N) ", sc);
            if (hoi.equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    public void xuatDSSP() {
        for (SanPham x : list) {
            x.xuat();
        }
    }

    public void sapXep() {
        Comparator<SanPham> compa = new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                Double d1 = o1.getDonGia();
                Double d2 = o2.getDonGia();

                return d1.compareTo(d2);
            }
        };
        Collections.sort(list, compa);
        xuatDSSP();
    }

    public void donGiaTrungBinh() {
        double tong = 0, tb = 0;

        SanPham sp = new SanPham();
        for (SanPham x : list) {
            tong += x.getDonGia();
        }
        tb = tong / list.size();
        System.out.println("Don gia trung binh la: " + tb);
    }

    public void xoaSp() {

        String tenSp =sp.nhapChuoi("Moi ban nhap ten sp can xoa: ", sc);
        boolean check = false;
        for (SanPham x : list) {
            if (x.getTen().equalsIgnoreCase(tenSp)) {
                list.remove(x);
                System.out.println("Xoa thanh cong san pham co ten: " + tenSp);
                System.out.println("Danh sach sp sau khi xoa la: ");
                xuatDSSP();
                check = true;
                break;
                //Xoa sp bang for i
//                for (int i = 0; i < list.size(); i++) {
//                    if (list.get(i).getTen().equalsIgnoreCase(tenSp)) {
//                        list.remove(i)
//                    }
//                }
                
            }
        }
        if (check == false) {
            System.out.println("Khong ton tai san pham co ten"+tenSp);
        }
    }
}
