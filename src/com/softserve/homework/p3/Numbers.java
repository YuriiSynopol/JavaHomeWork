package com.softserve.homework.p3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numbers {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Enter 3 nbmbers");
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if (a % 2 != 0) {
            System.out.println(a + " odd");
        }
        if (b % 2 != 0) {
            System.out.println(b + " odd");
        }
        if (c % 2 != 0) {
            System.out.println(c + " odd");
        }

    }
}
