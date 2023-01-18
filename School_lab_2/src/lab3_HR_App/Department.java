package lab3_HR_App;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String name;
    private String location;
    private double salary;

    private List<Position> positions;

    public Department(String name, String location) {
        this.name = name;
        this.location = location;
        Position ceo = new Position("CEO","owner");
        Position manager = new Position("Manager","Reports to CEO");
        Position worker = new Position("Worker","Reports to Manager");
        positions.add(ceo);
        positions.add(manager);
        positions.add(worker);

    }

    public void print(){

    }
    public double getSalary(){
        return salary;
    }
}
