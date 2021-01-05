import java.util.Scanner;

public class decryptingMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        String f="";

        for (int i=0;i<n;i++){
            char c = scanner.next().charAt(0);
            c=(char)(a+c);
            f=f+c;


        }
        System.out.println(f);


    }
}
