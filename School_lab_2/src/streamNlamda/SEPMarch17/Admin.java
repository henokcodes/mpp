package streamNlamda.SEPMarch17;


import java.util.List;
import java.util.stream.Collectors;

public class Admin {
    public static List<Student> obtainHonorRoll(List<Student> list) {
        //implement

        return  list.stream().filter(student -> student.getMajor().equals(Majors.CS))
                .filter(s -> s.getGpa()>3.0)
                .collect(Collectors.toList());
    }
}
