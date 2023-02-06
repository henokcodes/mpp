package streamNlamda;

import java.util.ArrayList;
import java.util.List;

public class ExamData {
    private String studentName;
    private double testScore;

    public ExamData(String studentName, double testScore) {
        this.studentName = studentName;
        this.testScore = testScore;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getTestScore() {
        return testScore;
    }

    public void setTestScore(double testScore) {
        this.testScore = testScore;
    }

    public static void main(String[] args) {
        List<ExamData> data = new ArrayList<ExamData>();
        data.add(new ExamData("George", 91.3) );
        data.add(new ExamData("Tom", 88.9) );
        data.add(new ExamData("Rick", 80) );
        data.add(new ExamData("Harold", 90.8) );
        data.add(new ExamData("Ignatius", 60.9) );
        data.add(new ExamData("Anna", 77) );
        data.add(new ExamData("Susan", 87.3) );
        data.add(new ExamData("Phil", 99.1) );
        data.add(new ExamData("Alex", 84) );



    }


}
