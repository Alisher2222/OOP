package Assignment_3.Interfaces.Task_10;

public class Subordinate implements Secretary{
    @Override
    public void use(Person person) {
        person.startToWork();
    }

    @Override
    public void startToWork() {
        System.out.println("Subordinate is starting to work.");
    }
}
