import java.util.Scanner;

public class printAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int sum=0;
        for(int i=a;i<=b;i++){
            System.out.print(i+" ");
            sum+=i;
        }
        System.out.println();
        System.out.printf("Sum: %d",sum);
    }
}
