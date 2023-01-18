package schoolLab2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Department {
    private String dept;

    private Scanner scanner;
    private List<Person> persons;

    public Department(String dept) {
        this.dept = dept;
        persons = new ArrayList<>();
    }

    public void addPerson(Person per){
        persons.add(per);
    }

    public double getTotalSalary(){
        double totSalary = 0;
//        for (schoolLab2.Person per: persons
//             ) {
//            if(per instanceof schoolLab2.Faculty  ){
//                schoolLab2.Faculty fac = (schoolLab2.Faculty) per;
//                totSalary+=fac.getSalary();
//            }else if( per.getClass().getSimpleName().equals("schoolLab2.Staff") ){
//                schoolLab2.Staff fac = (schoolLab2.Staff) per;
//                totSalary+=fac.getSalary();
//            }else if( per.getClass().getSimpleName().equals("schoolLab2.StaffStudent") ){
//                schoolLab2.StaffStudent fac = (schoolLab2.StaffStudent) per;
//               totSalary+=fac.getSalary();
//           }
//        }
        for (Person per: persons
             ) {
            totSalary+= per.getSalary();
        }
    return totSalary;
    }
    public void showAllMembers(){
       persons.stream().forEach(System.out::println);
    }
    public void unitsPerFaculty(){

        for (Person p: persons
             ) {
            if(p.getClass().getSimpleName().equals("schoolLab2.Faculty")){
                Faculty faculty = (Faculty)p;
                faculty.getTotalUnits();
            }
        }
    }

    public void getStaffStud() {

    }



    public void facultyStudents() {
        List<Course> courses = new ArrayList<>();
        List<Student> students = new ArrayList<>();

        System.out.println("Enter schoolLab2.Faculty name");
        scanner = new Scanner(System.in);
        String name = scanner.nextLine();


        for (Person person: persons
             ) {
            if(person instanceof Faculty){
                Faculty faculty = (Faculty) person;
                if(name.equals(faculty.getName())){
                   courses = faculty.getCourses();
                }
            }
        }
//        System.out.println(courses.toString());


        for (Person person: persons
        ) {
            if(person instanceof Student){

                Student student = (Student) person;
                List<Course> studentCourses = student.courses();
                for (Course course: studentCourses
                     ) {
                    if(courses.contains(course)){
                        students.add(student);
//                        System.out.println(course.toString());
                    }
                }
            }
        }
        students.stream().forEach(System.out::println);

    }
}
