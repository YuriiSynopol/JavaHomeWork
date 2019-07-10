import org.testng.Assert;
import org.testng.annotations.Test;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;


public class FruitTest {

    @Test
    public void inputTest() {
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
    public void serialization() throws IOException {
        //Arrange
        ArrayList<Integer> expectedFruitsList = new ArrayList<>();
        ArrayList<Integer> actualFruitsList;
        expectedFruitsList.add(1);

        //Act

        FileOutputStream fos = new FileOutputStream("test.xml");
        XMLEncoder encoder = new XMLEncoder(fos);
        encoder.writeObject(expectedFruitsList);
        encoder.close();
        fos.close();


        XMLDecoder xmlDecoder = new XMLDecoder(new FileInputStream("test.xml"));
        actualFruitsList = (ArrayList<Integer>) xmlDecoder.readObject();


        //Assert
        Assert.assertEquals(expectedFruitsList, actualFruitsList);

    }

    @Test
    public void getFruitsByColorTest() {
        //Arrange
        ArrayList<Fruit> testList = new ArrayList<>();
        ArrayList<Fruit> actual = new ArrayList<>();
        ArrayList<Fruit> expected;
        ArrayList<String> expectedColor = new ArrayList<>();
        ArrayList<String> actualColor = new ArrayList<>();

        testList.add(new Fruit("apple", "green"));
        testList.add(new Fruit("pineapple", "yellow"));
        testList.add(new Fruit("pear", "orange"));
        testList.add(new Fruit("banan", "yellow"));
        testList.add(new Fruit("pear", "orange"));


        actual.add(new Fruit("pineapple", "yellow"));
        actual.add(new Fruit("banan", "yellow"));
        //Act
        expected = Fruit.getByColor(testList, "yellow");

        for (Fruit f : expected) {
            expectedColor.add(f.getColor());
        }
        for (Fruit f : actual) {
            actualColor.add(f.getColor());
        }
        //Assert
        Assert.assertEquals(expectedColor, (actualColor));
    }

    @Test
    public void sortFruitByNameTest() {
        ArrayList<String> expectedName = new ArrayList<>();
        ArrayList<String> actualName = new ArrayList<>();

        ArrayList<Fruit> fruits = new ArrayList<>();

        fruits.add(new Fruit("apple", "green"));
        fruits.add(new Fruit("mango", "red"));
        fruits.add(new Fruit("banana", "yellow"));


        ArrayList<Fruit> expected = new ArrayList<>();
        expected.add(new Fruit("apple", "green"));
        expected.add(new Fruit("banana", "yellow"));
        expected.add(new Fruit("mango", "red"));


        //Actual
        ArrayList<Fruit> actual = SortFruit.sortFruitByName(expected);

        for (Fruit f : expected) {
            expectedName.add(f.getName());
        }
        for (Fruit f : actual) {
            actualName.add(f.getName());
        }
        //Assert
        Assert.assertEquals(expected, actual);
    }

}



