import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {


    public static void main(String[] args) throws IOException {
        List<Fruit> fruits = new ArrayList<>();

        fruits.add(new Fruit("Apple", "red"));
        fruits.add(new Fruit("Pineapple", "yellow"));
        fruits.add(new Fruit("Mango", "yellow"));

        Fruit fruit = new Fruit();
        Citrus citrus = new Citrus();


        fruit.input();
        fruit.print();
        citrus.input();
        citrus.print();

        fruits.add(fruit);
        fruits.add(citrus);

        //Serialized
        fruit.input(fruits);

        System.out.println("De - Serialized");
        fruit.output();
        System.out.println(" ");
        System.out.println("\nSort fruit by name");

        SortFruit.sortFruitByName(fruits);
        for (Fruit f : fruits) {
            System.out.print(f.toString());
        }

        System.out.println("\nEnter fruit color");
        String color = Fruit.br.readLine();
        List<Fruit> fruitsByColor = Fruit.getByColor(fruits, color);
        for (Fruit f : fruitsByColor) {
            f.print();
        }

    }

}
