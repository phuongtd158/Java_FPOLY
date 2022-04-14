/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test_2;

import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class NewJFrame1 extends javax.swing.JFrame {

    Connection cn;
    DefaultComboBoxModel<SinhVien> cbb_Model;

    public NewJFrame1(SinhVien sv) {
        initComponents();
        cbb_Model = (DefaultComboBoxModel) cbbMaMon.getModel();
        loadDataToCbb();
        txtDiem.setText(sv.getDiem() + "");
        txtMaSv.setText(sv.getMaSv());
        txtTen.setText(sv.getHoTen());
        cbbMaMon.setSelectedItem(sv.getMaMon());

    }

    public void loadDataToCbb() {
        try {
            cn = Prt_8.XHelper.ketNoi("TestAss2");
            String sql = "select MaMH from MONHOC";

            PreparedStatement stm = cn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                cbbMaMon.addItem(rs.getString(1));
            }

            cn.close();
            stm.close();
            rs.close();
        } catch (Exception e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMaSv = new javax.swing.JTextField();
        txtDiem = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        cbbMaMon = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Mã SV");

        jLabel2.setText("Họ Tên");

        jLabel3.setText("Mã môn");

        jLabel4.setText("Điểm");

        jButton1.setText("New");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDiem)
                    .addComponent(txtTen)
                    .addComponent(txtMaSv, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(cbbMaMon, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addGap(20, 20, 20))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtDiem, txtMaSv, txtTen});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtMaSv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbbMaMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            cn = Prt_8.XHelper.ketNoi("TestAss2");
            String sql = "insert DIEM values(?, ?, ?)";

            PreparedStatement stm = cn.prepareStatement(sql);

            stm.setString(1, txtMaSv.getText());
            if (Float.parseFloat(txtDiem.getText()) > 10 || Float.parseFloat(txtDiem.getText()) < 0) {
                JOptionPane.showMessageDialog(this, "Điểm nhỏ hơn lớn hơn 0 nhỏ hơn 10");
                return;
            } else {
                stm.setFloat(3, Float.parseFloat(txtDiem.getText()));
            }

            if (check(cbbMaMon.getSelectedItem().toString())) {
                JOptionPane.showMessageDialog(this, "Mã môn trùng");
                return;
            } else {
                stm.setString(2, cbbMaMon.getSelectedItem().toString());
            }

            stm.executeUpdate();
            cn.close();
            stm.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    public boolean check(String maMon) {

        try {
            cn = Prt_8.XHelper.ketNoi("TestAss2");
            String sql = "select MaMH from DIEM where MaSv = ?";
            PreparedStatement stm = cn.prepareStatement(sql);

            stm.setString(1, txtMaSv.getText());
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                if (rs.getString(1).equalsIgnoreCase(maMon)) {
                    return true;
                }
            }

            cn.close();
            stm.close();
            rs.close();
        } catch (Exception e) {
        }
        return false;
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try {
            cn = Prt_8.XHelper.ketNoi("TestAss2");
            String sql = "update DIEM set diem = ? where Masv = ? and MaMH = ?";

            PreparedStatement stm = cn.prepareStatement(sql);
            if (Float.parseFloat(txtDiem.getText()) > 10 || Float.parseFloat(txtDiem.getText()) < 0) {
                JOptionPane.showMessageDialog(this, "Điểm nhỏ hơn lớn hơn 0 nhỏ hơn 10");
                return;
            } else {
                stm.setFloat(1, Float.parseFloat(txtDiem.getText()));
            }
            stm.setString(2, txtMaSv.getText());
            stm.setString(3, (String) cbbMaMon.getSelectedItem());
            stm.executeUpdate();
            cn.close();
            stm.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "trùng mã");
            return;
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtDiem.setText("");
        txtMaSv.setText("");
        txtTen.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

//    /**
    //     * @param args the command line arguments
    //     */
    //    public static void main(String args[]) {
    //        /* Set the Nimbus look and feel */
    //        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    //        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
    //         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
    //         */
    //        try {
    //            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
    //                if ("Nimbus".equals(info.getName())) {
    //                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
    //                    break;
    //                }
    //            }
    //        } catch (ClassNotFoundException ex) {
    //            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //        } catch (InstantiationException ex) {
    //            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //        } catch (IllegalAccessException ex) {
    //            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
    //            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //        }
    //        //</editor-fold>
    //
    //        /* Create and display the form */
    //        java.awt.EventQueue.invokeLater(new Runnable() {
    //            public void run() {
    //                new NewJFrame1().setVisible(true);
    //            }
    //        });
    //    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbbMaMon;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtDiem;
    private javax.swing.JTextField txtMaSv;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables

}
