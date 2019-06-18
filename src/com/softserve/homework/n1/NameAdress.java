package com.softserve.homework.n1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NameAdress {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your name?");

        String s = br.readLine();

        System.out.println("Where are you live, " + s + " ?");

        String a = br.readLine();

        System.out.println("Your name is" + s + "and you live in " + a);
    }
}
