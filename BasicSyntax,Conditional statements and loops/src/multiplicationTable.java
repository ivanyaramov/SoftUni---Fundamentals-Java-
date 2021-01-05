import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b=0;
        for(int i=1;i<=10;i++){
            b=a*i;
            System.out.printf("%d X %d = %d",a,i,b);
            System.out.println();


        }
    }
}
