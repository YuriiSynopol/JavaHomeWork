import java.io.IOException;
import java.io.Serializable;

public class Citrus extends Fruit implements Serializable {

    private double vitaminC;

    public Citrus() {
    }

    public Citrus(String name, String color, double vitaminC) {
        super(name, color);
        this.vitaminC = vitaminC;
    }

    public double getVitaminC() {

        return vitaminC;
    }

    public void setVitaminC(double vitaminC) {
        this.vitaminC = vitaminC;
    }

    @Override
    public void input() {

        try {
            super.input();
            System.out.println("Enter vitamin C in gram ");
            setVitaminC(Double.parseDouble(br.readLine()));
            if (vitaminC < 0) {
                throw new NumberFormatException("\nCitrus can't contain minus value...");
            }

        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
            System.err.println("Enter only digits, try again...");
            System.exit(0);
        }
    }


    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "\nCitrus name: " + getName() + ", Color: " + getColor() + ", Vitamin C: " + getVitaminC() + " mg";
    }


}
