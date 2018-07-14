package TrainingPolimorf;

public class Chevrolet extends Car {
    public Chevrolet(String color, String weight) {
        super(color, weight);
    }
    @Override
    public void go() {
        System.out.println(color + weight);

        System.out.println("Driving...Chevrolet");
    }
}
