package Assignment_3.Interfaces.Task_3;

public class Duck implements CanRun, CanSwim, CanFly{

    @Override
    public void canFly() {
        System.out.println("The duck is flying");
    }

    @Override
    public void run() {
        System.out.println("The duck is running");
    }

    @Override
    public void swim() {
        System.out.println("The duck is swimming");
    }
}
