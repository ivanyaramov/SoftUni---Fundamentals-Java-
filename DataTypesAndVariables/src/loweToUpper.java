import java.util.Scanner;

public class loweToUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        if(c>64 && c<91){
            System.out.println("upper-case");
        }
        else if(c>=97 && c<=122){
            System.out.println("lower-case");
        }
    }
}
