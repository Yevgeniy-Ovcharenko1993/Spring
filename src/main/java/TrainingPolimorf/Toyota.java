package TrainingPolimorf;

public class Toyota extends Car {
    public Toyota(String color, String weight) {
        super(color, weight);

    }
    @Override
    public void go() {
        System.out.println(color + weight);

        System.out.println("Driving....Toyota");
    }
}
