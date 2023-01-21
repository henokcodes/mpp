package package_send;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Customer c1 = new Customer();
        Customer c2 = new Student();
        Customer c3 = new Senior();

        c2.SendPackages();


//        Providers lowestPrice = providers.calcPrice();
//        System.out.println(lowestPrice.getDesc() + "  " + lowestPrice.calculatePrice() + "  " + lowestPrice.getClass().getSimpleName() );

    }
}
