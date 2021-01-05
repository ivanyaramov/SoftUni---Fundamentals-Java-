import java.util.Scanner;

public class bitPosition1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        a=a>>1;
        System.out.println(a&1);
    }
}
