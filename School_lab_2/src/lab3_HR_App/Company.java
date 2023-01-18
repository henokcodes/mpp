package lab3_HR_App;

import java.util.List;

public class Company {

    private String name;
    private double salary;

    private List<Department> departments;

    public Company(String name) {
        this.name = name;
    }

    public void addDepartments(Department department) {
        departments.add(department);
    }

    public void print(){

    }
    public double getSalary(){
        return salary;
    }
}
