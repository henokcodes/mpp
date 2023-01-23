package payroll_calc;

import java.time.LocalDate;

public class Paycheck {

    private double grossPay;
    private final double fica = 0.23;
    private final double state = 0.05;
    private final double local = 0.01;
    private final double medicare = 0.03;
    private final double socialSecurity = 0.075;
    private LocalDate dateRange;

    private Employee employee;

    public Paycheck(LocalDate dateRange, Employee e) {
       if(e instanceof Hourly){
          grossPay =  ((Hourly)e).calcGrossPay(dateRange);
       }else  if(e instanceof Salaried){
           grossPay =  ((Salaried)e).calcGrossPay(dateRange);
       }
       if(e instanceof Commissioned){
            grossPay =  ((Commissioned)e).calcGrossPay(dateRange);
        }
        this.dateRange = dateRange;
        this.employee =e;
    }
    public LocalDate getDateRange() {
        return dateRange;
    }
    public void print(){
    getNetPay();

    }
    public void getNetPay(){
       double net =  grossPay - grossPay*fica - grossPay*state - grossPay*local - grossPay*medicare - grossPay*socialSecurity;
        System.out.println("Net Payment - " + net);
    }
}
