package lab3_HR_App;

import java.util.List;

public class Position {

    private String title;
    private String description;
    private double salary;

    private Position superior;
    private List<Position> lessTitle;

    public Position(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public void print(){

    }
    public double getSalary(){
        return salary;
    }
}
