package lab7Interface;

import java.util.Objects;

public class Employee {

    private int employeeId;
    private String firstName;
    private String middleInitial;
    private String lastName;
    private String birthDate;
    private String SSN;
    private double salary;



    public Employee(int employeeId, String firstName, String middleInitial, String lastName, String birthDate, String SSN, double salary, Position pos) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.SSN = SSN;
        this.salary = salary;

    }


    public void print(){
        System.out.println("{ Id: "+employeeId+" Full Name: "+ firstName+ middleInitial + lastName +" }");
    }

    public double getSalary(){
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeId == employee.employeeId && Double.compare(employee.salary, salary) == 0 && firstName.equals(employee.firstName) && middleInitial.equals(employee.middleInitial) && lastName.equals(employee.lastName) && birthDate.equals(employee.birthDate) && SSN.equals(employee.SSN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, firstName, middleInitial, lastName, birthDate, SSN, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", middleInitial='" + middleInitial + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", SSN='" + SSN + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employee cloned = (Employee)super.clone();
        return cloned;
    }
}
