package lab3_HR_App;

import java.util.ArrayList;
import java.util.List;

public class Position {

    private String title;
    private String description;

    private Position superior;
    private List<Position> inferiors;
    private  Employee employee;

    public Position(String title, String description) {
        this.title = title;
        this.description = description;
        inferiors = new ArrayList<>();
        if(title.equalsIgnoreCase("Director")){
            superior = this;
        }else {
          inferiors.add(this);
        }
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

    public List<Position> getInferiors() {
        return inferiors;
    }

    public double getSalary(){
        if(employee!=null)
      return employee.getSalary();
        else
            return 0;
    }

    public void printDownLine(){
        for (Position p : this.inferiors
        ) {
            System.out.println("\tTitle: "+ p.getTitle() + ", Description: "+ p.description);
        }
    }
    public void addSuperior(Position p){
        superior = p;
    }
    public void addInferior(Position p){
        inferiors.add(p);
    }

    public boolean isManager(){
        if(superior!=null)
        return this == superior;
        return false;
    }


}
