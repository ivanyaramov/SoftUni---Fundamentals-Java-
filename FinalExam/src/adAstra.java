import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class adAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String regex= "([#|])(?<name>[A-Za-z ]+)(\\1)(?<date>[0-9]{2}/[0-9]{2}/[0-9]{2})(\\1)(?<calories>[0-9][0-9]{0,3}|[1][0-9]{4})(\\1)";
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher=pattern.matcher(a);
        Pattern pattern2= Pattern.compile(regex);
        Matcher matcher2=pattern2.matcher(a);

        int cal=0;
        while(matcher2.find()){
            int current=Integer.parseInt(matcher2.group("calories"));
            cal+=current;

        }
        System.out.printf("You have food to last you for: %d days!%n",cal/2000);

        while(matcher.find()){
            int calories=Integer.parseInt(matcher.group("calories"));
            String name=matcher.group("name");
            String date=matcher.group("date");
            System.out.printf("Item: %s, Best before: %s, Nutrition: %d%n",name,date,calories);

        }
    }
}
