package com.softserve.homework.p5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numbers {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int [] arr = new int[10];

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int max = arr[0];
        int i = 0;
        while (i < arr.length) {
            if (arr[i] > max) {
                max = arr[i];
            }
            i++;
        }
        System.out.println("Maximum = " + max);

        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > 0) {
                sum += arr[j];
            }
        }
        System.out.println("Sum = " + sum);

        int amount = 0;
        for (int a : arr) {
            if (a < 0 ) {
                amount++;
            }
        }
        System.out.println("Amount = " + amount);


    }
}
