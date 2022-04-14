/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class JFrQuanLySinhVien extends javax.swing.JFrame {

    ArrayList<SinhVien> listSv = new ArrayList<>();

    public JFrQuanLySinhVien() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        txtMarks.setText(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        lbMarks = new javax.swing.JLabel();
        cbbMajor = new javax.swing.JComboBox<>();
        lbMajor = new javax.swing.JLabel();
        lbHocLuc = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtMarks = new javax.swing.JTextField();
        txtHocLuc = new javax.swing.JTextField();
        chkPhanThuong = new javax.swing.JCheckBox();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbShow = new javax.swing.JTable();
        btnSapTheoTen = new javax.swing.JButton();
        btnSapTheoDiem = new javax.swing.JButton();
        btnPre = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lab 3");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Quản Lý Sinh Viên");

        lbName.setText("Họ và tên:");

        lbMarks.setText("Điểm");

        cbbMajor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ứng dụng phần mềm", "Maketing", "Mobile", "Khách sạn", "Thiết kế website" }));

        lbMajor.setText("Ngành");

        lbHocLuc.setText("Học lực");

        txtHocLuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHocLucActionPerformed(evt);
            }
        });

        chkPhanThuong.setText("Có phần thưởng ?");

        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRemove.setText("Xóa");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnUpdate.setText("Cập nhật");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnNew.setText("Nhập mới");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        tbShow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Họ tên", "Điểm", "Ngành ", "Học lực", "Thưởng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbShowMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbShow);

        btnSapTheoTen.setText("Sắp xếp theo tên");
        btnSapTheoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapTheoTenActionPerformed(evt);
            }
        });

        btnSapTheoDiem.setText("Sắp xếp theo điểm");
        btnSapTheoDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapTheoDiemActionPerformed(evt);
            }
        });

        btnPre.setText("<< Pre ");
        btnPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreActionPerformed(evt);
            }
        });

        jButton2.setText("btnNext");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbName)
                            .addComponent(lbMarks)
                            .addComponent(lbMajor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMarks, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbMajor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbHocLuc)
                                    .addComponent(btnAdd))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkPhanThuong)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(btnRemove)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnUpdate)
                                            .addGap(35, 35, 35)
                                            .addComponent(btnNew))
                                        .addComponent(txtHocLuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSapTheoTen)
                        .addGap(26, 26, 26)
                        .addComponent(btnSapTheoDiem)
                        .addGap(60, 60, 60)
                        .addComponent(btnPre)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtHocLuc, txtMarks, txtName});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMarks)
                    .addComponent(txtMarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMajor)
                    .addComponent(cbbMajor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHocLuc)
                    .addComponent(txtHocLuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(chkPhanThuong)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnRemove)
                            .addComponent(btnUpdate)
                            .addComponent(btnNew))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSapTheoTen)
                            .addComponent(btnSapTheoDiem))
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPre)
                            .addComponent(jButton2))
                        .addGap(14, 14, 14))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtHocLuc, txtMarks, txtName});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtHocLucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHocLucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHocLucActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        add();
        fillToTable();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        remove();
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        update();
        fillToTable();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        newUser();
    }//GEN-LAST:event_btnNewActionPerformed

    private void tbShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbShowMouseClicked
        DefaultTableModel model = (DefaultTableModel) tbShow.getModel();
        int index = tbShow.getSelectedRow();
        SinhVien sv = listSv.get(index);
        txtName.setText(sv.getName());
        txtMarks.setText(model.getValueAt(index, 1).toString());
        cbbMajor.setSelectedItem(model.getValueAt(index, 2).toString());
        txtHocLuc.setText(model.getValueAt(index, 3).toString());
        chkPhanThuong.setSelected(sv.isBound());
     

    }//GEN-LAST:event_tbShowMouseClicked

    private void btnSapTheoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapTheoTenActionPerformed
        sapXepTheoTen();
        fillToTable();
    }//GEN-LAST:event_btnSapTheoTenActionPerformed

    private void btnSapTheoDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapTheoDiemActionPerformed
        sapXepTheoDiem();
        fillToTable();
    }//GEN-LAST:event_btnSapTheoDiemActionPerformed

    private void btnPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreActionPerformed
       pre();
       fillToTable();
    }//GEN-LAST:event_btnPreActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        next();
    }//GEN-LAST:event_jButton2ActionPerformed

    //Thêm mới sinh viên
    public void add() {
        SinhVien sv = new SinhVien();
        sv.name = txtName.getText().trim();
        sv.marks = Double.parseDouble(txtMarks.getText().trim());
        sv.major = (String) cbbMajor.getSelectedItem();
        if (txtName.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Khong duoc de trong ten");
            return;
        } else if (Double.parseDouble(txtMarks.getText()) < 0 || Double.parseDouble(txtMarks.getText().trim()) > 10) {
            JOptionPane.showMessageDialog(this, "Diem phai lon hon 0 va nho hon 10");
            return;
        } else if (checkTrung(txtName.getText().trim()) == true) {
            JOptionPane.showMessageDialog(this, "Da ton tai sinh vien");
            return;
        } else {
            listSv.add(sv);
            clean();
        }
        txtHocLuc.setText(sv.getGrade());
        chkPhanThuong.setSelected(sv.isBound());
    }

    //Xóa sinh viên
    public void remove() {
        DefaultTableModel model = (DefaultTableModel) tbShow.getModel();
        int index = tbShow.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Chon dong can xoa");
        } else if (listSv.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Hay them thong tin de xoa");
        } else {
            model.removeRow(index);
        }
    }

    //Cập nhật danh sách sinh viên
    public void update() {
        DefaultTableModel model = (DefaultTableModel) tbShow.getModel();
        int index = tbShow.getSelectedRow();
        SinhVien sv = listSv.get(index);
        sv.name = txtName.getText();
        sv.marks = Double.parseDouble(txtMarks.getText());
        sv.major = (String) cbbMajor.getSelectedItem();
        txtHocLuc.setText(sv.getGrade());
        chkPhanThuong.setSelected(sv.isBound());
    }

    //Nhập mới sinh viên
    public void newUser() {
        clean();
        txtHocLuc.setText("");
        chkPhanThuong.setSelected(false);
        cbbMajor.setSelectedIndex(0);
    }

    //Sắp xếp sinh viên theo điểm
    public void sapXepTheoDiem() {
        Comparator<SinhVien> comparator = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                Double d1 = o1.getMarks();
                Double d2 = o2.getMarks();
                return d1.compareTo(d2);
            }
        };
        Collections.sort(listSv, comparator);
    }
    
    //Sắp xếp sinh viên theo điểm
    public void sapXepTheoTen() {
        Comparator<SinhVien> comparator = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
               String s1 = o1.getName();
               String s2 = o2.getName();
               return s1.compareToIgnoreCase(s2);
            }
        };
        Collections.sort(listSv, comparator);
    }
    
    //Xóa trắng tên và điểm
    public void clean() {
        txtName.setText("");
        txtMarks.setText("");

    }

    //Check trùng tên sinh viên
    public boolean checkTrung(String newName) {
        boolean check = false;
        for (SinhVien x : listSv) {
            if (x.getName().equalsIgnoreCase(newName)) {
                check = true;
            }
        }
        return check;
    }

    //Đổ dữ liệu vào bảng
    public void fillToTable() {
        DefaultTableModel model = (DefaultTableModel) tbShow.getModel();
        model.setRowCount(0);
        for (SinhVien x : listSv) {
            model.addRow(new Object[]{
                x.getName(), x.getMarks(), x.getMajor(), x.getGrade(), x.isBound()
            });
        }
    }
    
    public void pre(){
        DefaultTableModel model = (DefaultTableModel)tbShow.getModel();
        int index = tbShow.getSelectedRow();
        if (index == 0) {
            tbShow.getSelectedRowCount();
            index++;
        }
    }
    public void next(){
        
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
            java.util.logging.Logger.getLogger(JFrQuanLySinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrQuanLySinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrQuanLySinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrQuanLySinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrQuanLySinhVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnPre;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSapTheoDiem;
    private javax.swing.JButton btnSapTheoTen;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbbMajor;
    private javax.swing.JCheckBox chkPhanThuong;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbHocLuc;
    private javax.swing.JLabel lbMajor;
    private javax.swing.JLabel lbMarks;
    private javax.swing.JLabel lbName;
    private javax.swing.JTable tbShow;
    private javax.swing.JTextField txtHocLuc;
    private javax.swing.JTextField txtMarks;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

}
