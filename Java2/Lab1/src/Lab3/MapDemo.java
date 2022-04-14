/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author ADMIN
 */
public class MapDemo {
    public static void main(String[] args) {
        HashMap<String, SinhVien> map = new HashMap<>();
        SinhVien sv1 = new SinhVien();
        sv1.name = "Phương";
        sv1.marks = 10;
        sv1.major = "Công nghệ thông tin";
        
        map.put(sv1.name, sv1);
        
        Set<String> keys = map.keySet();
        
        for (String name : keys) {
            SinhVien sv = map.get(name);
            System.out.println("Họ tên: "+sv.name);
            System.out.println("Học lực: "+sv.getGrade());
        }
    }
}
