import java.util.Scanner;

public class primeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= Integer.parseInt(scanner.nextLine());
        for (int takoa = 2; takoa <= a; takoa++) {
            boolean takovalie = true;
            for (int cepitel = 2; cepitel < takoa; cepitel++) {
                if (takoa % cepitel == 0) {
                    takovalie = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", takoa, takovalie);
        }
    }
}
