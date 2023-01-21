package lab3_HR_App;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

        if(p.getTitle().equalsIgnoreCase("Director")){
            p.addSuperior(p);
        }else{
            p.addInferior(p);
        }
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
        double total = 0;
        for (Position position: positions
        ) {
           total+= position.getSalary();
        }
        return total;
    }

    public void printReportingHierarchy(){
        for (Position position: positions
             ) {
                position.printDownLine();
        }
    }

    public void getDepartmentHead(){
        for (Position p : positions
        ) {
            if(p.isManager()) {
                System.out.println("\tHead: " + p.getTitle());
            }
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;

        return positions.equals(that.positions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(positions);
    }
}
