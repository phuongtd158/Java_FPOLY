/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly2;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class Jfr_Bai2 extends javax.swing.JFrame {

    Connection cn;
    int index;
    ArrayList<SinhVien> listSv = new ArrayList<>();

    /**
     * Creates new form Jfr_Bai2
     */
    public Jfr_Bai2() {
        initComponents();
        setLocationRelativeTo(null);
        cn = XHelper.ketNoi("Lab5_SOF203");
        loadData();
        if (listSv.size() > 0) {
            index = 0;
            showDetail();
        }

    }

    public void loadData() {
        try {
            cn = XHelper.ketNoi("Lab5_SOF203");
            String sql = "select * from HOCSINH";

            PreparedStatement statement = cn.prepareStatement(sql);

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                String maSv = rs.getString(1);
                String hoTen = rs.getString(2);
                String gioiTinh = rs.getString(3);
                double diem = rs.getDouble(4);

                SinhVien sv = new SinhVien(maSv, hoTen, gioiTinh, diem);
                listSv.add(sv);
            }

            cn.close();
            statement.close();
            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void showDetail() {
        SinhVien sv = listSv.get(index);
        txtDiem.setText(sv.getDiemTb() + "");
        txtMa.setText(sv.getMaSv());
        txtTen.setText(sv.getHoTen());
        if (sv.getGioiTinh().equals("Nam")) {
            chkNam.setSelected(true);
        } else {
            chkNu.setSelected(true);
        }

        txtHientai.setText((index + 1) + "/" + (listSv.size()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtDiem = new javax.swing.JTextField();
        chkNam = new javax.swing.JRadioButton();
        chkNu = new javax.swing.JRadioButton();
        btnClear = new javax.swing.JButton();
        btnADd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnDau = new javax.swing.JButton();
        btnLui = new javax.swing.JButton();
        btnCuoi = new javax.swing.JButton();
        btnTien = new javax.swing.JButton();
        txtHientai = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mã SV:");

        jLabel2.setText("Họ tên:");

        jLabel3.setText("Điểm TB");

        jLabel4.setText("Giới tính:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("QUẢN LÝ SINH VIÊN");

        buttonGroup1.add(chkNam);
        chkNam.setText("Nam");

        buttonGroup1.add(chkNu);
        chkNu.setText("Nữ");

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnADd.setText("Add");
        btnADd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADdActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnExit.setText("Update");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnDau.setText("|<");
        btnDau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDauActionPerformed(evt);
            }
        });

        btnLui.setText("<<");
        btnLui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuiActionPerformed(evt);
            }
        });

        btnCuoi.setText(">|");
        btnCuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuoiActionPerformed(evt);
            }
        });

        btnTien.setText(">>");
        btnTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTienActionPerformed(evt);
            }
        });

        txtHientai.setText("jLabel6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnDau, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnClear))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(chkNam)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chkNu)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDelete)
                                    .addComponent(btnADd)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnLui, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtHientai)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnTien, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnExit)
                                    .addComponent(btnCuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnADd))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(chkNam)
                    .addComponent(chkNu)
                    .addComponent(btnDelete))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTien)
                        .addComponent(btnCuoi))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDau)
                        .addComponent(btnLui)
                        .addComponent(txtHientai)))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuiActionPerformed
        if (listSv.size() > 0) {
            if (index > 0) {
                index--;

            } else {
                index = listSv.size() - 1;
            }

        }
        showDetail();
    }//GEN-LAST:event_btnLuiActionPerformed

    private void btnDauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDauActionPerformed
        if (listSv.size() > 0) {
            index = 0;
            showDetail();
        }
    }//GEN-LAST:event_btnDauActionPerformed

    private void btnCuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuoiActionPerformed
        if (listSv.size() > 0) {
            index = listSv.size() - 1;
            showDetail();
        }
    }//GEN-LAST:event_btnCuoiActionPerformed

    private void btnTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTienActionPerformed
        if (listSv.size() > 0) {
            if (index < listSv.size() - 1) {
                index++;

            } else {
                index = 0;
            }

        }
        showDetail();
    }//GEN-LAST:event_btnTienActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtDiem.setText("");
        txtMa.setText("");
        txtTen.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnADdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADdActionPerformed
        try {
            cn = XHelper.ketNoi("Lab5_SOF203");
            String sql = "insert into HOCSINH(MaHS, TenHS, GioiTinh, DiemTB) values(?, ?, ?, ?)";

            PreparedStatement statement = cn.prepareStatement(sql);
            try {
                if (checkTrung(txtMa.getText()) == true) {
                    JOptionPane.showMessageDialog(this, "Mã sinh viên đã tồn tại");
                    return;

                } else if (txtMa.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Mã sinh viên ko được trống");
                    return;
                } else {
                    statement.setString(1, txtMa.getText());
                }
            } catch (Exception e) {
            }

            try {
                if (checkTrung(txtMa.getText()) == true) {
                    JOptionPane.showMessageDialog(this, "Mã sinh viên đã tồn tại");
                    return;
                } else {
                    statement.setString(1, txtMa.getText());
                }
            } catch (Exception e) {
            }
            try {
                if (checkTrung(txtMa.getText()) == true) {
                    JOptionPane.showMessageDialog(this, "Mã sinh viên đã tồn tại");
                    return;
                } else {
                    statement.setString(1, txtMa.getText());
                }
            } catch (Exception e) {
            }

            try {
                if (checkTrung(txtMa.getText()) == true) {
                    JOptionPane.showMessageDialog(this, "Mã sinh viên đã tồn tại");
                    return;
                } else {
                    statement.setString(1, txtMa.getText());
                }
            } catch (Exception e) {
            }
            statement.setString(2, txtTen.getText());
            String gioiTinh = chkNam.isSelected() ? "Nam" : "Nữ";
            statement.setString(3, gioiTinh);
            statement.setDouble(4, Double.parseDouble(txtDiem.getText()));

            int row = statement.executeUpdate();
            if (row > 0) {
                JOptionPane.showMessageDialog(this, "Thêm thành công");
                index = listSv.size();
                showDetail();
            } else {
                JOptionPane.showMessageDialog(this, "Không thêm được dòng nào");
            }

            loadData();

            cn.close();
            statement.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnADdActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        try {
            cn = XHelper.ketNoi("Lab5_SOF203");
            String sql = "update HOCSINH set TenHS = ?, GioiTinh = ?, DiemTB = ? where MaHS = ?";

            PreparedStatement statement = cn.prepareStatement(sql);

            statement.setString(1, txtTen.getText());
            String gioiTinh = chkNam.isSelected() ? "Nam" : "Nữ";
            statement.setString(2, gioiTinh);
            statement.setDouble(3, Double.parseDouble(txtDiem.getText()));
            statement.setString(4, txtMa.getText());
            int row = statement.executeUpdate();
            if (row > 0) {
                JOptionPane.showMessageDialog(this, "Thêm thành công");

            } else {
                JOptionPane.showMessageDialog(this, "Không thêm được dòng nào");
            }

            loadData();

            cn.close();
            statement.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed
    public boolean checkTrung(String maSv) {
        boolean check = false;
        for (SinhVien x : listSv) {
            if (maSv.equals(x.getMaSv())) {
                check = true;
            }
        }
        return check;
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
            java.util.logging.Logger.getLogger(Jfr_Bai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jfr_Bai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jfr_Bai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jfr_Bai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jfr_Bai2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnADd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCuoi;
    private javax.swing.JButton btnDau;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLui;
    private javax.swing.JButton btnTien;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton chkNam;
    private javax.swing.JRadioButton chkNu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtDiem;
    private javax.swing.JLabel txtHientai;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables

}
