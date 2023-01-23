package payroll_calc;

import java.util.Calendar;
import java.util.Date;

public class DateRange {
    private Calendar startDate;
    private Calendar endDate;

    public boolean isInRange(Date d){
    return false;
    }
   public static void getFirstDayOfTheMonth(Date dd){

   }
    public static void getLastDayOfTheMonth(Date d){

    }

    @Override
    public String toString() {
        return "DateRange{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
