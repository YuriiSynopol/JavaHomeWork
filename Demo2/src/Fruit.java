import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    public Fruit input() throws IOException {
        System.out.println("Enter name of fruit: ");
        setName(br.readLine());
        System.out.println("Enter color of fruit: ");
        setColor(br.readLine().toLowerCase());
        return new Fruit();
    }

    public void print() {
        System.out.println(this);

    }

    @Override
    public String toString() {
        return "\nFruit name: " + name + ", Color: " + color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color);
    }

    //Serialized
    public void input(List<Fruit> fruits) throws IOException {
        FileOutputStream fos = new FileOutputStream("fruits.xml");
        XMLEncoder encoder = new XMLEncoder(fos);
        encoder.writeObject(fruits);
        encoder.close();
        fos.close();
    }

    //De - Serialized
    public void output() {
        try (XMLDecoder xmlDecoder = new XMLDecoder(new FileInputStream("fruits.xml"))) {
            List<Fruit> fruits = (List<Fruit>) xmlDecoder.readObject();
            System.out.printf(fruits.toString());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static List<Fruit> getByColor(List<Fruit> fruits, String color) {

        List<Fruit> newFruits = new ArrayList<>();

        for (Fruit fruit : fruits) {
            if (fruit.getColor().equals(color.toLowerCase())) {
                newFruits.add(fruit);
            }

        }
        return newFruits;
    }
}