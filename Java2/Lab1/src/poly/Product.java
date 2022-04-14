/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

import java.util.Scanner;
import poly2.DAO;

/**
 *
 * @author ADMIN
 */
public class Product implements DAO {
    private String name;
    private double price;
    Scanner sc = new Scanner(System.in);

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + '}';
    }
    
    public void nhap(){
        System.out.println("Mời bạn nhập tên sản phẩm: ");
        name = sc.nextLine();
        System.out.println("MỜi bạn nhập giá sản phẩm");
        price = Double.parseDouble(sc.nextLine());
    }
    public void xuat(){
        System.out.println(toString());
    }

    @Override
    public void insert() {
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void update() {
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void delete() {
         System.out.println("Thêm mới thành công");
    }

    @Override
    public void select() {
         System.out.println("Thêm mới thành công");
    }
}
