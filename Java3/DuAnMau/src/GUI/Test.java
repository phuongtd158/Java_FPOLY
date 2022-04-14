/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.NhanVienDAO;
import DAO.ThongKeDAO;
import Entity.NhanVien;
import Utils.XDate;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class Test {

    public static void main(String[] args) {
        // NhanVienDAO dao = new NhanVienDAO();
        //List<NhanVien> list = dao.selectAll();
//        for (NhanVien x : list) {
//            System.out.println("" + x.toString());
//        }

        //dao.update(new NhanVien("PhuongNM", "1234", "Nguyen Minh Phuong", "Nhân viên"));
//        ThongKeDAO tkDAO = new ThongKeDAO();
//        List<Object[]> list = tkDAO.getBangDiem(1);
//        for (Object[] x : list) {
//            System.out.println("" + x[0] + "-" + x[1] + "-" + x[2]);
//
//        }
//        Date now = new Date();
//
//        String s = XDate.toString(XDate.addDays(now, -608), "dd-MM-yyyy");
//        System.out.println("" + s);
        int row = 1;
        boolean test = row >= 0;
        System.out.println(!test);
    }

}
