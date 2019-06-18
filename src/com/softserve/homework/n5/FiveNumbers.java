package com.softserve.homework.n5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FiveNumbers {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 5 numbers ");
        int[] array = new int[5];


        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        int min = array[0];
        int imin = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                imin = i;
            }
        }
        System.out.println("The minimum number " + min + " is on the " + (imin + 1) + " position.");

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                if (count < 1) {
                    count++;
                } else {
                    System.out.println("The second positive number is on the " + (i + 1) + " position.");
                    count++;
                    break;
                }
            }

        }
        if (count < 2) {
            System.out.println("There is less than two positive numbers.");
        }
        int[] arr = new int[100];
        int i = 0;
        int product = 1;

        System.out.println("Enter your numbers, the program will stop when you enter the negative number.");
        while (true) {
            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i] < 0) {
                break;
            } else if (arr[i] % 2 == 0) {
                product *= arr[i];
            }
            i++;
        }
        System.out.println("The product of all even numbers is: " + product);
    }
}






