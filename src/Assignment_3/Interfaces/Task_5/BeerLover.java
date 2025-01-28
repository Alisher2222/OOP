package Assignment_3.Interfaces.Task_5;

public class BeerLover implements Alcoholic {
    @Override
    public void askForMore(String message) {
        System.out.println("BeerLover asks: " + message);
    }

    @Override
    public void sayThankYou() {
        System.out.println("BeerLover says: Thank you!");
    }

    @Override
    public boolean isReadyToGoHome() {
        return READY_TO_GO_HOME;
    }
    @Override
    public void sleepOnTheFloor() {
        System.out.println("BeerLover is sleeping on the floor.");
    }
}
