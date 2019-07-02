import java.io.IOException;
import java.io.Serializable;
import java.util.Objects;

public class Citrus extends Fruit implements Serializable {

    private int vitaminC;

    public Citrus() {
    }

    public Citrus(String name, String color, int vitaminC) {
        super(name, color);
        this.vitaminC = vitaminC;
    }

    public int getVitaminC() {

        return vitaminC;
    }

    public void setVitaminC(int vitaminC) {
        this.vitaminC = vitaminC;
    }

    @Override
    public Fruit input() throws IOException {
        super.input();
        System.out.println("Enter vitamin C ");
        setVitaminC(Integer.parseInt(br.readLine()));
        return new Fruit();

    }

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "\nCitrus name: " + getName() + ", Color: " + getColor() + ", Vitamin C: " + getVitaminC() + " mg";
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), vitaminC);
    }


}
