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
public class LittleCat extends Cat{
    private String color;

    public LittleCat() {
    }

    public LittleCat(String name,String color, int age, double weight) {
        super(age, weight, name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void xuat() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() +  "LittleCat{" + "color=" + color + '}';
    }

   
    
}
