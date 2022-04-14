/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import Helper.SharedData;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class Jfr_Main extends javax.swing.JFrame {

    private JPn_QLSV pn_qlsv;
    private Jpn_QLDiem pn_qlDiem;

    /**
     * Creates new form Jfr_Main
     */
    public Jfr_Main() {
        initComponents();
        setLocationRelativeTo(null);

    }

    public void role() {
        if (SharedData.nguoiDangNhap.getVaiTro().equals("admin")) {
            mnuQLD.setEnabled(true);
            mnuQLSV.setEnabled(false);
        } else if (SharedData.nguoiDangNhap.getVaiTro().equals("user")) {
            mnuQLSV.setEnabled(true);
            mnuQLD.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnQLSV = new javax.swing.JButton();
        btnQLD = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jButton4 = new javax.swing.JButton();
        tblPane = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        qlsv = new javax.swing.JMenu();
        mnuQLSV = new javax.swing.JMenuItem();
        mnuQLD = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Sinh Viên");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jToolBar1.setRollover(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Log out.png"))); // NOI18N
        jButton1.setText("Đăng xuất");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);
        jToolBar1.add(jSeparator1);

        btnQLSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Clien list.png"))); // NOI18N
        btnQLSV.setText("Quản lý sinh viên");
        btnQLSV.setFocusable(false);
        btnQLSV.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLSV.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLSVActionPerformed(evt);
            }
        });
        jToolBar1.add(btnQLSV);

        btnQLD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Numbered list.png"))); // NOI18N
        btnQLD.setText("Quản lý điểm");
        btnQLD.setFocusable(false);
        btnQLD.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLD.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLDActionPerformed(evt);
            }
        });
        jToolBar1.add(btnQLD);
        jToolBar1.add(jSeparator2);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Info.png"))); // NOI18N
        jButton4.setText("Giới thiệu");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton4);

        jMenu1.setText("Hệ thống");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Log out.png"))); // NOI18N
        jMenuItem1.setText("Đăng xuất");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Exit button.png"))); // NOI18N
        jMenuItem2.setText("Thoát");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        qlsv.setText("Quản lý");

        mnuQLSV.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuQLSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Clien list.png"))); // NOI18N
        mnuQLSV.setText("Quản lý sinh viên");
        mnuQLSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuQLSVActionPerformed(evt);
            }
        });
        qlsv.add(mnuQLSV);

        mnuQLD.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuQLD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Numbered list.png"))); // NOI18N
        mnuQLD.setText("Quản lý điểm");
        mnuQLD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuQLDActionPerformed(evt);
            }
        });
        qlsv.add(mnuQLD);

        jMenuBar1.add(qlsv);

        jMenu3.setText("Trợ giúp");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Comments.png"))); // NOI18N
        jMenuItem5.setText("Nội dung");
        jMenu3.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Problem.png"))); // NOI18N
        jMenuItem6.setText("Giới thiệu");
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 965, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tblPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tblPane, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Jfr_Login login = new Jfr_Login(this, true);
        login.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void mnuQLDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuQLDActionPerformed
        if (pn_qlDiem == null) {
            pn_qlDiem = new Jpn_QLDiem();
            ImageIcon icon = new ImageIcon(getClass().getResource("/icon/Numbered list.png"));
            tblPane.addTab("Quản lý điểm", icon, pn_qlDiem, "Quản lý điểm");
        }

        tblPane.setSelectedComponent(pn_qlDiem);
    }//GEN-LAST:event_mnuQLDActionPerformed

    private void mnuQLSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuQLSVActionPerformed
        if (pn_qlsv == null) {
            pn_qlsv = new JPn_QLSV();
            ImageIcon icon = new ImageIcon(getClass().getResource("/icon/Clien list.png"));
            tblPane.addTab("Quản lý sinh viên", icon, pn_qlsv, "Quản lý sinh viên");
        }

        tblPane.setSelectedComponent(pn_qlsv);
    }//GEN-LAST:event_mnuQLSVActionPerformed

    private void btnQLDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLDActionPerformed

        if (pn_qlDiem == null) {
            pn_qlDiem = new Jpn_QLDiem();
            ImageIcon icon = new ImageIcon(getClass().getResource("/icon/Numbered list.png"));
            tblPane.addTab("Quản lý điểm", icon, pn_qlDiem, "Quản lý điểm");
        }

        tblPane.setSelectedComponent(pn_qlDiem);
        btnRole();
    }//GEN-LAST:event_btnQLDActionPerformed

    private void btnQLSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLSVActionPerformed

        if (pn_qlsv == null) {
            pn_qlsv = new JPn_QLSV();
            ImageIcon icon = new ImageIcon(getClass().getResource("/icon/Clien list.png"));
            tblPane.addTab("Quản lý sinh viên", icon, pn_qlsv, "Quản lý sinh viên");
        }

        tblPane.setSelectedComponent(pn_qlsv);
        btnRole();

    }//GEN-LAST:event_btnQLSVActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát không ?") == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Jfr_Login login = new Jfr_Login(this, true);
        login.setVisible(true);


    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Jfr_Login login = new Jfr_Login(this, true);
        login.setVisible(true);

        role();
    }//GEN-LAST:event_formWindowOpened

    public void btnRole() {
        if (SharedData.nguoiDangNhap.getVaiTro().equals("admin")) {
            btnQLSV.setEnabled(false);
            btnQLD.setEnabled(true);
        } else if (SharedData.nguoiDangNhap.getVaiTro().equals("user")) {
            btnQLSV.setEnabled(true);
            btnQLD.setEnabled(false);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Jfr_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jfr_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jfr_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jfr_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jfr_Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQLD;
    private javax.swing.JButton btnQLSV;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem mnuQLD;
    private javax.swing.JMenuItem mnuQLSV;
    private javax.swing.JMenu qlsv;
    private javax.swing.JTabbedPane tblPane;
    // End of variables declaration//GEN-END:variables

}
