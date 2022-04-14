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
public class SP extends SanPham{
    private double weight;

    public SP() {
        super();
        weight = 0;
    }

    public SP(double weight, String tenSp, double donGia) {
        super(tenSp, donGia);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() + "SP{" + "weight=" + weight + '}';
    }

    @Override
    public void xuat() {
        System.out.println(toString());
    }

  
    
    
}
