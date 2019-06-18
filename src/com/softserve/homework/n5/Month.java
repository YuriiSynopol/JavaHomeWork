package com.softserve.homework.n5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Month {

    public static void main(String[] args) {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter month number ");


        {
            try {
                int a = Integer.parseInt(br.readLine());
                int month_days[] = {31, 28, 31, 30, 31, 30,
                        31, 31, 30, 31, 30, 31};
                for(int i =0; i<month_days.length;i++) {
                    if (a == (i+1)) {
                        System.out.println(month_days[i]);
                    }
                }
        } catch (IOException e) {
                e.printStackTrace();
            }


        }




    }

}
