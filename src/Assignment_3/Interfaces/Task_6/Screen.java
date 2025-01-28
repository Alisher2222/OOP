package Assignment_3.Interfaces.Task_6;

public class Screen implements Selectable, Updatable{
    @Override
    public void onSelect() {
        System.out.println("Selected");
    }

    @Override
    public void refresh() {
        System.out.println("Refreshed");
    }
}
