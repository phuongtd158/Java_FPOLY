package entity1;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Students {
    private int id;
    private String maSv;
    private String hoTen;
    private String gioiTinh;
    private String chuyenNganh;
    private String sdt;
    private String email;
    private Timestamp thoiGianTao;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "MaSV")
    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    @Basic
    @Column(name = "HoTen")
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    @Basic
    @Column(name = "GioiTinh")
    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Basic
    @Column(name = "ChuyenNganh")
    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    @Basic
    @Column(name = "SDT")
    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Basic
    @Column(name = "Email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "ThoiGianTao")
    public Timestamp getThoiGianTao() {
        return thoiGianTao;
    }

    public void setThoiGianTao(Timestamp thoiGianTao) {
        this.thoiGianTao = thoiGianTao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Students students = (Students) o;

        if (id != students.id) return false;
        if (maSv != null ? !maSv.equals(students.maSv) : students.maSv != null) return false;
        if (hoTen != null ? !hoTen.equals(students.hoTen) : students.hoTen != null) return false;
        if (gioiTinh != null ? !gioiTinh.equals(students.gioiTinh) : students.gioiTinh != null) return false;
        if (chuyenNganh != null ? !chuyenNganh.equals(students.chuyenNganh) : students.chuyenNganh != null)
            return false;
        if (sdt != null ? !sdt.equals(students.sdt) : students.sdt != null) return false;
        if (email != null ? !email.equals(students.email) : students.email != null) return false;
        if (thoiGianTao != null ? !thoiGianTao.equals(students.thoiGianTao) : students.thoiGianTao != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (maSv != null ? maSv.hashCode() : 0);
        result = 31 * result + (hoTen != null ? hoTen.hashCode() : 0);
        result = 31 * result + (gioiTinh != null ? gioiTinh.hashCode() : 0);
        result = 31 * result + (chuyenNganh != null ? chuyenNganh.hashCode() : 0);
        result = 31 * result + (sdt != null ? sdt.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (thoiGianTao != null ? thoiGianTao.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", maSv='" + maSv + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", chuyenNganh='" + chuyenNganh + '\'' +
                ", sdt='" + sdt + '\'' +
                ", email='" + email + '\'' +
                ", thoiGianTao=" + thoiGianTao +
                '}';
    }
}
