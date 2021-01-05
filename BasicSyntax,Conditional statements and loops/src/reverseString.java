import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        for(int i=a.length()-1;i>=0;i--){
            char c=a.charAt(i);
            System.out.print(c);
        }
    }
}
