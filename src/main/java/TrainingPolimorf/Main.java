package TrainingPolimorf;

public class Main {
    public static void main(String[] args) {
        Car toyota = new Toyota("Red", "1000");
        toyota.go();
        Car chevrolet = new Chevrolet("Gray", "1500");
        chevrolet.go();
        Main main = new Main();
        main.goingCar(new Car("red", "10404"));
    }
    public void goingCar (Car car){
        car.go();
        System.out.println(car.getWeight() + car.getColor());
        System.out.println("it's working for Car ");
    }
}
