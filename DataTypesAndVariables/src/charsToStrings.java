import java.util.Scanner;

public class charsToStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = scanner.next().charAt(0);
        char b = scanner.next().charAt(0);
        char c = scanner.next().charAt(0);
        System.out.printf("%c%c%c",a,b,c);


    }
}
