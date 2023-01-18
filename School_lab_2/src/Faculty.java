import java.util.ArrayList;
import java.util.List;

public class Faculty extends Person{
    private double salary;
    private List<Course> courses;

    public Faculty(String name, String phoneNum, int age, int salary) {
        super(name, phoneNum, age);
        this.salary = salary;
        courses = new ArrayList<>();
    }

    public List<Course> getCourses(){
        return courses;
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public void getTotalUnits(){
        double totalUnits = 0;
        if(courses !=null) {
            for (Course course : courses) {
                totalUnits += course.getUnits();
            }
            System.out.println("{ Name: " + getName() + ", Total units: " + totalUnits + " }");
        }
        else {
            System.out.println("There are no courses available");
        }
    }

    public void getStudents() {

    }

//    public double unitsPerFaculty(){
//        double totUnits = 0;
//        for(Course course: courses
//             ) {
//            totUnits+= course.getUnits();
//        }
//        return totUnits;
//    }
}

