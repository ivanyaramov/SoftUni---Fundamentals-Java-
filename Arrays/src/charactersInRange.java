import java.util.Scanner;

public class charactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = scanner.nextLine().charAt(0);
        char b = scanner.nextLine().charAt(0);
        inRange(a, b);
    }

    static void inRange(char a, char b) {
        if (a < b) {
            for (int i = a + 1; i < b; i++) {
                char c = (char) i;
                System.out.print(c + " ");

            }
        } else {
            for (int i = b + 1; i < a; i++) {
                char c = (char) i;
                System.out.print(c + " ");

            }
        }
    }
}

