package Assignment_3.Part2.Task_4;

public class CarConcern {
    private final String manufacturer = "Lamborghini";
    private final String model;
    private final int year;
    private final String color;

    public CarConcern(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public CarConcern(String model, int year) {
        this.model = model;
        this.year = year;
        this.color = "Unknown"; // Default value for color
    }

    public CarConcern(String model) {
        this.model = model;
        this.year = 0; // Default value for year
        this.color = "Unknown"; // Default value for color
    }
}
