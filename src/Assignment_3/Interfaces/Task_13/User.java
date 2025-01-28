package Assignment_3.Interfaces.Task_13;

class User implements DBObject {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "The user's name is " + name + ", id = " + id;
    }

    @Override
    public DBObject initializeIdAndName(int id, String name) {
        this.id = id;
        this.name = name;
        return this;
    }
}