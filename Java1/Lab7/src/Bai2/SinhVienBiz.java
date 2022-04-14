/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author ADMIN
 */
public class SinhVienBiz extends SinhVienPoly{
    private double diemMarketing, diemSale;

    public SinhVienBiz(double diemMarketing, double diemSale, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSale = diemSale;
    }

    @Override
    public double getDiem() {
        return (2 * diemMarketing + diemSale)/3;
    }
  
     
}
