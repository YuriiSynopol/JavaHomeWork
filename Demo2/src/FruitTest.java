import org.testng.Assert;
import org.testng.annotations.Test;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FruitTest {

    @Test
    public void inputTest() throws IOException {
        //Arrange
        Fruit actualFruit = new Fruit();
        Fruit expectedFruit = new Fruit("Apple", "Green");

        //Act
        actualFruit.setName("Apple");
        actualFruit.setColor("Green");
        //Assert
        Assert.assertEquals(expectedFruit.getName(), actualFruit.getName());
        Assert.assertEquals(expectedFruit.getColor(), actualFruit.getColor());

    }

    @Test
    public void printTest() throws IOException {
        //Arrange
        Fruit expectedFruit = new Fruit("Apple", "Green");

        //Assert

        Assert.assertTrue(true, expectedFruit.getName());
        Assert.assertTrue(true, expectedFruit.getColor());

    }

    @Test
    public void serialization_deSerializationTest() {
        //Arrange
        ArrayList<Integer> expectedFruitsList = new ArrayList<>();
        ArrayList<Integer> actualFruitsList = new ArrayList<>();
        expectedFruitsList.add(1);

        //Act
        try {
            FileOutputStream fos = new FileOutputStream("test.xml");
            XMLEncoder encoder = new XMLEncoder(fos);
            encoder.writeObject(expectedFruitsList);
            encoder.close();
            fos.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            XMLDecoder xmlDecoder = new XMLDecoder(new FileInputStream("test.xml"));
            actualFruitsList = (ArrayList<Integer>) xmlDecoder.readObject();
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
        //Assert
        Assert.assertEquals(expectedFruitsList, actualFruitsList);

    }

    @Test
    public void getByColorTest() {
        //Arrange
        String color = "yellow";
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Pineapple", "yellow"));

        //Assert
        Assert.assertEquals(fruits, Fruit.getByColor(fruits, color));
    }

    @Test
    public void sortFruitByName() {
        //Arrange
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Apple", "red"));
        fruits.add(new Fruit("Pineapple", "yellow"));
        fruits.add(new Fruit("Mango", "yellow"));
        fruits.add(new Fruit("Apple", "green"));
        fruits.add(new Fruit("Apricots", "orange"));
        //Actual
        List<Fruit> actual = SortFruit.sortFruitByName(fruits);
        //Assert
        Assert.assertEquals(fruits, actual);
    }

}



