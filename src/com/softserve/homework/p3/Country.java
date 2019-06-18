package com.softserve.homework.p3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Country {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Write your Country");
        String a = br.readLine();


        switch (a){
            case "Belgium": case "Germany": case "France":
                System.out.println(Continents.Europe);
                break;
            case "Japan": case "China": case "Indonesia":
                System.out.println(Continents.Asia);
                break;
            case "Canada": case "Mexico": case "USA":
                System.out.println(Continents.North_America);
                break;
            case "Argentina": case "Bolivia": case "Brazil":
                System.out.println(Continents.South_America);
                break;
            case "Ghana": case "Libya": case "Morocco":
                System.out.println(Continents.Africa);
                break;
        }



    }

}
