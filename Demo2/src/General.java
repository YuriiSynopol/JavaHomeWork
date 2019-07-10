import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class General {


    public static void main(String[] args) throws IOException {

        ArrayList<Fruit> fruits = new ArrayList<>();

        fruits.add(new Fruit("Apple", "red"));
        fruits.add(new Fruit("Pineapple", "yellow"));
        fruits.add(new Fruit("Mango", "yellow"));
        fruits.add(new Fruit("Apple", "green"));
        fruits.add(new Fruit("Apricots", "orange"));


        Fruit fruit = new Fruit();
        Citrus citrus = new Citrus();


        fruit.input();
        fruit.print();
        System.out.println(" ");
        citrus.input();
        citrus.print();

        //Add fruit in collections Fruits
        fruits.add(fruit);
        fruits.add(citrus);

        //Serialized
        fruit.output(fruits);
        System.out.println("-------------------------------------------------------------------------------------------");

        System.out.println("De - Serialized");
        fruit.inputXml();
        System.out.println(" ");
        System.out.println("-------------------------------------------------------------------------------------------");

        System.out.println("\nSort fruit by name");

        SortFruit.sortFruitByName(fruits);
        for (Fruit f : fruits) {
            System.out.print(f.toString());
        }
        System.out.println(" ");
        System.out.println("-------------------------------------------------------------------------------------------");

        System.out.println("\nEnter fruit color which you want to find");
        String color = Fruit.br.readLine();
        List<Fruit> fruitsByColor = Fruit.getByColor(fruits, color);
        for (Fruit f : fruitsByColor) {
            f.print();
        }

    }


}





