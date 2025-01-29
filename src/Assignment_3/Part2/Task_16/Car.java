package Assignment_3.Part2.Task_16;

public class Car {
    private String model;
    private int year;
    private String color;
    public void initialize(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }
    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }
}