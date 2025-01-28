package Assignment_3.Interfaces.Task_14;

class Hobby implements Dream {
    static int INDEX = 1;

    @Override
    public String toString() {
        INDEX++;
        return "" + INDEX;
    }
}