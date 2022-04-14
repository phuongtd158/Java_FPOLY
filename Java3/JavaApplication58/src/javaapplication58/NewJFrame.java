/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication58;

import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class NewJFrame extends javax.swing.JFrame {

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
        cn = XHelper.ketNoi("p");
        model = (DefaultTableModel) tbnlSHow.getModel();
        cbb_model = (DefaultComboBoxModel) cbbTheLoai.getModel();

        loadDataToCbb();

    }

    public void loadDataToCbb() {
        try {
            cn = XHelper.ketNoi("p");

            String sql = "select * from THELOAI";
            PreparedStatement stm = cn.prepareStatement(sql);

            ResultSet rs = stm.executeQuery();
            while (rs.next()) {

                cbbTheLoai.addItem(rs.getString(1));
            }

            cn.close();
            rs.close();
            stm.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadDataToTable() {
        try {
            cn = XHelper.ketNoi("p");

            String sql = "select Masach, TenSach, THELOAI.MaTheLoai, NXB, SoLuong, Giatien, TenTheLoai from THELOAI join SACH on THELOAI.MaTheLoai = SACH.MaTheLoai where THELOAI.MaTheLoai = ? "
                    + "";
            PreparedStatement stm = cn.prepareStatement(sql);
            stm.setString(1, cbbTheLoai.getSelectedItem().toString());
            ResultSet rs = stm.executeQuery();

            model.setRowCount(0);
            while (rs.next()) {
                lbTen.setText(rs.getString(7));
                model.addRow(new Object[]{
                    rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6)
                });
            }

            cn.close();
            rs.close();
            stm.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showDetail() {
        txtMa.setText(model.getValueAt(index, 0).toString());
        txtTen.setText(model.getValueAt(index, 1).toString());
        txtNXB.setText(model.getValueAt(index, 3).toString());
        txtSoLuong.setText(model.getValueAt(index, 4).toString());
        txtGia.setText(model.getValueAt(index, 5).toString());

        tbnlSHow.setRowSelectionInterval(index, index);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbbTheLoai = new javax.swing.JComboBox<>();
        dsd = new javax.swing.JLabel();
        lbTen = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbnlSHow = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        txtNXB = new javax.swing.JTextField();
        txtGia = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbbTheLoai.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbTheLoaiItemStateChanged(evt);
            }
        });

        dsd.setText("Thể loại");

        lbTen.setText("jLabel1");

        tbnlSHow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sách", "Tên sách", "Mã thể loại", "NXB", "Số lượng", "Giá tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbnlSHow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbnlSHowMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbnlSHow);

        jLabel2.setText("Mã sách");

        jLabel3.setText("Tên sách");

        jLabel4.setText("Số lượng");

        jLabel5.setText("NXB");

        jLabel6.setText("Giá tiền");

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

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Update");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(dsd)
                        .addGap(29, 29, 29)
                        .addComponent(cbbTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(lbTen))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNXB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton2)
                                            .addComponent(jButton1)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(93, 93, 93)
                                        .addComponent(jButton4)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addGap(25, 25, 25))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtGia, txtMa, txtNXB, txtSoLuong, txtTen});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dsd)
                    .addComponent(cbbTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTen))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNXB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4))))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbbTheLoaiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbTheLoaiItemStateChanged
        try {
            cn = XHelper.ketNoi("p");

            String sql = "select Masach, TenSach, THELOAI.MaTheLoai, NXB, SoLuong, Giatien, TenTheLoai from THELOAI join SACH on THELOAI.MaTheLoai = SACH.MaTheLoai where THELOAI.MaTheLoai = ? "
                    + "";
            PreparedStatement stm = cn.prepareStatement(sql);
            stm.setString(1, cbbTheLoai.getSelectedItem().toString());
            ResultSet rs = stm.executeQuery();

            model.setRowCount(0);
            while (rs.next()) {
                lbTen.setText(rs.getString(7));
                model.addRow(new Object[]{
                    rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6)
                });
            }

            if (tbnlSHow.getRowCount() > 0) {
                index = 0;
                showDetail();
            } else {
                clear();
            }
            cn.close();
            rs.close();
            stm.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_cbbTheLoaiItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        clear();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            cn = XHelper.ketNoi("p");

            String sql = "insert into SACH(Masach,TenSach,NXB,SoLuong,Giatien,MaTheLoai) values(?, ?, ?, ?, ?, ?)";
            PreparedStatement stm = cn.prepareStatement(sql);
            if (check(txtMa.getText()) == true) {
                JOptionPane.showMessageDialog(this, "trufng");
                return;
            } else {
                stm.setString(1, txtMa.getText());
            }
            stm.setString(2, txtTen.getText());
            stm.setString(3, txtNXB.getText());
            stm.setInt(4, Integer.parseInt(txtSoLuong.getText()));
            stm.setDouble(5, Double.parseDouble(txtGia.getText()));
            stm.setString(6, cbbTheLoai.getSelectedItem().toString());
            stm.executeUpdate();

            cn.close();
            stm.close();
            loadDataToTable();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tbnlSHowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbnlSHowMouseClicked
        index = tbnlSHow.getSelectedRow();
        showDetail();
    }//GEN-LAST:event_tbnlSHowMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            cn = XHelper.ketNoi("p");

            String sql = "delete from SACH where Masach = ?";
            PreparedStatement stm = cn.prepareStatement(sql);
            stm.setString(1, txtMa.getText());
            index = tbnlSHow.getSelectedRow();
            if (index == -1) {
                JOptionPane.showMessageDialog(this, "Chon dong de xoa");
                return;
            } else {
                if (JOptionPane.showConfirmDialog(this, "Ban co muon xoa khong ?") == JOptionPane.YES_OPTION) {
                    stm.executeUpdate();
                }
            }

            cn.close();

            stm.close();
            loadDataToTable();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    public boolean check(String ma) {
        try {
            cn = XHelper.ketNoi("p");

            String sql = "select Masach from SACH where MaTheLoai = ?";
            PreparedStatement stm = cn.prepareStatement(sql);
            stm.setString(1, cbbTheLoai.getSelectedItem().toString());
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                if (rs.getString(1).equalsIgnoreCase(ma)) {
                    return true;
                }
            }
            cn.close();

            stm.close();
            loadDataToTable();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public void clear() {
        txtGia.setText("");
        txtTen.setText("");
        txtMa.setText("");
        txtNXB.setText("");
        txtSoLuong.setText("");
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
    private javax.swing.JComboBox<String> cbbTheLoai;
    private javax.swing.JLabel dsd;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTen;
    private javax.swing.JTable tbnlSHow;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtNXB;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables

}
