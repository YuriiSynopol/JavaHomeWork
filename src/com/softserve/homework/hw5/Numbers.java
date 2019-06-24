package com.softserve.homework.hw5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int num = 0;
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] > 0) {
                num = array[0] + array[1] + array[2] + array[3] + array[4];
            } else {
                for (int j = 5; i < array.length; i++) {
                    num = array[5] * array[6] * array[7] * array[8] * array[9];
                }
            }
            System.out.println(num);
        }
    }
}