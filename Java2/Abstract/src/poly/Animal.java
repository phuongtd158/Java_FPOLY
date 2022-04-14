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
public interface Animal {
    //Tất cả các phương thức trong interface đều là abstract
   String eating();
   String moving();
  
}

//Kế thừa interface phải dùng "implements"
class Cat implements Animal{

    @Override
    public String eating() {
       return "Ăn cá";
    }
 
    @Override
    public String moving() {
       return "hihi";
    }
    public void show(){
        System.out.println("Ăn: "+eating());
        System.out.println("Di chuyển: "+moving());
        
    }   
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.show();
    }
}

