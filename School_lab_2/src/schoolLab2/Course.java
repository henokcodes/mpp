package schoolLab2;

public class Course {
    private String number;
    private String title;
    private double units;
    private Person person;

    public Course(String number, String title, int units) {
        this.number = number;
        this.title = title;
        this.units = units;

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    @Override
    public String toString() {
        return "{ number: "+ number+", title: "+ title +", units: "+units+"}";
    }
}
