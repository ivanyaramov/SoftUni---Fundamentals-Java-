import java.util.Scanner;

public class poundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double s = Double.parseDouble(scanner.nextLine());
        double dolar= s*1.31;
        System.out.printf("%.3f",dolar);
    }
}
