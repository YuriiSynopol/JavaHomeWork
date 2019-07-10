import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;


public class Fruit implements Serializable {
    private String name;
    private String color;

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public Fruit() {
    }

    public Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void input() {
        try {
            System.out.println("Enter name of fruit: ");
            setName(br.readLine());
            System.out.println("Enter color of fruit: ");
            setColor(br.readLine().toLowerCase());
            if (getName() == null)
                throw new NumberFormatException("This field empty or you entered digits, restart program and enter value!");

        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
            System.exit(0);

        }
    }

    public void print() {
        System.out.println(this);

    }

    @Override
    public String toString() {
        return "\nFruit name: " + name + ", Color: " + color;
    }

    //Serialized
    public static void output(ArrayList<Fruit> fruits) {
        try {
            FileOutputStream fos = new FileOutputStream("fruits.xml");
            XMLEncoder encoder = new XMLEncoder(fos);
            encoder.writeObject(fruits);
            encoder.close();
            fos.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    //De - Serialized
    public static void inputXml() {
        try (XMLDecoder xmlDecoder = new XMLDecoder(new FileInputStream("fruits.xml"))) {
            ArrayList<Fruit> fruits = (ArrayList<Fruit>) xmlDecoder.readObject();
            System.out.printf(fruits.toString());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static ArrayList<Fruit> getByColor(ArrayList<Fruit> fruits, String color) {

        ArrayList<Fruit> newFruits = new ArrayList<>();

        for (Fruit fruit : fruits) {
            if (fruit.getColor().equals(color.toLowerCase())) {
                newFruits.add(fruit);
            }

        }
        return newFruits;
    }
}