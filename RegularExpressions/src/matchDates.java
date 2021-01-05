import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class matchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex="(?<day>[0-9]{2})([-/.])(?<month>[A-Z][a-z]{2})(\\2)(?<year>[0-9]{4})";
        String a = scanner.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher=pattern.matcher(a);
        while(matcher.find()){
            String day=matcher.group("day");
            String month= matcher.group("month");
            String year=matcher.group("year");
            System.out.printf("Day: %s, Month: %s, Year: %s",day,month,year);
            System.out.println();
        }

    }
}
