package Assignment_3.Part2.Task_6;

public class Bugatti {
    private String color;
    private int year;
    private String body;
    Bugatti(String color, int year, String body){
        this.color = color;
        this.year = year;
        this.body = body;
    }

    public String getBody() {
        return body;
    }
    public void setBody(String body){
        this.body = body;
    }
}
