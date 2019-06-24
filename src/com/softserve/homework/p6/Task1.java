package com.softserve.homework.p6;

import java.util.*;

import static java.util.Collections.*;

public class Task1 {

    public static void main(String[] args) {
        Random rm = new Random();

        List<Integer> myCollection = new ArrayList<Integer>();
        List<Integer> newCollection = new ArrayList<Integer>();
        System.out.println("Random Numbers");
        for (int i = 0; i < 20; i++) {
            myCollection.add(rm.nextInt(40));
        }
        for (Integer i : myCollection) {
        }
        System.out.println(myCollection);
        System.out.println("New Collection With Number > 5;");
        for (Integer i : myCollection) {
            if (myCollection.stream().allMatch(a -> i > 5)) {
                newCollection.add(i);
            }
        }
        System.out.println(newCollection);

        System.out.println("Delete Number > 20");
        for (Iterator<Integer> iterator = myCollection.iterator(); iterator.hasNext(); ) {
            if (iterator.next() > 20) {
                iterator.remove();
            }
        }
        System.out.println(myCollection);

        myCollection.add(2, 1);
        myCollection.add(8, -3);
        myCollection.add(5, -4);
        System.out.println("Sorted ArrayList");
        sort(myCollection);
        System.out.println(myCollection);
    }


}

