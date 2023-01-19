package lab3_HR_App;

import java.util.ArrayList;

public class Main {

    //STAR UML
    public static void main(String[] args) {
        Company company1 = new Company("MIU");


        Department csDepartment = new Department("CS","Verill Hall");
        Department financeDepartment = new Department("Finance","Mclaughen");

        company1.addDepartments(csDepartment);
        company1.addDepartments(financeDepartment);

        Position ceo = new Position("CEO","owner");
        Position manager = new Position("Manager","Reports to CEO");
        Position worker = new Position("Worker","Reports to Manager");

        csDepartment.addPosition(ceo);
        csDepartment.addPosition(manager);
        csDepartment.addPosition(worker);

        Employee emp1 = new Employee(12,"Chandra",
                "M","Sras","12/12/2000","22345464",9865,ceo);
        Employee emp2 = new Employee(23,"John",
                "M","Doe","12/12/2000","22345464",9865,ceo);


        ceo.addEmployees(emp1);
        manager.addEmployees(emp2);


        company1.print();

        System.out.println("Salary of Employees: " + company1.getSalary());

    }
}
