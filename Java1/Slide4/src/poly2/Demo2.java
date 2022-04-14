/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly2;

import poly.SinhVien;

/**
 *
 * @author ADMIN
 */
public class Demo2 {
    public static void main(String[] args) {
        //Lớp sinh viên đang ở gói poly
        //Ta đang ở gói poly2 => muốn dùng SihVien phải import
        SinhVien sv = new SinhVien("Phuong", 10);
        sv.output();
    }
}
