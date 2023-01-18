public class Staff extends Person{
    private double salary;

    public Staff(String name, String phoneNum, int age, double salary) {
        super(name, phoneNum, age);
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }
}
