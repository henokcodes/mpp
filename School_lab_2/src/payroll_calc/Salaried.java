package payroll_calc;

public class Salaried extends Employee{

    private double salary;

    public Salaried(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void calcGrossPay(DateRange dateRange) {

    }
}
