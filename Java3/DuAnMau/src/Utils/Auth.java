/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import Entity.NhanVien;

/**
 *
 * @author ADMIN
 */
public class Auth {

    public static NhanVien user = null; //Duy trì user đăng nhập vào hệ thống

    //Xóa bỏ user đăng nhập trước đó khi đăng xuất
    public static void clear() {
        Auth.user = null;
    }

    //Kiểm tra đăng nhập hay chưa(Nếu user != null thì return true còn lại false )
    public static boolean isLogin() {
        return Auth.user != null;
    }

    //Kiểm tra người đăng nhập có phải trưởng phòng hay không
    public static boolean isManager() {
        return Auth.isLogin() && user.getVaiTro().equals("Trưởng phòng") ? true : false;
    }
}
