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
public class MyThread extends Thread {
    
    @Override
    public void run(){
        for (int i = 1; i <= 10; i++) {
            System.out.println("T: "+i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                break;
            }
        }
    }
}
