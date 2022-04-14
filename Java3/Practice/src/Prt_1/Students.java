/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prt_1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public abstract class Students implements SV_Interface {

    public String id, name, national;

    public Students() {
    }

    public Students(String id, String name, String national) {
        this.id = id;
        this.name = name;
        this.national = national;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    abstract double getDiemTB();

    @Override
    public String toString() {
        return "Students{" + "id=" + id + ", name=" + name + ", national=" + national + ", diemTB=" + '}';
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhâp id: ");
        id = sc.nextLine();
        System.out.println("Mời bạn nhập tên: ");
        name = sc.nextLine();
        System.out.println("Mời bạn nhập quốc tịch: ");
        national = sc.nextLine();
    }

    @Override
    public void output() {
        System.out.println(toString());
    }

}
