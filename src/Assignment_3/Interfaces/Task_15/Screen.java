package Assignment_3.Interfaces.Task_15;

class Screen implements Updatable {
    @Override
    public void onSelect() {
        System.out.println("Screen has been selected.");
    }

    @Override
    public void refresh() {
        System.out.println("Screen has been refreshed.");
    }
}