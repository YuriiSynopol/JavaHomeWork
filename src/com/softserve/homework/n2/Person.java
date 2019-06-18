package com.softserve.homework.n2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Person {
    private String name;
    private int birthYear;
    private String another;

    public Person() {
    }

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int age() {
        LocalDate localDate = LocalDate.now();
        return localDate.getYear() - birthYear;
    }

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Person p3 = new Person();
        System.out.println("Enter the name : ");
        String name = br.readLine();
        p3.setName(name);
        System.out.println("Enter the birth year : ");
        int birthYear = Integer.parseInt(br.readLine());
        p3.setBirthYear(birthYear);
        System.out.println(p3);

    }

    public void output() {
        System.out.println("Person name " + name + " person birthYear " + birthYear);

    }

    public void changeName(String another) {
        name = another;
        System.out.println(another);

    }

    @Override
    public String toString() {
        return "Name : " + name + ", " + "Birth year : " + birthYear + ", " + "Age : " + age() + ".";
    }

    public static void main(String[] args) throws IOException {
        Person p1 = new Person("Yurii", 1995);

        Person p2 = new Person("Kolya", 1990);


        p1.changeName("Vasil");
        input();
        p2.output();


        System.out.println(p2.age());


    }


}
