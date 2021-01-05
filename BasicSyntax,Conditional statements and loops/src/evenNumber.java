import java.util.Scanner;

public class evenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        while(a%2!=0){
            System.out.println("Please write an even number.");
             a = Integer.parseInt(scanner.nextLine());
        }
        System.out.print("The number is: ");
        System.out.println(Math.abs(a));

    }
}
