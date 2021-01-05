import java.util.Scanner;

public class printPartOfTheAsciiTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        for(char c=(char)a;c<=b;c++){
            System.out.print(c+" ");
        }
    }
}
