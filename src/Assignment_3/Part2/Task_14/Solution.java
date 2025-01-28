package Assignment_3.Part2.Task_14;

public class Solution {
    public static void showWeather(City city) {
        String cityName = city.getName();
        int temperature = city.getTemperature();
        System.out.println("In the city " + cityName + " today, the temperature is " + temperature);
    }

    public static void main(String[] args) {
        City city = new City("Dubai", 40);
        showWeather(city);
    }
}

