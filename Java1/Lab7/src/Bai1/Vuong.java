/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;
/**
 *
 * @author ADMIN
 */
public class Vuong extends ChuNhat{

   
    public Vuong( double canh) {
        super(canh, canh);
        super.dai = super.rong = canh;
    }
   
    @Override
    public void xuat(){
        System.out.println("Canh la: "+super.dai);
        System.out.println("Chu vi la: "+super.getChuVi());
        System.out.println("Dien tch la: "+super.getDienTich());
    }
  
    
}
