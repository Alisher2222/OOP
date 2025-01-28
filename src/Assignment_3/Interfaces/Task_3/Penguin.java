package Assignment_3.Interfaces.Task_3;

public class Penguin implements CanSwim, CanRun{
    @Override
    public void run() {
        System.out.println("Penguin is running");
    }

    @Override
    public void swim() {
        System.out.println("Penguin is swimming");
    }
}
