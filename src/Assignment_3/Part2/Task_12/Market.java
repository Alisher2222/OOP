package Assignment_3.Part2.Task_12;

public class Market {
    private static boolean hasEggs = true;

    public static void main(String[] args) {
        boolean hasEggs = false;
        makePurchases(hasEggs);
    }

    public static void makePurchases(boolean hasEggs) {
        if (hasEggs) {
            System.out.println("Bought 10 loaves");
        } else {
            System.out.println("Bought 1 loaf");
        }
    }
}
