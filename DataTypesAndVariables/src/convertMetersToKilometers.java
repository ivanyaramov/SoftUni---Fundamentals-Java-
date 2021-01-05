import java.util.Scanner;

public class convertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        double b=a/1000.;
        System.out.printf("%.2f",b);
    }
}
