package Assignment_3.Part2.Task_9;

public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }
    public boolean equals( Iphone i2){
        if(i2 == null) return false;
        if(this.model.equals(i2.model) && this.color.equals(i2.color) && this.price == i2.price) return true;
        return false;
    }
}