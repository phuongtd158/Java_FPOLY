/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author ADMIN
 */
public class DemoJframe extends JFrame {

    JButton btnYellow, btnRed, btnBlueButton, btnWhite;
    JLabel lbRs;

    public DemoJframe() {
        setTitle("JFrame");
        setLocationRelativeTo(null);
        setSize(400, 200);
        setLayout(new FlowLayout());
        setResizable(false);
//        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); //Vô hiệu hóa nút X đóng form
        ImageIcon image = new ImageIcon("logo.png");
        setIconImage(image.getImage());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        getContentPane().setBackground(Color.red);

        //Nút đóng
//        addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                System.exit(0);
//            }
//
//        });
        btnRed = new JButton("Red");
        btnYellow = new JButton("Yellow");
        lbRs = new JLabel("Result");
        btnBlueButton = new JButton("Blue");
        btnWhite = new JButton("White");
        
        add(btnBlueButton);
        add(btnWhite);
        add(btnRed);
        add(btnYellow);
        add(lbRs);
        
        btnBlueButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().setBackground(Color.BLUE);
                lbRs.setText("Blue");
            }
            
        });
        
        btnRed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().setBackground(Color.red);
                lbRs.setText("Red");
            }

        });
        
        btnYellow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().setBackground(Color.yellow);
                lbRs.setText("Yellow");
            }

        });
    }

}
