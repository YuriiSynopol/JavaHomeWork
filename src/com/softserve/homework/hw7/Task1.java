package com.softserve.homework.hw7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter sentence with 5 words");
        String str = br.readLine();
        String[] arr = str.split(" ");
        arr[1] = new StringBuffer(arr[1]).reverse().toString();

        String max = "";

        for(int i = 0; i<arr.length; i++){
            if(arr[i].length() >= max.length()){
                max = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(str.replace(" ", "").length());
        System.out.println(arr[1]);
    }

}
