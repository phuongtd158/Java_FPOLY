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
public class XHelper {
        
    //Khối static () sẽ chạy trước khi khởi tạo dối tượng
    //Truy xuât bất kì thành viên tĩnh khác
    
    static {
        System.out.println("Khối static sẽ chạy đầu tiên");
        System.out.println("HELLO");
    }
    
    
    //Tham số biên đổi
    
    public int sum(int... a) {
        int tong = 0;
        for (int x : a) {
            tong += x;
        }
        return tong;
    }

    static public int tinhTong(int... a) {
        int tong = 0;
        for (int x : a) {
            tong += x;
        }
        return tong;
    }
    
    public static int so;
}
