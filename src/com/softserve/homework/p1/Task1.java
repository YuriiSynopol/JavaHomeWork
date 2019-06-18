package com.softserve.homework.p1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Enter two numbers:");

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        System.out.println("Addition " + (a+b));
        System.out.println("Subtraction " + (a-b));
        System.out.println("Multiplication " + (a*b));
        try{
        System.out.println("Division " + (a/b));}
        catch(Exception e){
            System.out.println("You can't Division on Zero");
        }

    }
}
