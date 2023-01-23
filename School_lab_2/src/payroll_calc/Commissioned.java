package payroll_calc;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee {
    private static final double commission = 0.07;
    private double baseSalary;

    private List<Order> orders;

    public Commissioned(int id, double baseSalary) {
        super.setEmpId(id);
        this.baseSalary = baseSalary;
        orders = new ArrayList<>();
    }

    public double getCommission() {
        return commission;
    }


    public void addOrders(Order order) {
        orders.add(order);
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double calcGrossPay(LocalDate dateRange) {
        double orderAmount = 0;
        System.out.println(orders);
        for (Order order: orders
             ) {
          orderAmount +=  order.getOrderAmount();
        }
        double salary = baseSalary + commission*orderAmount;

        System.out.println("Gross Payment is "+ salary);
        return salary;
    }
}
