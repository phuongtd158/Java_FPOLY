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
public class ClassObjects {

   
    public static void main(String[] args) {
        Cat tom = new Cat();
        tom.setName("Tom");
        tom.setAge(2);
        System.out.println(tom.getName());
        System.out.println(tom.getAge());
        tom.eat();
        tom.move();
        
        Cat dog = new  Cat();
        
//        dog.name = "Dog";
//        dog.weight = 13;
//        dog.sleep();
        
        Student phuong = new Student();
        
        phuong.name = "Phuong";
        phuong.grade = "PT16304";
        phuong.study("Math");
        
        Employee hi = new Employee();
        hi.input();
        hi.output();
        hi.incomeTax();
       
    }
    
}
