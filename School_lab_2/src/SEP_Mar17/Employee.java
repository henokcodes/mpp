package SEP_Mar17;


import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;

    private List<Account> accounts;

    public Employee(String n){
        name = n;
        accounts = new ArrayList<>();
    }
    public double computeUpdatedBalanceSum() {
        //implement
        double total =0;
        for (Account account: accounts
             ) {
            total+=account.computeUpdatedBalance();
        }
        return total;
    }
    public void  addAccount(Account account){
        accounts.add(account);
    }
}