/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test5;

import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class NewJFrame extends javax.swing.JFrame {
    //12:15

    Connection cn;
    DefaultTableModel model;
    DefaultComboBoxModel<Object> cbb_model;
    int index;

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        setLocationRelativeTo(null);
        cn = Prt_8.XHelper.ketNoi("TestAss3");
        if (cn != null) {
            System.out.println("ok");
        }
        txtTen.setEnabled(false);
        model = (DefaultTableModel) tblSHow.getModel();
        cbb_model = (DefaultComboBoxModel) cbbMonHoc.getModel();
        loadDataToCbb();
    }

    public void loadDataToTable() {
        try {
            cn = Prt_8.XHelper.ketNoi("TestAss3");
            String sql = "select SINHVIEN.MaSV, HoTenSV, diem from SINHVIEN join DIEM on SINHVIEN.MaSV = DIEM.Masv where MaMH = ?";
            PreparedStatement stm = cn.prepareStatement(sql);
            stm.setString(1, cbbMonHoc.getSelectedItem().toString());
            ResultSet rs = stm.executeQuery();

            model.setRowCount(0);
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString(1), rs.getString(2), rs.getFloat(3)
                });
            }
            if (tblSHow.getRowCount() > 0) {
                index = 0;
                showDetail();
            } else {
                txtDiem.setText("");
                txtMa.setText("");
                txtTen.setText("");

            }
            cn.close();
            rs.close();
            stm.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadDataToCbb() {
        try {
            cn = Prt_8.XHelper.ketNoi("TestAss3");
            String sql = "select MaMH from MONHOC";
            PreparedStatement stm = cn.prepareStatement(sql);

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                cbbMonHoc.addItem(rs.getString(1));
            }
            cn.close();
            rs.close();
            stm.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbbMonHoc = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSHow = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtDiem = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Môn học");

        cbbMonHoc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbMonHocItemStateChanged(evt);
            }
        });
        cbbMonHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbMonHocActionPerformed(evt);
            }
        });

        tblSHow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SV", "Họ tên", "Điểm"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSHow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSHowMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSHow);

        jLabel2.setText("Mã SV");

        jLabel3.setText("Họ Tên");

        jLabel4.setText("Điểm");

        jButton1.setText("ADd");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel1)
                                .addGap(54, 54, 54)
                                .addComponent(cbbMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2)))))
                        .addGap(18, 18, 18)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtDiem, txtMa, txtTen});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbbMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbbMonHocItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbMonHocItemStateChanged
        loadDataToTable();
    }//GEN-LAST:event_cbbMonHocItemStateChanged

    private void tblSHowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSHowMouseClicked
        index = tblSHow.getSelectedRow();
        showDetail();
    }//GEN-LAST:event_tblSHowMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            cn = Prt_8.XHelper.ketNoi("TestAss3");
            String sql = "insert DIEM values(?, ?, ?)";
            PreparedStatement stm = cn.prepareStatement(sql);

            stm.setString(1, txtMa.getText());

            if (checkTrung(cbbMonHoc.getSelectedItem().toString()) == true) {
                JOptionPane.showMessageDialog(this, "Trùng mã môn");
                return;
            } else {
                stm.setString(2, cbbMonHoc.getSelectedItem().toString());
            }
            if (Float.parseFloat(txtDiem.getText()) > 10 || Float.parseFloat(txtDiem.getText()) < 0) {
                JOptionPane.showMessageDialog(this, "Điểm phải nhỏ hơn 10 và lớn hơn 0");
                return;
            } else {
                stm.setFloat(3, Float.parseFloat(txtDiem.getText()));
            }

            stm.executeUpdate();
            cn.close();
            stm.close();

            loadDataToTable();
            JOptionPane.showMessageDialog(this, "Thêm thành công");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            cn = Prt_8.XHelper.ketNoi("TestAss3");
            String sql = "update DIEM set diem = ? where Masv = ? and MaMH = ?";
            PreparedStatement stm = cn.prepareStatement(sql);
            stm.setString(2, txtMa.getText());
            stm.setString(3, cbbMonHoc.getSelectedItem().toString());
            if (Float.parseFloat(txtDiem.getText()) > 10 || Float.parseFloat(txtDiem.getText()) < 0) {
                JOptionPane.showMessageDialog(this, "Điểm phải nhỏ hơn 10 và lớn hơn 0");
                return;
            } else {
                stm.setFloat(1, Float.parseFloat(txtDiem.getText()));
            }

            stm.executeUpdate();
            cn.close();
            stm.close();
            loadDataToTable();
            JOptionPane.showMessageDialog(this, "Update thành công");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            cn = Prt_8.XHelper.ketNoi("TestAss3");
            String sql = "delete from DIEM where Masv = ?";
            PreparedStatement stm = cn.prepareStatement(sql);
            stm.setString(1, txtMa.getText());
            index = tblSHow.getSelectedRow();
            if (index == -1) {
                JOptionPane.showMessageDialog(this, "Thêm dữ liệu để xóa");
                return;
            } else {
                stm.executeUpdate();
            }
            cn.close();
            stm.close();
            loadDataToTable();
            JOptionPane.showMessageDialog(this, "Xóa thành công");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cbbMonHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbMonHocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbMonHocActionPerformed

    public boolean checkTrung(String ma) {
        try {
            cn = Prt_8.XHelper.ketNoi("TestAss3");
            String sql = "select MaMH from DIEM where MaSv = ?";
            PreparedStatement stm = cn.prepareStatement(sql);
            stm.setString(1, txtMa.getText());
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                if (rs.getString(1).equalsIgnoreCase(ma)) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public void showDetail() {
        txtMa.setText(model.getValueAt(index, 0).toString());
        txtTen.setText(model.getValueAt(index, 1).toString());
        txtDiem.setText(model.getValueAt(index, 2).toString());

        tblSHow.setRowSelectionInterval(index, index);
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbbMonHoc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSHow;
    private javax.swing.JTextField txtDiem;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
