package lab3_HR_App;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private String name;
//    private double salary;

    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        departments = new ArrayList<>();
    }

    public void addDepartments(Department department) {
        departments.add(department);
    }

    public void print(){
        for (Department deps: departments
             ) {
            System.out.println(deps.getName());
            deps.print();
        }
    }
    public void getSalary(){
        double totSalary = 0;
        for (Department department: departments
        ) {
          totSalary+= department.getSalary();
        }
        System.out.println("Total Salary = "+ totSalary);
    }

    public void printReportingHierarchy(){
        for (Department deps: departments
        ) {
            System.out.println(deps.getName());
            deps.getDepartmentHead();
            for (Position p: deps.getPositions()
                 ) {
                p.printDownLine();
            }

        }

    }

//    public Position getTopExecutive(){
//        for (Department deps: departments
//        ) {
//            if(deps.)
//        }
//    return null;
//    }
}
