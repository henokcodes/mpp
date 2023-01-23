package payroll_calc;

import java.time.LocalDate;

public class Salaried extends Employee{

    private double salary;

    public Salaried(int id,double salary) {
        super.setEmpId(id);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double calcGrossPay(LocalDate dateRange) {
        System.out.println("Gross Payment is "+ salary);
        return salary;
    }
}
