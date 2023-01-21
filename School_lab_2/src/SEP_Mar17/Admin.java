package SEP_Mar17;

import java.util.List;

public class Admin {
    public static double computeUpdatedBalanceSum(List<Employee> list) {
        //implement
        double total = 0;
        for (Employee employee: list
             ) {
            total+= employee.computeUpdatedBalanceSum();
        }
        return total;
    }
}