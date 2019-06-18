package com.softserve.homework.n1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlowerBed {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter radius ");
        double r = Double.parseDouble(br.readLine());
        double d = r * 2;
        double S = 3.14 * (Math.pow(r, 2));
        double P = 2 * 3.14 * r;

        System.out.println("Area " + S);
        System.out.println("Perimeter " + P);

    }
}
