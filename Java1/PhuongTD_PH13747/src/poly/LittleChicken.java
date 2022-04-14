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
public class LittleChicken extends Chicken{
    
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public LittleChicken() {
        super();
    }

    public LittleChicken(double weight, String name, String color, int price) {
        super(name, color, price);
        this.weight = weight;
    }

    @Override
    public void inThongTin() {

        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString()  + "LittleChicken{" + "weight=" + weight + '}';
    }

}
