package entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Categories {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "ten", nullable = false, length = 255)
    private String ten;
    @OneToMany(mappedBy = "categoriesByCategoryId")
    private Collection<Products> productsById;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Categories that = (Categories) o;

        if (id != that.id) return false;
        if (ten != null ? !ten.equals(that.ten) : that.ten != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (ten != null ? ten.hashCode() : 0);
        return result;
    }

    public Collection<Products> getProductsById() {
        return productsById;
    }

    public void setProductsById(Collection<Products> productsById) {
        this.productsById = productsById;
    }
}
