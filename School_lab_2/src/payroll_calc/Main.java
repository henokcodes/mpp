package payroll_calc;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Employee hourly= new Hourly(123,10,30);
        Employee salaried = new Salaried(234,2000);
        Employee commissioned = new Commissioned(342,1500);

        ((Commissioned)commissioned).addOrders(new Order(12,LocalDate.of(2020,04,01), 23));
        ((Commissioned)commissioned).addOrders(new Order(2,LocalDate.of(2020,04,01), 51));

        hourly.addPaychecks(new Paycheck(LocalDate.of(2020,04,01), hourly));
        salaried.addPaychecks(new Paycheck(LocalDate.of(2020,04,01), salaried));
        commissioned.addPaychecks(new Paycheck( LocalDate.of(2020,04,01), commissioned));



        hourly.calcCompensation(04,2020);
        salaried.calcCompensation(04,2020);
        commissioned.calcCompensation(04,2020);

    }
}
