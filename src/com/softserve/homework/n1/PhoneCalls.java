package com.softserve.homework.n1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneCalls {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("In Portugal calls cost per minute");
        double a = Double.parseDouble(br.readLine());
        System.out.println("In Italy cost calls cost per minute");
        double b = Double.parseDouble(br.readLine());
        System.out.println("In Spain cost calls cost per minute");
        double c = Double.parseDouble(br.readLine());

        System.out.println("How long do you speak in minutes? ");
        double d = Double.parseDouble(br.readLine());
        System.out.println("You Will Pay "+(a*d));
        System.out.println("How long do you speak in minutes?  ");
        double e = Double.parseDouble(br.readLine());
        System.out.println("You Will Pay "+(b*e));
        System.out.println("How long do you speak in minutes?  ");
        double f = Double.parseDouble(br.readLine());
        System.out.println("You Will Pay "+(c*f));

    }
}
