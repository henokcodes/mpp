package lab7Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Position {

    private String title;
    private String description;

    private Position superior;
    private List<Position> inferiors;
    private Employee employee;

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
        if(this.inferiors.contains(this)){
            System.out.println("\t\tTitle: "+ this.getTitle() + ", Description: "+ this.description);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return title.equals(position.title) && description.equals(position.description) && Objects.equals(superior, position.superior) && Objects.equals(inferiors, position.inferiors) && employee.equals(position.employee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, superior, inferiors, employee);
    }

    @Override
    public String toString() {
        return "Position{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", superior=" + superior +
                ", inferiors=" + inferiors +
                ", employee=" + employee +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Position cloned = (Position) super.clone();
        cloned.employee = this.employee;
        cloned.superior = this.superior;
        return cloned;
    }
}
