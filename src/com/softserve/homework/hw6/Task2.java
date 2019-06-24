package com.softserve.homework.hw6;

import java.util.*;

public class Task2 {


    public static boolean sameName(Map<String, String> personMap) {
        Set<String> temporary = new HashSet<String>();
        temporary.addAll(personMap.values());
        return personMap.size() == temporary.size() ? false : true;

    }


    public static void remove(Map<String, String> personMap, String removeName) {
        if (personMap.containsValue(removeName)) {
            for (Iterator<Map.Entry<String, String>> iterator = personMap.entrySet().iterator(); iterator.hasNext(); ) {
                if (iterator.next().getValue().equalsIgnoreCase(removeName)) {
                    iterator.remove();
                }
            }
        }
    }

    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<String, String>();

        personMap.put("Vasic", "Kolya");
        personMap.put("Bkas", "Pavel");
        personMap.put("Kvas", "Yura");
        personMap.put("Cab", "Yarik");
        personMap.put("Olsad", "Olya");
        personMap.put("Pos", "Yarik");
        personMap.put("Bnxh", "Katya");
        personMap.put("Ope", "Oleg");
        personMap.put("Lop", "Taras");


        System.out.println(sameName(personMap));

        System.out.println();
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " "
                    + entry.getValue());
        }
        System.out.println();
        remove(personMap, "Oleg");

        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " "
                    + entry.getValue());
        }


    }
}
