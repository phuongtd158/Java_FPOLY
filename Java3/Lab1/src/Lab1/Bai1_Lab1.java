/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author ADMIN
 */
public class Bai1_Lab1 extends JFrame{
    
    JLabel lbTitle, lbStt;
    JCheckBox chk1, chk2, chk3;
    public Bai1_Lab1() throws HeadlessException {
        setSize(400, 200);
        setLocationRelativeTo(null);
        setVisible(false);
        setLayout(new FlowLayout());
        
        
        lbTitle = new JLabel("Control in action: CheckBox");
        chk1 = new JCheckBox("Apple");
        chk2 = new JCheckBox("Mango");
        chk3 = new JCheckBox("Peer");
        lbStt = new JLabel();
        
        add(lbTitle);
        add(chk1);
        add(chk2);
        add(chk3);
        add(lbStt);
        
        
        chk1.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                lbStt.setText("Apple checkbox: " + (e.getStateChange() == 1 ? "Checked" : "Unchecked"));
            }
           
        });
        
        chk2.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                lbStt.setText("Mango checkbox: " +(e.getStateChange() == 1 ? "Checked" : "Unchecked"));
            }
            
        });
        
         chk3.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                lbStt.setText("Peer checkbox: " +(e.getStateChange() == 1 ? "Checked" : "Unchecked"));
            }
            
        });
    }
    
    
}
