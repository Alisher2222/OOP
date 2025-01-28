package Assignment_3.Interfaces.Task_3;

public class Person implements CanRun, CanSwim{
    @Override
    public void run() {
        System.out.println("The person is running");
    }

    @Override
    public void swim() {
        System.out.println("The person is swimming");
    }
}
