package payroll_calc;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
    private int empId;
    private List<Paycheck> paychecks;

    public List<Paycheck> getPaychecks() {
        if ((paychecks!=null))
        return paychecks;
        return  null;
    }

    public void addPaychecks(Paycheck paycheck) {
        if(paychecks == null) paychecks = new ArrayList<>();
        this.paychecks.add(paycheck);
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void print(){

    }
    public Paycheck calcCompensation(int month, int year){
        Paycheck p = null;
        if(this instanceof Hourly){
            Hourly obj = (Hourly) this;

            for (Paycheck paycheck: obj.getPaychecks()){
                if(paycheck.getDateRange().getMonthValue()==month && paycheck.getDateRange().getYear()==year){
                    p = paycheck; break;
                }
            }
        }
        else if(this instanceof Salaried){
            Salaried obj = (Salaried) this;
            for (Paycheck paycheck: obj.getPaychecks()){
                if(paycheck.getDateRange().getMonthValue()==month && paycheck.getDateRange().getYear()==year){
                    p = paycheck; break;
                }
            }

        }
        else if(this instanceof Commissioned){
            Commissioned obj = (Commissioned) this;
            for (Paycheck paycheck: obj.getPaychecks()){
                if(paycheck.getDateRange().getMonthValue()==month && paycheck.getDateRange().getYear()==year){
                    p = paycheck; break;
                }
            }

        }

        p.print();
        return p;

    }

    public abstract double calcGrossPay(LocalDate dateRange);


}
