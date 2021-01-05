import java.util.Scanner;

public class triangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for(int i=1;i<=n;i++){
            for(int k=1;k<=i;k++){
                System.out.print(i+" ");

            }
            System.out.println();
        }
    }
}
