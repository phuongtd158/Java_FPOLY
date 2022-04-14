/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author ADMIN
 */
public class Bai2 {

    public static void main(String[] args) {
        //Array lít định kiểu: chỉ lưu được kiểu qui định
        //+. lấ ra: Không định kiểu
        //tenlist.size() - 1 ==> Số phần tử

        //về code slide 5 trang 6
        //Tạo array list lưu số thực
        ArrayList<Double> newList = new ArrayList<>();

        //Thêm 3 phần tử vào list
        newList.add(1.5);
        newList.add(2.5);
        newList.add(Double.valueOf(7)); //==> Chuyển số nguyên về só thực ==>  tenlist.add(Double.valueOf(number));
        newList.set(0, 0.5);  //tenlist.set(vị trí list, phần tử cần thêm); ==> Sửa 

        //Duyệt list
        //c1:
//        for (int i = 0; i < tenlist.size(); i++) {
//            KieuerDLList tên biến = tenlist.get(i)
//            Làm việc với tên biến
//        }
        //c2:
//        for (kiểu dữ liệu list x : tên list) {
//            //Làm việc với x
//        }


        System.out.println("Duyệt list theo for i: ");
        for (int i = 0; i < newList.size(); i++) {
            Double e = newList.get(i);
           // System.out.println(newList.get(i)); 
            System.out.println(e);
        }
        
        
        System.out.println("Duyệt list theo for each: ");
        for(Double x:newList){
            System.out.println(x);
        }
        
        //Sắp tăng
        Collections.sort(newList);
        System.out.println("Mang sau khi sap");
        for(Double x:newList){
            System.out.println(x);
        }
    }

}
