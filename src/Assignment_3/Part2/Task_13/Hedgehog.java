package Assignment_3.Part2.Task_13;

public class Hedgehog {
    public void eat(Apple apple) {
        System.out.println("The apple has been eaten!");
    }

    public static void main(String[] args) {
        Apple apple = new Apple();

        Hedgehog hedgehog = new Hedgehog();

        hedgehog.eat(apple);
    }

    public static class Apple {
    }
}