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
public class Test4 {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom", 3, "Black");
        System.out.println(cat1.toString());
        
        Cat cat2 = new Cat();
        cat2.input();
        System.out.println("-------------");
        System.out.println(cat2.toString());
    }

}
