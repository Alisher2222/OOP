package Assignment_3.Part2.Task_16;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.initialize("Tesla Model S", 2023, "Red");

        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Color: " + car.getColor());
    }
}