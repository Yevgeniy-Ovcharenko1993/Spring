package TrainingPolimorf;

public class Car {
    String color;
    String weight;

    public Car(String color, String weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }


    public String getWeight() {
        return weight;
    }

    public void go() {
        System.out.println("Driving....");
    }
}
