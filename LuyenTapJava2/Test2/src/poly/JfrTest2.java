/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

import java.awt.Container;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class JfrTest2 extends javax.swing.JFrame {
    
    ArrayList<RauSach> list = new ArrayList<>();
    DefaultTableModel model;
    int index;

    /**
     * Creates new form JfrTest2
     */
    public JfrTest2() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        data();
        max();
        showDetail();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtGia = new javax.swing.JTextField();
        txtKC = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnGia = new javax.swing.JButton();
        btnShowKC = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblShow = new javax.swing.JTable();
        btnThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rau Sạch");

        jLabel1.setText("Tên");

        jLabel2.setText("Rau Sạch");

        jLabel3.setText("Địa chỉ");

        jLabel4.setText("Giá");

        jLabel5.setText("Khoảng cách");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnGia.setText("Show Giá");
        btnGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiaActionPerformed(evt);
            }
        });

        btnShowKC.setText("Show KC");
        btnShowKC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowKCActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        tblShow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên", "Địa chỉ", "Giá", "Khoảng cách"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
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

        btnThoat.setText("Thoat");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(70, 70, 70)
                                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtKC, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnThem)
                            .addComponent(btnGia)
                            .addComponent(btnShowKC)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdate)))
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnThoat)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtDiaChi, txtGia, txtKC, txtTen});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnGia, btnShowKC, btnThem, btnUpdate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGia))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnShowKC)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtKC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnUpdate)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThoat)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblShowMouseClicked
        index = tblShow.getSelectedRow();
        showDetail();
    }//GEN-LAST:event_tblShowMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        add();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiaActionPerformed
        showTop3();
    }//GEN-LAST:event_btnGiaActionPerformed

    private void btnShowKCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowKCActionPerformed
        showKcTop3();
    }//GEN-LAST:event_btnShowKCActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        update();
        fillToTable();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        int choice = JOptionPane.showConfirmDialog(this, "Xác nhận", "Bạn có muốn thoát ?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (choice == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnThoatActionPerformed
    private void update() {
        RauSach rs = list.get(index);
        index = tblShow.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Chọn dòng cần update");
            return;
        }
         try {
            if (txtTen.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(this, "Tên không được trống ");
                return;
            }
            else {
               rs.setTen(txtTen.getText());
               model.setValueAt(rs.getTen(), index, 0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi " + e);
            return;
        }
        
        try {
            if (txtDiaChi.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(this, "Địa chỉ không được trống ");
                return;
            } else {
                rs.setDiaChi(txtDiaChi.getText());
                model.setValueAt(rs.getDiaChi(), index, 1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi " + e);
            return;
        }
        
        try {
            if (txtGia.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(this, "Giá không được trống ");
                return;
            } else if (Double.parseDouble(txtGia.getText()) < 0) {
                JOptionPane.showMessageDialog(this, "Giá phải lớn hơn 0 ");
                return;
            } else {
                rs.setGia(Double.parseDouble(txtGia.getText()));
                 model.setValueAt(rs.getGia(), index, 2);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Giá phải là số ");
            return;
        }
        
        try {
            if (txtKC.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(this, "Khoảng cách không được trống ");
                return;
            } else if (Double.parseDouble(txtKC.getText()) < 0) {
                JOptionPane.showMessageDialog(this, "Khoảng cách phải lớn hơn 0 ");
                return;
            } else {
                 rs.setKhoangCach(Double.parseDouble(txtKC.getText()));
                  model.setValueAt(rs.getKhoangCach(), index, 3);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Khoảng cách phải là số phải là số ");
            return;
        }
        JOptionPane.showMessageDialog(this, "Cập nhật thành công");
    }

    private void add() {
        RauSach rs = new RauSach();
        
        try {
            if (txtTen.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(this, "Tên không được trống ");
                return;
            } else if (checkTrung(txtTen.getText()) == true) {
                JOptionPane.showMessageDialog(this, "Trùng tên");
                return;
            } else {
                rs.setTen(txtTen.getText());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi " + e);
            return;
        }
        
        try {
            if (txtDiaChi.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(this, "Địa chỉ không được trống ");
                return;
            } else {
                rs.setDiaChi(txtDiaChi.getText());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi " + e);
            return;
        }
        
        try {
            if (txtGia.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(this, "Giá không được trống ");
                return;
            } else if (Double.parseDouble(txtGia.getText()) < 0) {
                JOptionPane.showMessageDialog(this, "Giá phải lớn hơn 0 ");
                return;
            } else {
                rs.setGia(Double.parseDouble(txtGia.getText()));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Giá phải là số ");
            return;
        }
        
        try {
            if (txtKC.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(this, "Khoảng cách không được trống ");
                return;
            } else if (Double.parseDouble(txtKC.getText()) < 0) {
                JOptionPane.showMessageDialog(this, "Khoảng cách phải lớn hơn 0 ");
                return;
            } else {
                rs.setKhoangCach(Double.parseDouble(txtKC.getText()));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Khoảng cách phải là số phải là số ");
            return;
        }
        
        list.add(rs);
        fillToTable();
        JOptionPane.showMessageDialog(this, "Thêm thành công");
    }
    
    private void showDetail() {
        RauSach rs = list.get(index);
        txtTen.setText(rs.getTen());
        txtDiaChi.setText(rs.getDiaChi());
        txtGia.setText(rs.getGia() + "");
        txtKC.setText(rs.getKhoangCach() + "");
        tblShow.setRowSelectionInterval(index, index);
    }
    
    private void data() {
        list.add(new RauSach("Rau cải", "Hà nội", 3000, 4));
        list.add(new RauSach("Rau muống", "Vĩnh Phúc", 5000, 9));
        list.add(new RauSach("Rau rền", "Cà Mau", 7000, 10));
        list.add(new RauSach("Rau sạch", "Cao Bằng", 72000, 8));
        list.add(new RauSach("Rau bẩn", "Nghệ An", 1000, 7));
        fillToTable();
    }
    
    private void fillToTable() {
        model = (DefaultTableModel) tblShow.getModel();
        model.setRowCount(0);
        for (RauSach x : list) {
            model.addRow(new Object[]{
                x.getTen(), x.getDiaChi(), x.getGia(), x.getKhoangCach()
            });
        }
    }
    
    private boolean checkTrung(String newName) {
        boolean check = false;
        for (RauSach x : list) {
            if (x.getTen().equalsIgnoreCase(newName)) {
                check = true;
            }
        }
        return check;
    }

    private void max() {
        double max = 0;
        for (int i = 0; i < list.size() -1; i++) {
            max =  list.get(i).getGia();
            index = i;
        }
    }
    
    private void showTop3() {
        
        Collections.sort(list, (a, b) -> (int) (b.getGia() - a.getGia()));
        model = (DefaultTableModel) tblShow.getModel();
        model.setRowCount(0);
        for (int i = 0; i < 3; i++) {
            model.addRow(new Object[]{
                list.get(i).getTen(), list.get(i).getDiaChi(), list.get(i).getGia(), list.get(i).getKhoangCach()
            });
        }
        
    }
    
    private void showKcTop3() {
        
        Collections.sort(list, (a, b) -> (int) (a.getKhoangCach() - b.getKhoangCach()));
        model = (DefaultTableModel) tblShow.getModel();
        model.setRowCount(0);
        for (int i = 0; i < 3; i++) {
            model.addRow(new Object[]{
                list.get(i).getTen(), list.get(i).getDiaChi(), list.get(i).getGia(), list.get(i).getKhoangCach()
            });
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
            java.util.logging.Logger.getLogger(JfrTest2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfrTest2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfrTest2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfrTest2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfrTest2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGia;
    private javax.swing.JButton btnShowKC;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblShow;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtKC;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables

}