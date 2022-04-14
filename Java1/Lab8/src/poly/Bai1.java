/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(""+sum(1,3,4));
        System.out.println(min(4,5,6,3));
        
       String name = "tran duc phuong";
       String newName = toUpperFirstChar(name);
        System.out.println("New name: "+newName);
    }
    public static final double sum(double ... x){
        double tong = 0;
        for (double d : x) {
            tong += d;
        }
        return tong;
    }
    
    public  static  final double min(double...x){
        double nhoNhat = x[0];
        for (double d : x) {     
           nhoNhat = Math.min(nhoNhat, d);
        }
        return nhoNhat;
    }
     public  static  final double max(double...y){
        double lonNhat = y[0];
        for (double d : y) {     
          lonNhat= Math.max(lonNhat, d);
        }
        return lonNhat;
    }
   public static final String toUpperFirstChar(String name){
      String[] ars = name.split(" ");
      StringBuilder sb = new StringBuilder();
       for (int i = 0; i < ars.length; i++) {
          String item = ars[i];
           if (!item.equals("")) {
               String ch = item.substring(0, 1).toUpperCase();
               item = ch + item.substring(1).toLowerCase();
              sb.append(item).append(" ");
           }
       }
       return sb.toString().trim();
        
   }
    
}
