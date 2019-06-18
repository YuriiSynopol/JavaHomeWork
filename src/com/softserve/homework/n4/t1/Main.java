package com.softserve.homework.n4.t1;

public class Main {
    public static void main(String[] args) {
        Bird[] bird = new Bird[4];

        bird[0] = new Eagle(true, true);
        bird[1] = new Swallow(true, true);
        bird[2] = new Penguin(false, true);
        bird[3] = new Chicken(true, true);

        for (Bird i : bird) {
            System.out.println(i);
            i.fly();



        }
    }
}