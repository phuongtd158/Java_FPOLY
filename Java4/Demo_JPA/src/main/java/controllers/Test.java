package controllers;

import dao.UserDAO;
import entity.User;

import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        UserDAO dao = new UserDAO();
        User user = dao.findByUserIdAndPassword("Phuong11", "123");
        System.out.println(user.toString());
    }
}
