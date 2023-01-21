package package_send;

import java.util.Scanner;

public class Customer {


public void SendPackages() {
    Providers providers = new Providers();

    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter the number of packages you want to enter: ");
    String[] packages = new String[scanner.nextInt()];

    scanner.nextLine();


    for (int i = 0; i < packages.length; i++) {

        System.out.println("Enter package description");
        String packageDesc = scanner.nextLine();


        System.out.println("Enter package weight in pounds");
        double weight = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter package zone");
        String packageZone = scanner.nextLine();


        providers.addPackages(packageDesc, weight, packageZone, this);

    }
    for (Providers p : providers.providers
    ) {

        System.out.println(p.getDesc() + "  " + p.calculatePrice() + "  " + p.getClass().getSimpleName() + " ");
    }
}
}
