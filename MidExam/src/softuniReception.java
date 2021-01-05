import java.util.Scanner;

public class softuniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int count = Integer.parseInt(scanner.nextLine());
        int people=a+b+c;
        int chasove=0;
        while(count>0) {
            chasove++;
            count -= people;
            if (chasove % 4 == 0) {
                chasove++;
            }

        }
            System.out.printf("Time needed: %dh.", chasove);


    }
}
