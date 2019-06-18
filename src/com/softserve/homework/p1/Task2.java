package com.softserve.homework.p1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("How are you?");
        String a = br.readLine();
        System.out.println("You are "+a);
    }
}
