package schoolLab2;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
    private double gpa;
    private List<Course> courses;

    public Student(String name, String phoneNum, int age, double gpa) {
        super(name, phoneNum, age);
        this.gpa = gpa;
        courses = new ArrayList<>();
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    public List<Course> courses(){
        return courses;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void getTotalUnits(){

    }
}
