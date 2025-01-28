package Assignment_3.Part2.Task_7;

public class Programmer {
    private int salary;
    Programmer(int salary){
        this.salary = salary;
    }
    public void setSalary(int salary){
        if (salary > this.salary) this.salary = salary;
    }
    public int getSalary(){
        return this.salary;
    }
}
