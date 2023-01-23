package payroll_calc;

import java.time.LocalDate;

public class Hourly extends Employee {

    private double hourlyWage;
    private double hoursPerWeek;

    public Hourly(int id,double hourlyWage, double hoursPerWeek) {
        super.setEmpId(id);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;

    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public double getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(double hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public double calcGrossPay(LocalDate dateRange) {
//        for (Paycheck paycheck: getPaychecks()
//             ) {
//           paycheck.
//        }
        System.out.println("Gross Payment is "+ hourlyWage*hoursPerWeek*4);
    return hourlyWage*hoursPerWeek*4;

    }
}
