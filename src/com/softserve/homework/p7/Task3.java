package com.softserve.homework.p7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    private String userNameString;

    public void setUserNameString(String userNameString) {

        this.userNameString = userNameString;
    }

    public static boolean check(String userNameString) {

        Pattern p = Pattern.compile(("[a-zA-Z-_0-9]{3,15}$"));
        Matcher m = p.matcher(userNameString);
        return m.matches();
    }

    public static void main(String[] args) {

        System.out.println(check("Vasya"));
        System.out.println("Valid value");
        System.out.println(check("Va_ds"));
        System.out.println("Valid value");
        System.out.println(check("Nodsfxfg93"));
        System.out.println("Valid value");
        System.out.println(check("Fodfg93$$"));
        System.out.println("Not Valid value");


    }
}
