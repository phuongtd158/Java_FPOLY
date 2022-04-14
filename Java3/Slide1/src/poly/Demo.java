
package poly;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Demo{
    public static void main(String[] args) {
        DemoAWT demo = new DemoAWT();
        demo.setVisible(true); //hiển hị form lên
        demo.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
             System.exit(0);
            }
            
        });
        
    }
}
