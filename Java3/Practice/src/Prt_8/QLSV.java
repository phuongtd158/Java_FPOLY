/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prt_8;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class QLSV extends javax.swing.JFrame {

    ArrayList<SInhVIen> list = new ArrayList<>();
    Connection cn;
    DefaultTableModel model;
    int index;

    /**
     * Creates new form QLSV
     */
    public QLSV() {
        initComponents();
        setLocationRelativeTo(null);
        cn = XHelper.ketNoi("TestAss1");
        if (cn != null) {
            System.out.println("Ket noi thanh cong");
        }
        loadData();
        model = (DefaultTableModel) tblShow.getModel();
        loadDataToSQL();
    }

    public void loadData() {
        try {
            cn = XHelper.ketNoi("TestAss1");
            String sql = "select SINHVIEN.MaSV, HoTenSV, GioiTinh, MONHOC.MaMH, TenMH, DIEM from SINHVIEN join DIEM on SINHVIEN.MaSV = diem.Masv\n"
                    + "	join MONHOC on MONHOC.MaMH = diem.MaMH";
            PreparedStatement stm = cn.prepareStatement(sql);

            ResultSet rs = stm.executeQuery();

            list.clear();
            while (rs.next()) {
                list.add(new SInhVIen(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDouble(6)));
            }

            cn.close();
            stm.close();
            rs.clearWarnings();
        } catch (Exception e) {
        }
    }

    public void loadDataToSQL() {
        try {
            cn = XHelper.ketNoi("TestAss1");
            String sql = "select SINHVIEN.MaSV, HoTenSV, GioiTinh, MONHOC.MaMH, TenMH, DIEM from SINHVIEN join DIEM on SINHVIEN.MaSV = diem.Masv\n"
                    + "	join MONHOC on MONHOC.MaMH = diem.MaMH";
            PreparedStatement stm = cn.prepareStatement(sql);

            ResultSet rs = stm.executeQuery();

            model.setRowCount(0);
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getFloat(6)
                });
            }

            cn.close();
            stm.close();
            rs.clearWarnings();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblShow = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblShow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sv", "Họ tên", "GIới tính", "Mã môn", "Tên môn", "Điểm"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblShowMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblShow);

        jButton1.setText("TTSV");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void showDetail() {
        model.getValueAt(index, 0);
        model.getValueAt(index, 1);
        model.getValueAt(index, 2);
        model.getValueAt(index, 3);
        model.getValueAt(index, 4);
        model.getValueAt(index, 5);
        tblShow.setRowSelectionInterval(index, index);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SInhVIen sv = list.get(index);

        Jfr_Test form = new Jfr_Test(sv);
        form.setVisible(true);


    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblShowMouseClicked
        index = tblShow.getSelectedRow();
        showDetail();
    }//GEN-LAST:event_tblShowMouseClicked

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
            java.util.logging.Logger.getLogger(QLSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLSV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblShow;
    // End of variables declaration//GEN-END:variables

}
