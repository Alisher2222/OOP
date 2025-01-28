package Assignment_3.Part2.Task_3;

public class Skyscraper {
    private int floorNumber;
    private String developer;
    Skyscraper(){
        this.floorNumber = 5;
        this.developer =  "JavaRushDevelopment";
        System.out.println("The skyscraper is built. The number of floors is " + this.floorNumber + "Developer - "+this.developer);
    }
    Skyscraper(int floorsCount, String developer){
        System.out.println("The skyscraper is built. The number of floors is " + floorsCount + "Developer - "+developer);
    }
}
