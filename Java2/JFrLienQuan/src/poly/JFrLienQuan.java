/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class JFrLienQuan extends javax.swing.JFrame {

    /**
     * Creates new form JFrLienQuan
     */
    ArrayList<Tuong> listTuong = new ArrayList<>();

    public JFrLienQuan() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lbLienQuan = new javax.swing.JLabel();
        lbTenTuong = new javax.swing.JLabel();
        lbKiNang = new javax.swing.JLabel();
        txtKiNang = new javax.swing.JTextField();
        txtTenTuong = new javax.swing.JTextField();
        btnThemTuong = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        lbLoaiTuong = new javax.swing.JLabel();
        cbbLoaiTuong = new javax.swing.JComboBox<>();
        ckbLuu = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblShowInfo = new javax.swing.JTable();
        btnRemove = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MinhDQ8 FPOLY HN");

        lbLienQuan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbLienQuan.setText("Liên Quân");

        lbTenTuong.setText("Tên tướng: ");

        lbKiNang.setText("Kĩ năng:");

        btnThemTuong.setText("Thêm tướng");
        btnThemTuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemTuongActionPerformed(evt);
            }
        });

        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        lbLoaiTuong.setText("Loại tướng: ");

        cbbLoaiTuong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đấu sĩ", "Trợ thủ", "Xạ thủ", "Sát thủ", "Pháp sư" }));

        ckbLuu.setText("Lưu");
        ckbLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbLuuActionPerformed(evt);
            }
        });

        tblShowInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên tướng", "Kĩ năng", "Loại tướng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblShowInfo);

        btnRemove.setText("Xóa tướng");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTenTuong)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbKiNang)
                            .addComponent(lbLoaiTuong))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbbLoaiTuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(95, 95, 95)
                                .addComponent(ckbLuu))
                            .addComponent(txtKiNang, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLamMoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThemTuong)
                    .addComponent(btnRemove))
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(lbLienQuan))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(141, 141, 141)
                    .addComponent(txtTenTuong, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(149, Short.MAX_VALUE)))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnLamMoi, btnRemove, btnThemTuong});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtKiNang, txtTenTuong});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lbLienQuan)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTenTuong)
                    .addComponent(btnThemTuong))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKiNang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbKiNang)
                    .addComponent(btnLamMoi))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbLoaiTuong)
                            .addComponent(cbbLoaiTuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ckbLuu)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnRemove)))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(76, 76, 76)
                    .addComponent(txtTenTuong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(353, Short.MAX_VALUE)))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtKiNang, txtTenTuong});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnLamMoi, btnRemove});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void add() {
        int index = cbbLoaiTuong.getSelectedIndex();
        boolean check = ckbLuu.isSelected();

        String name = txtTenTuong.getText().trim();
        String skill = txtKiNang.getText().trim();
        String type = cbbLoaiTuong.getItemAt(index);

        if (name.equals("") || skill.equals("")) {
            JOptionPane.showMessageDialog(this, "Tên và kĩ năng không được để trống");
            return;
        } else if (check(name) == true) {
            JOptionPane.showMessageDialog(this, "Tên tướng trùng !");
            clearText();
            return;
        } else {
            try {
                if (check == true) {
                    listTuong.add(new Tuong(name, skill, type));
                    JOptionPane.showMessageDialog(this, "Thêm tướng thành công !");
                    clearText();
                } else {
                    JOptionPane.showMessageDialog(this, "Phải chọn lưu để thêm tướng");
                }
            } catch (Exception e) {
            }
        }
    }

    public void refresh() {
        DefaultTableModel model = (DefaultTableModel) tblShowInfo.getModel();
        model.setRowCount(0);
        cbbLoaiTuong.setSelectedIndex(0);
        ckbLuu.setSelected(false);
        listTuong.clear();
        clearText();
    }

    public boolean check(String newName) {
        boolean check = false;
        for (Tuong x : listTuong) {
            if (x.getTenTuong().equals(newName)) {
                check = true;
            }
        }
        return check;
    }

    public void fillToTable() {
        DefaultTableModel model = (DefaultTableModel) tblShowInfo.getModel();
        model.setRowCount(0);

        for (Tuong x : listTuong) {
            model.addRow(new Object[]{
                x.getTenTuong(), x.getKyNang(), x.getLoaiTuong()
            });
        }

    }

    public void clearText() {
        txtKiNang.setText("");
        txtTenTuong.setText("");

    }
    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        refresh();
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnThemTuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemTuongActionPerformed
        add();
        fillToTable();
    }//GEN-LAST:event_btnThemTuongActionPerformed

    private void ckbLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbLuuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbLuuActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        int index = tblShowInfo.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Hãy chọn tướng cần xóa");
            
        }
        else if (listTuong.size() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Hãy thêm tướng để xóa");
        }
        else{
            listTuong.remove(index);
            fillToTable();
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

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
            java.util.logging.Logger.getLogger(JFrLienQuan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrLienQuan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrLienQuan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrLienQuan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrLienQuan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnThemTuong;
    private javax.swing.JComboBox<String> cbbLoaiTuong;
    private javax.swing.JCheckBox ckbLuu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbKiNang;
    private javax.swing.JLabel lbLienQuan;
    private javax.swing.JLabel lbLoaiTuong;
    private javax.swing.JLabel lbTenTuong;
    private javax.swing.JTable tblShowInfo;
    private javax.swing.JTextField txtKiNang;
    private javax.swing.JTextField txtTenTuong;
    // End of variables declaration//GEN-END:variables
}