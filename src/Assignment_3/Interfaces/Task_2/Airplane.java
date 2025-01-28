package Assignment_3.Interfaces.Task_2;

public abstract class Airplane implements CanMove, CanFly{
    @Override
    public void fly() {
        System.out.println("The airplane is flying");
    }

    @Override
    public void move() {
        System.out.println("The airplane is moving");
    }
}
