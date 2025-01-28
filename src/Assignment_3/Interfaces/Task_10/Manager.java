package Assignment_3.Interfaces.Task_10;

public class Manager implements Boss {
    @Override
    public void use(Person person) {
        person.startToWork();
    }

    @Override
    public void startToWork() {
        System.out.println("Manager is starting to work.");
    }

    @Override
    public boolean inspiresOthersToWork() {
        return true; // Managers inspire others to work
    }
}
