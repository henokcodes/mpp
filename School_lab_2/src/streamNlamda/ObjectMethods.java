package streamNlamda;

import package_send.Customer;

import java.util.Objects;

//looseleaf
//race condition
public class ObjectMethods {
    String accNum;
    double balance;
    Customer c1;

    @Override
    public String toString(){
        return "( Account Number: " + accNum + " Balance: "+ balance + " Customer: " + c1.toString() +" )";
    }

    @Override
    public boolean equals(Object o){
        if(o == null || !(o instanceof ObjectMethods)){
            return  false;
        }
        ObjectMethods casted = (ObjectMethods) o;
        return accNum.equals(casted.accNum) && balance==casted.balance && c1.equals(casted.c1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accNum,balance,c1);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object object =  super.clone();
        ObjectMethods casted = (ObjectMethods) object;
        casted.c1 = (Customer) c1.clone();

    }
}
