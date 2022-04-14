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
public class StudentUD extends Students {

    public double diemJava, diemMOB;

    public StudentUD() {
    }

    public StudentUD(double diemJava, double diemMOB, String id, String name, String national) {
        super(id, name, national);
        this.diemJava = diemJava;
        this.diemMOB = diemMOB;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public double getDiemMOB() {
        return diemMOB;
    }

    public void setDiemMOB(double diemMOB) {
        this.diemMOB = diemMOB;
    }

    @Override
    public String toString() {
        return super.toString() + "StudentUD{" + "diemJava=" + diemJava + ", diemMOB=" + diemMOB + ", diemTB=" + getDiemTB() + '}';
    }

    @Override
    double getDiemTB() {
        return (diemJava + diemMOB) / 2;
    }
    Scanner sc = new Scanner(System.in);

    @Override
    public void input() {
        super.input();
        System.out.println("Mời bạn nhập điểm java: ");
        diemJava = Double.parseDouble(sc.nextLine());
        System.out.println("Mời bạn nhập điểm MOB: ");
        diemMOB = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void output() {
        super.output(); //To change body of generated methods, choose Tools | Templates.
        System.out.println(toString());
    }

}
