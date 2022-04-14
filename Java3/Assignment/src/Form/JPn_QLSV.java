/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import Helper.DatabaseHelper;
import Model.SinhVien;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class JPn_QLSV extends javax.swing.JPanel {

    int index;
    DefaultTableModel model;
    Connection cn;
    ArrayList<SinhVien> listSv = new ArrayList<>();
    String fileName = "";

    public JPn_QLSV() {
        initComponents();
        connectionToDatabase();
        loadData();
        model = (DefaultTableModel) tblShowData.getModel();
        loadDataToTable();

    }

    private void connectionToDatabase() {
        cn = DatabaseHelper.ketNoi("FPL_DaoTao1");
        if (cn != null) {
            System.out.println("Kết nối thành công");
        } else {
            System.out.println("Kết nối thất bại");
            System.exit(0);
        }
    }

    private void loadData() {
        try {
            cn = DatabaseHelper.ketNoi("FPL_DaoTao1");

            String sql = "select * from STUDENTS";
            PreparedStatement statement = cn.prepareStatement(sql);

            ResultSet rs = statement.executeQuery();

            listSv.clear();
            while (rs.next()) {
                String maSv = rs.getString(1);
                String hoTen = rs.getString(2);
                String email = rs.getString(3);
                String sdt = rs.getString(4);
                String diaChi = rs.getString(6);
                String gt = "";
                if (chkNam.isSelected()) {
                    gt = "Nam";
                } else {
                    gt = "Nữ";
                }
                String hinh = rs.getString(7);

                listSv.add(new SinhVien(maSv, hoTen, email, sdt, diaChi, hinh, gt));
            }

            cn.close();
            statement.close();

        } catch (Exception e) {
        }
    }

    private void loadDataToTable() {
        try {
            cn = DatabaseHelper.ketNoi("FPL_DaoTao1");
            String sql = "select * from STUDENTS";
            
            PreparedStatement stm = cn.prepareStatement(sql);

            ResultSet rs = stm.executeQuery();
            model.setRowCount(0);
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getByte(5), rs.getString(6), rs.getString(7)
                });
            }
            if (model.getRowCount() > 0) {
                index = 0;
                showDetail();
            }

            cn.close();
            stm.close();
            rs.close();
        } catch (Exception e) {
        }

    }

    private boolean checkTrungMa(String maSv) {
        boolean check = false;

        for (SinhVien x : listSv) {
            if (x.getMaSv().equals(maSv)) {
                check = true;
            }
        }
        return check;
    }

    public void upImg(String path) {
        ImageIcon ic = new ImageIcon("src\\img\\" + path + ".JPG");
        Image im = ic.getImage();
        ImageIcon ic2 = new ImageIcon(im.getScaledInstance(lbHinh.getWidth(), lbHinh.getHeight(), im.SCALE_SMOOTH));
        lbHinh.setIcon(ic2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSdt = new javax.swing.JTextField();
        chkNam = new javax.swing.JRadioButton();
        chkNu = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDiachi = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblShowData = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbHinh = new javax.swing.JLabel();
        btnImg = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Quản lí sinh viên");

        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Add.png"))); // NOI18N
        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Save.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel2.setText("Mã SV:");

        jLabel3.setText("Họ tên:");

        jLabel4.setText("SĐT:");

        jLabel5.setText("Email:");

        jLabel6.setText("Địa chỉ:");

        jLabel7.setText("Giới tính:");

        buttonGroup1.add(chkNam);
        chkNam.setText("Nam");

        buttonGroup1.add(chkNu);
        chkNu.setText("Nữ");

        txtDiachi.setColumns(20);
        txtDiachi.setRows(5);
        jScrollPane1.setViewportView(txtDiachi);

        tblShowData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SV", "Họ tên", "Email", "SĐT", "Giới tính", "Địa chỉ", "Hình"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblShowData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblShowDataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblShowData);

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Delete.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Upload.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbHinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/User.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbHinh, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(lbHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnImg.setText("Add Image");
        btnImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(txtSdt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTen, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMa, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnDelete)
                                            .addComponent(btnNew))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnSave)
                                            .addComponent(btnUpdate)))
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(chkNam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkNu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnImg)
                                .addGap(72, 72, 72))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDelete, btnNew, btnSave, btnUpdate});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(chkNam)
                            .addComponent(chkNu))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnImg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDelete, btnNew, btnSave, btnUpdate});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            cn = DatabaseHelper.ketNoi("FPL_DaoTao1");
            String sql = "update STUDENTS\n"
                    + "set HOTEN = ?, EMAIL = ?, SODT = ?, GIOTINH = ?, DIACHI = ?, HINH =?\n"
                    + "where MASV = ?";

            PreparedStatement statement = cn.prepareStatement(sql);

            try {
                if (checkTrungMa(txtMa.getText()) == false) {
                    JOptionPane.showMessageDialog(this, "Mã sinh viên không tồn tại");
                    txtMa.requestFocus();
                } else {
                    statement.setString(7, txtMa.getText());
                }
            } catch (Exception e) {
            }

            try {
                if (txtTen.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Tên sinh viên không được để trống");
                    txtTen.requestFocus();
                    return;
                } else {
                    statement.setString(1, txtTen.getText());
                }
            } catch (Exception e) {
            }

            try {
                String ranger = "\\w+@gmail.com";
                if (!txtEmail.getText().matches(ranger)) {
                    JOptionPane.showMessageDialog(this, "Email không đúng");
                    txtEmail.requestFocus();
                    return;
                } else if (txtEmail.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Email không được để trống");
                    txtEmail.requestFocus();
                    return;
                } else {
                    statement.setString(2, txtEmail.getText());
                }
            } catch (Exception e) {
            }

            try {
                String ranger = "0[3,9](\\d){8}";
                if (!txtSdt.getText().matches(ranger)) {
                    JOptionPane.showMessageDialog(this, "Số điện thoại không đúng");
                    txtEmail.requestFocus();
                    return;
                } else if (txtSdt.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Số điện thoại không được để trống");
                    txtSdt.requestFocus();
                    return;
                } else {
                    statement.setString(3, txtSdt.getText());
                }
            } catch (Exception e) {
            }

            try {
                if (txtDiachi.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Địa chỉ không được để trống");
                    txtDiachi.requestFocus();
                    return;
                } else {
                    statement.setString(5, txtDiachi.getText());
                }
            } catch (Exception e) {
            }

            statement.setString(4, chkNam.isSelected() ? "1" : "0");

            statement.setString(6, fileName.trim());

            statement.executeUpdate();

            JOptionPane.showMessageDialog(this, "Cập nhật thành công");
            cn.close();
            statement.close();
            loadData();
            loadDataToTable();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed

        txtDiachi.setText("");
        txtEmail.setText("");
        txtMa.setText("");
        txtSdt.setText("");
        txtTen.setText("");
        chkNam.setSelected(true);
        upImg("");

    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            cn = DatabaseHelper.ketNoi("FPL_DaoTao1");
            String sql = "insert STUDENTS(MASV, HOTEN, EMAIL, SODT, GIOTINH, DIACHI, HINH)\n"
                    + "values(?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement statement = cn.prepareStatement(sql);
            try {
                if (checkTrungMa(txtMa.getText()) == true) {
                    JOptionPane.showMessageDialog(this, "Mã sinh viên đã tồn tại");
                    txtMa.requestFocus();
                    return;
                } else if (txtMa.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Mã sinh viên không được để trống");
                    txtMa.requestFocus();
                    return;
                } else {
                    statement.setString(1, txtMa.getText());
                }
            } catch (Exception e) {
            }

            try {
                if (txtTen.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Tên sinh viên không được để trống");
                    txtTen.requestFocus();
                    return;
                } else {
                    statement.setString(2, txtTen.getText());
                }
            } catch (Exception e) {
            }

            try {
                String ranger = "\\w+@gmail.com";
                if (!txtEmail.getText().matches(ranger)) {
                    JOptionPane.showMessageDialog(this, "Email không đúng");
                    txtEmail.requestFocus();
                    return;
                } else if (txtEmail.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Email không được để trống");
                    txtEmail.requestFocus();
                    return;
                } else {
                    statement.setString(3, txtEmail.getText());
                }
            } catch (Exception e) {
            }

            try {
                String ranger = "0[3,9](\\d){8}";
                if (!txtSdt.getText().matches(ranger)) {
                    JOptionPane.showMessageDialog(this, "Số điện thoại không đúng");
                    txtEmail.requestFocus();
                    return;
                } else if (txtSdt.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Số điện thoại không được để trống");
                    txtSdt.requestFocus();
                    return;
                } else {
                    statement.setString(4, txtSdt.getText());
                }
            } catch (Exception e) {
            }

            try {
                if (txtDiachi.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Địa chỉ không được để trống");
                    txtDiachi.requestFocus();
                    return;
                } else {
                    statement.setString(6, txtDiachi.getText());
                }
            } catch (Exception e) {
            }

            statement.setString(5, chkNam.isSelected() ? "1" : "0");

            statement.setString(7, fileName.trim());

            statement.executeUpdate();

            JOptionPane.showMessageDialog(this, "Thêm thành công");
            cn.close();
            statement.close();

            loadData();
            loadDataToTable();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImgActionPerformed
        JFileChooser chooser = new JFileChooser();
        int rs = chooser.showOpenDialog(this);

        if (rs == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            String path = file.getAbsolutePath();

            fileName = chooser.getSelectedFile().getName();

            upImg(path);
            Path src = Paths.get(path);
            Path p = Paths.get("src\\img\\" + fileName + ".JPG");

            try {
                Files.copy(src, p, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException ex) {
                Logger.getLogger(JPn_QLSV.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnImgActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            index = tblShowData.getSelectedRow();
            cn = DatabaseHelper.ketNoi("FPL_DaoTao1");
            String sql = "delete from GRADE where MASV = ? delete from STUDENTS where MASV = ?";

            PreparedStatement stm = cn.prepareStatement(sql);
            stm.setString(1, txtMa.getText());
            stm.setString(2, txtMa.getText());
            if (index == -1) {
                JOptionPane.showMessageDialog(this, "Chọn dòng cần xóa");
                return;
            } else if (listSv.size() <= 0) {
                JOptionPane.showMessageDialog(this, "List sinh viên tróng");
                return;
            } else {
                if (JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không ?") == JOptionPane.YES_OPTION) {
                    stm.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Xóa thành công");
                }
            }
            cn.close();
            stm.close();

            loadData();
            loadDataToTable();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblShowDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblShowDataMouseClicked
        index = tblShowData.getSelectedRow();
        showDetail();
    }//GEN-LAST:event_tblShowDataMouseClicked

    public void showDetail() {
        SinhVien sv = listSv.get(index);
        txtMa.setText(sv.getMaSv());
        txtDiachi.setText(sv.getDiaChi());
        txtEmail.setText(sv.getEmail());
        txtTen.setText(sv.getHoTen());
        txtSdt.setText(sv.getSoDt());
        if (model.getValueAt(index, 4).toString().equals("1")) {
            chkNam.setSelected(true);
        } else {
            chkNu.setSelected(true);
        }
        upImg(model.getValueAt(index, 6).toString());

        tblShowData.setRowSelectionInterval(index, index);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnImg;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton chkNam;
    private javax.swing.JRadioButton chkNu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbHinh;
    private javax.swing.JTable tblShowData;
    private javax.swing.JTextArea txtDiachi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
