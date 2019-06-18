package com.softserve.homework.p3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberOfWeek {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int a = Integer.parseInt(br.readLine());
        System.out.println("Enter number of Week");

        switch (a){
            case 1:
                System.out.println("Панядзелак , Понеділок , Poniedziałek ");
                break;
            case 2:
                System.out.println("Аўторак , Вівторок , Wtorek ");
                break;
            case 3:
                System.out.println("Серада , Серeда , Środa  ");
                break;
            case 4:
                System.out.println("Чацьвер , Четвер , Czwartek  ");
                break;
            case 5:
                System.out.println("Пятніца , П’ятниця , Piątek  ");
                break;
            case 6:
                System.out.println("Субота , Субота , Sobota  ");
                break;
            case 7:
                System.out.println("Нядзеля , Неділя , Niedziela  ");
                break;
        }

    }
}
