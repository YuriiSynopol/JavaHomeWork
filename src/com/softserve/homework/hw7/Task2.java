package com.softserve.homework.hw7;

public class Task2 {


    public static void main(String[] args) {

        String str = "   Fuck popo    police  enemies    fake  homies   ";
        System.out.println(str);

        String str1 = str.trim().replaceAll("\\s{1,}", " ");
        System.out.println(str1);

    }
}
