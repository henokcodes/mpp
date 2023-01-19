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
        positions = new ArrayList<>();

    }
    public void addPosition(Position p){
        positions.add(p);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public List<Position> getPositions() {
        return positions;
    }

    public void setPositions(List<Position> positions) {
        this.positions = positions;
    }

    public void print(){
        for (Position position: positions
             ) {
            System.out.println("Position: " + position.getTitle());
            position.print();
        }

    }
    public double getSalary(){
        return salary;
    }
}
