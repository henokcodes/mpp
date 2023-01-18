import java.util.List;

public class Person {

    private String name;
    private int age;
    private String phoneNum;

    public Person(String name, String phoneNum,int age) {
        this.name = name;
        this.age = age;
        this.phoneNum = phoneNum;
    }

    public void addCourse(Course c){
        if(this instanceof Faculty){
            Faculty fac = (Faculty) this;
            fac.addCourse(c);
        }
        if(this instanceof Student){
            Student stud = (Student) this;
            stud.addCourse(c);
        }
        if(this instanceof StaffStudent){
            StaffStudent stud = (StaffStudent) this;
            stud.addCourse(c);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNum() {
        return phoneNum;
    }


    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }



    @Override
    public String toString() {
        return " {name: "+ name + ", phone number: "+ phoneNum + ", age: "+ age + ", type: "+ this.getClass().getSimpleName() + "} ";
    }

    public double getSalary() {
        double totSalary =0;
        if(this instanceof Faculty  ){
                Faculty faculty = (Faculty) this;
                totSalary+=faculty.getSalary();
            }else if( this.getClass().getSimpleName().equals("Staff") ){
                Staff staff = (Staff) this;
                totSalary+=staff.getSalary();
            }else if( this.getClass().getSimpleName().equals("StaffStudent") ){
            StaffStudent staffStudent = (StaffStudent) this;
            totSalary+=staffStudent.getSalary();
        }
        return totSalary;
    }

    public void unitsPerFaculty(){
        if(this instanceof Faculty){
            Faculty fac = (Faculty) this;
            fac.getTotalUnits();
        }
    }
}
