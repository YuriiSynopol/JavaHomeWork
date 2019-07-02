package com.softserve.homework.p8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        Plant[] plants = new Plant[5];

        try {

            plants[0] = new Plant("rose", "red", 18);
            plants[1] = new Plant("tulip", "red", 20);
            plants[2] = new Plant("tulip", "white", 10);
            plants[3] = new Plant("rose", "white", 17);
            plants[4] = new Plant("chamomileeee", "whiteeee", 25);

        } catch (TypeException | ColorException e) {
            System.err.println(e.getMessage());
        }

//        for (int i = 0; i < plants.length; i++) {
//            System.out.println(plants[i]);
//        }


    }
}
