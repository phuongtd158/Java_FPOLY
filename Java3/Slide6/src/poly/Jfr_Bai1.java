/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class Jfr_Bai1 extends javax.swing.JFrame {

    Connection cn;
    DefaultTableModel model;
    DefaultComboBoxModel<KhoaHoc> model_combo;

    /**
     * Creates new form Jfr_Bai1
     */
    public Jfr_Bai1() {
        initComponents();
        setLocationRelativeTo(null);
        cn = XHelper.ketNoi("LT6C");

        if (cn != null) {
            // JOptionPane.showMessageDialog(this, "Kết nối thành công");
        } else {
            JOptionPane.showMessageDialog(this, "Kết nối ko thành công");
            System.exit(0);
        }
        cbbSet();
        tableSet();

        loadDataToCbb();
    }

    public void tableSet() {

        String headers[] = {"Mã học viên", "Mã khóa học", "Điểm"};
        String data[][] = {};
        model = new DefaultTableModel(data, headers);
        tblShowData.setModel(model);
        tblShowData.setEnabled(false);
    }

    public void cbbSet() {

        model_combo = (DefaultComboBoxModel) cbbItem.getModel();
    }

    public void loadDataToCbb() {
        try {
            cn = XHelper.ketNoi("LT6C");
            String sql = "select * from KhoaHoc";
            PreparedStatement statement = cn.prepareStatement(sql);

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                model_combo.addElement(new KhoaHoc(rs.getString(1), rs.getString(2), rs.getFloat(3), rs.getInt(4)));
            }

            cn.close();
            rs.close();
            statement.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbbItem = new javax.swing.JComboBox<>();
        lbTen = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblShowData = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Khóa học");

        cbbItem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbItemItemStateChanged(evt);
            }
        });

        lbTen.setText("jLabel2");

        tblShowData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblShowData.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tblShowData);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(70, 70, 70)
                        .addComponent(cbbItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(lbTen)
                        .addGap(0, 92, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbbItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTen))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbbItemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbItemItemStateChanged
        try {

            cn = XHelper.ketNoi("LT6C");
            KhoaHoc kh = (KhoaHoc) cbbItem.getSelectedItem();
            lbTen.setText(kh.getTenKh());
            String sql = "select * from HocVien where MaKh = ?";
            PreparedStatement statement = cn.prepareStatement(sql);

            statement.setString(1, kh.getMaKh());

            ResultSet rs = statement.executeQuery();

            model.setRowCount(0);
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString(1), rs.getString(2), rs.getFloat(3)
                });
            }

            cn.close();
            rs.close();
            statement.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_cbbItemItemStateChanged

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
            java.util.logging.Logger.getLogger(Jfr_Bai1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jfr_Bai1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jfr_Bai1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jfr_Bai1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jfr_Bai1().setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbbItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTen;
    private javax.swing.JTable tblShowData;
    // End of variables declaration//GEN-END:variables
}
