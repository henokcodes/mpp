package schoolLab2;

import java.time.LocalDate;


public class StaffStudent extends Student{
    private LocalDate firstCourseDate;
    private boolean firstCourse = true;
    private Staff staff;

    public StaffStudent(String name, String phoneNum, int age, double gpa, double salary) {
        super(name, phoneNum, age,gpa);
        staff = new Staff(name, phoneNum,age,salary );
    }

    public LocalDate getFirstCourseDate(){
        return firstCourseDate;
    }

    @Override
    public void addCourse(Course course){
        if(firstCourse == true){
            firstCourseDate = LocalDate.now();
            firstCourse = false;
        }
        super.addCourse(course);
    }

    public double getSalary(){
        return staff.getSalary();
    }


}
