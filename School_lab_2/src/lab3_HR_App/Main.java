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

        Position director = new Position("Director","Reports to CEO");
        Position manager = new Position("Manager","Reports to Director");
        Position worker = new Position("Worker","Reports to Manager");

        csDepartment.addPosition(manager);
        csDepartment.addPosition(director);
        csDepartment.addPosition(worker);

        financeDepartment.addPosition(manager);
        financeDepartment.addPosition(director);
        financeDepartment.addPosition(worker);

        Employee emp1 = new Employee(12,"Chandra",
                "M","Sras","12/12/2000","22345464",9865,director);
        Employee emp2 = new Employee(23,"John",
                "M","Doe","12/12/2000","22345464",9865,director);


        director.addEmployees(emp1);
        manager.addEmployees(emp2);


        company1.print();

        System.out.println("Salary of Employees: " );
        company1.getSalary();

    company1.printReportingHierarchy();
    }
}
