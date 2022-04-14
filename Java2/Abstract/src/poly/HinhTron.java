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
public class HinhTron extends HinhHoc {
    
    double banKinh;
    //Kế thừa lớp abstract thì phải override lại phương thưc abstract của lớp cha

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }
    
    @Override
    double chuVi() {
      return 2 * banKinh * 3.14;
    }
  
    @Override
    double dienTich() {
       return 3.14 * banKinh * banKinh;
    }
    public void showInfo(){
        System.out.println("Diện tích là: "+dienTich());
        System.out.println("Chu vi là: "+chuVi());
        
    }
}
