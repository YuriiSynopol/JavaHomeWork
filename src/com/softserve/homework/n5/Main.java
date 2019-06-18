package com.softserve.homework.n5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Car[] carArray = new Car[4];

        carArray[0] = new Car("Sedan", 2002, 5);
        carArray[1] = new Car("Coupe", 2015, 3);
        carArray[2] = new Car("Hatchback", 1993, 6);
        carArray[3] = new Car("Cabriolet", 2019, 5);

        System.out.println("Enter the year: ");
        int year = Integer.parseInt(br.readLine());

        for (Car i : carArray) {
            if (i.getYear() == year) {
                System.out.println(i);
            }
        }


    }
}

