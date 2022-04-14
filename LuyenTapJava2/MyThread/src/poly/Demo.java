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
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        MyThread t = new MyThread();
//
//        t.start();
//        try {
//           t.join();
//        } catch (Exception e) {
//        }
//        
//        Thread t3 = new Thread(new MyRunable());
//
//        t3.start();
//        try {
//            t3.join();
//        } catch (Exception e) {
//        }
        
        MyRunable r = new MyRunable();
        Thread m1 = new Thread(r);
        Thread m2 = new Thread(r);
        m1.start();
        m2.start();
    }

}
