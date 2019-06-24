package com.softserve.homework.hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numbers {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String checkRange(float a, float b, float c) {

        if (((a >= -5) && (a <= 5)) && ((b >= -5) && (b <= 5)) && ((c >= -5) && (c <= 5))) {
            return "All numbers is in range [-5;5]";
        }
        return "All numbers isn't in range[-5;5]";
    }

    public static String checkMaxMin(int d, int e, int f) {
        if (d > f && f > e) {
            return "Max is " + d + " Min is " + e;
        } else if (e > f && f > d) {
            return "Max is " + e + " Min is " + d;
        } else if (f > e && e > d) {
            return "Max is " + f + " Min is " + d;
        }else if (d > e && e > f) {
            return "Max is " + d + " Min is " + f;
        }else if (e > d && d > f) {
            return "Max is " + e + " Min is " + f;
        }
        else if (f > d && d > e) {
            return "Max is " + f + " Min is " + e;
        }
        return null;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Enter 3 Float numbers ");
        float a = Float.parseFloat(br.readLine());
        float b = Float.parseFloat(br.readLine());
        float c = Float.parseFloat(br.readLine());

        System.out.println(checkRange(a, b, c));

        System.out.println("Enter 3 Integers numbers ");
        int d = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());
        int f = Integer.parseInt(br.readLine());

        System.out.println(checkMaxMin(d, e, f));



    }

}
