package com.softserve.homework.p8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Task1 {

    private int a;
    private int b;

    public Task1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static int squareRectangle(int a, int b) {
        int s = a * b;
        return s;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Enter two numbers");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        if (a < 0) {
            throw new ArithmeticException("Bad First Number!");
        } else if (b < 0) {
            throw new ArithmeticException("Bad Second Number!");
        }
        System.out.println(squareRectangle(a, b));

    }

}

