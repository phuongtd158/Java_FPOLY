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
public class Student {
    public String id;
    public String name;
    public String grade;
    public int age;
    public float avgMark;
    public float fee;
    public String email;
    public String phoneNumber;
    
    public void study(String subject){
        System.out.println(name + " is doing" + " " +subject);
    }
    public void payFee(float amount){
        
    }
    public void doHomeWork(String subject){
        
    }
    public void doTest(String subject){
        
    }
}
