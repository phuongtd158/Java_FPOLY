/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class XDate {

    static SimpleDateFormat formater = new SimpleDateFormat();

    //Chuyển đổi từ String sang Date
    public static Date toDate(String date, String pattern) {
        try {
            formater.applyPattern(pattern);
            if (date == null) {
                return XDate.now();
            }
            return formater.parse(date);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    //Chuyển đổi từ Date sang String
    public static String toString(Date date, String pattern) {
        try {
            formater.applyPattern(pattern);
            if (date == null) {
                date = XDate.now();
            }
            return formater.format(date);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Date now() {
        return new Date();
    }

    //Bổ sung ngày
    public static Date addDays(Date date, long days) {
        date.setTime(date.getTime() + days * 24 * 60 * 60 * 1000);
        return date;
    }
}
