/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

/**
 *
 * @author ADMIN
 */
public class SinhVien {
    public String name;
    public double marks;
    public String major;

    public SinhVien(String name, double marks, String major) {
        this.name = name;
        this.marks = marks;
        this.major = major;
    }

    public SinhVien() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    
    public String getGrade(){
        if(marks < 3) return "Kém";
        if(marks < 5) return "Yếu";
        if(marks < 6.5) return "Trung bình";
        if(marks < 7.5) return "Khá";
        if(marks < 9) return "Giỏi";
        return "Xuất sắc";
    }
    public boolean isBound(){
        return marks >=7.5;
    }
}
