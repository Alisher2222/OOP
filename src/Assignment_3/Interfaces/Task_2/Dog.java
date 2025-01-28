package Assignment_3.Interfaces.Task_2;

public class Dog implements CanEat, CanMove{
    @Override
    public void eat() {
        System.out.println("The dog is eating");
    }

    @Override
    public void move() {
        System.out.println("The dog is moving");
    }
}
