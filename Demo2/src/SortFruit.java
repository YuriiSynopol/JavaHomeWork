import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortFruit implements Comparator<Fruit> {

    @Override
    public int compare(Fruit o1, Fruit o2) {
        return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
    }

    public static List<Fruit> sortFruitByName(List<Fruit> fruits) {
        Collections.sort(fruits, new SortFruit());
        return fruits;
    }

}
