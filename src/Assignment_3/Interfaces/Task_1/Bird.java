package Assignment_3.Interfaces.Task_1;

public class Bird implements CanFly {

    @Override
    public void fly() {
        System.out.println("The bird is flying");
    }

    @Override
    public void land() {
        System.out.println("The bird is landing");
    }
}
