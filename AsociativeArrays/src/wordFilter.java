import java.util.Arrays;
import java.util.Scanner;

public class wordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[] arr = a.split(" ");
        Arrays.stream(arr)
                .filter(w -> w.length()%2==0)
                .forEach(w -> System.out.println(w));
    }
}