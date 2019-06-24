package com.softserve.homework.p6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Task2 {

    public static void main(String[] args) throws IOException {
        Map<Integer, String> employeeMap = new HashMap<>();

        employeeMap.put(1, "Vasya");
        employeeMap.put(2, "Tar");
        employeeMap.put(3, "Max");
        employeeMap.put(4, "Mike");
        employeeMap.put(5, "Ross");
        employeeMap.put(6, "Kos");
        employeeMap.put(7, "Kolya");
        System.out.println("All employee:");
        System.out.println(employeeMap);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter ID");
        String string;
        Integer a = Integer.parseInt(br.readLine());
        if (employeeMap.containsKey(a)) {
            System.out.println(employeeMap.get(a));
        } else {
            System.out.println("We don't have this key!");
        }
        System.out.println("Enter name");
        String b = br.readLine();

        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            if (entry.getValue().equals(b)) {
                System.out.println(entry.getKey());
            }
        }

    }
}

