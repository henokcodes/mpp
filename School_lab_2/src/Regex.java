import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) {

        // Regular expression for license plate number
        String regex = "^[A-Z]{2}[0-9]{4}[A-Z]{3}$";

        // Sample license plate number
        String licensePlate = "AB1834CDE";

        // Compile the regular expression
        Pattern pattern = Pattern.compile(regex);

        // Check if the license plate number matches the pattern
        Matcher matcher = pattern.matcher(licensePlate);
        if (matcher.matches()) {
            System.out.println("Valid license plate number");
        } else {
            System.out.println("Invalid license plate number");
        }
        String replacedString = licensePlate.replaceAll("8", "eight");
        System.out.println(replacedString);
    }
}
