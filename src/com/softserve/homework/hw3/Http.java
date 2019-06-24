package com.softserve.homework.hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Http {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException, Exception {
        System.out.println("Write your Error in format 'ERROR402' ");
        String a = br.readLine();
        HTTPError hh = HTTPError.valueOf(a);

        switch (hh) {
            case ERROR400:
                System.out.println("400 Bad Request Error");
                break;
            case ERROR401:
                System.out.println("401 Unauthorized Error");
                break;
            case ERROR402:
                System.out.println("402 Payment Required");
                break;
            case ERROR404:
                System.out.println("404 Not Found");
                break;
            default:
                System.out.println("Not correct Error");
                break;

        }

    }
}
