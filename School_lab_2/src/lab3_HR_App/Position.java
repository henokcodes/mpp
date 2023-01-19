package lab3_HR_App;

import java.util.ArrayList;
import java.util.List;

public class Position {

    private String title;
    private String description;

//    private Position superior;
//    private List<Position> lessTitle;
    private  Employee employee;

    public Position(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public void print(){
        if(employee!=null)
       employee.print();

    }

    public String getTitle(){
        return title;
    }

    public void addEmployees(Employee e){
        employee = e;
    }

    public double getSalary(){
        return 3;
    }
}
