package Assignment_3.Interfaces.Task_7;

class Hobby implements Desire {
    static int INDEX = 1;

    @Override
    public String toString() {
        INDEX++;
        return "" + INDEX;
    }
}