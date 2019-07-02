package com.softserve.homework.p7;

public class Task2 {


    public static void main(String[] args) {
        String a = "Synopol Yurii Romanovich";
        String[] arr = a.split(" ");
        System.out.print(arr[0]+" "+ arr[1].substring(0, 1)+". "+ arr[2].substring(0, 1)+".");
        System.out.println(arr[1]);
        System.out.println(arr[1]+" " + arr[2]+ " "+arr[0]);

    }
}

