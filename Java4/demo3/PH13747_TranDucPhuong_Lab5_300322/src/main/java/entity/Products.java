package entity;

import javax.persistence.*;

@Entity
public class Products {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "ten", nullable = false, length = 255)
    private String ten;
    @Basic
    @Column(name = "category_id", nullable = false)
    private int categoryId;
    @Basic
    @Column(name = "so_luong", nullable = false)
    private int soLuong;
    @Basic
    @Column(name = "don_gia", nullable = false, precision = 0)
    private double donGia;
    @Basic
    @Column(name = "mau_sac", nullable = false, length = 255)
    private String mauSac;
    @Basic
    @Column(name = "kich_thuoc", nullable = false, length = 255)
    private String kichThuoc;
    @Basic
    @Column(name = "img", nullable = true, length = 255)
    private String img;
    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    private Categories categoriesByCategoryId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(String kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Products products = (Products) o;

        if (id != products.id) return false;
        if (categoryId != products.categoryId) return false;
        if (soLuong != products.soLuong) return false;
        if (Double.compare(products.donGia, donGia) != 0) return false;
        if (ten != null ? !ten.equals(products.ten) : products.ten != null) return false;
        if (mauSac != null ? !mauSac.equals(products.mauSac) : products.mauSac != null) return false;
        if (kichThuoc != null ? !kichThuoc.equals(products.kichThuoc) : products.kichThuoc != null) return false;
        if (img != null ? !img.equals(products.img) : products.img != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (ten != null ? ten.hashCode() : 0);
        result = 31 * result + categoryId;
        result = 31 * result + soLuong;
        temp = Double.doubleToLongBits(donGia);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (mauSac != null ? mauSac.hashCode() : 0);
        result = 31 * result + (kichThuoc != null ? kichThuoc.hashCode() : 0);
        result = 31 * result + (img != null ? img.hashCode() : 0);
        return result;
    }

    public Categories getCategoriesByCategoryId() {
        return categoriesByCategoryId;
    }

    public void setCategoriesByCategoryId(Categories categoriesByCategoryId) {
        this.categoriesByCategoryId = categoriesByCategoryId;
    }
}
