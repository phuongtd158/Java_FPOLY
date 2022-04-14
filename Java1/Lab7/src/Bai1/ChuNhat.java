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
public class ChuNhat {
    double rong, dai;

    public ChuNhat(double rong, double dai) {
        this.rong = rong;
        this.dai = dai;
        
    }

    public ChuNhat() {
    }

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

  
    
    public double getChuVi(){
        return (dai + rong) * 2;
    }
    public double getDienTich(){
        return dai * rong;
    }
    public void xuat(){
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "ChuNhat{" + "rong=" + rong + ", dai=" + dai + ", chuVi=" + getChuVi() + ", dienTich=" + getDienTich() + '}';
    }
    
    
}
