package Assignment_3.Interfaces.Task_2;

public class Duck implements CanFly, CanMove, CanEat{
    @Override
    public void eat() {
        System.out.println("The duck is eating");
    }

    @Override
    public void fly() {
        System.out.println("The duck is flying");
    }

    @Override
    public void move() {
        System.out.println("The duck is moving");
    }
}
