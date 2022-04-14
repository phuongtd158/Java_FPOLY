/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

/**
 *
 * @author ADMIN
 */
public class Slide4 {
    public static void main(String[] args) {
//        SinhVien sv = new SinhVien();
//        sv.input();
//        sv.output();
//        
//        SinhVien sv2 = new SinhVien();
//        sv2.input();
//        sv2.output();
        
        SinhVien sv3 = new  SinhVien("Phuong", 10);
        sv3.output();
        //Sửa điểm của sv3 thành 3
        sv3.setDiem(9);
        System.out.println("Điểm sau khi sửa là: ");
        sv3.output();
        System.out.println(sv3);
        
    }
}
