import java.util.Scanner;

public class multiplicationTable20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int b=0;
        if(c<=10) {
            for (int i = c; i <= 10; i++) {
                b = a * i;
                System.out.printf("%d X %d = %d", a, i, b);
                System.out.println();
            }
        }
        else{
                b = a * c;
                System.out.printf("%d X %d = %d", a, c, b);
                System.out.println();
            }


        }
    }

