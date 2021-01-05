import java.util.Scanner;

public class centuriesToMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        long years = a*100;
        long days=(long)Math.floor(years*365.2422);
        long hours=days*24;
        long minutes=hours*60;
        System.out.printf("%d centuries = %d years = %d days = %d hours = %d minutes",a,years,days,hours,minutes);
    }
}
