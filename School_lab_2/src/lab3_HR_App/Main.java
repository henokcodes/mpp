package lab3_HR_App;

public class Main {

    //STAR UML
    public static void main(String[] args) {
        Company company1 = new Company("MIU");

        Department csDepartment = new Department("CS","Verill Hall");
        Department financeDepartment = new Department("Finance","Mclaughen");
        company1.addDepartments(csDepartment);
        company1.addDepartments(financeDepartment);

    }
}
