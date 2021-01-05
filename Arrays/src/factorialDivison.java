import java.util.Scanner;

public class factorialDivison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        System.out.printf("%.2f",fac1(a)/fac2(b));
    }
    static  double fac1(int a){
        int fac=1;
        if(a==0){
            fac=1;
        }
        else {
            for (int i = 1; i <= a; i++) {
                fac *= i;

            }
        }
        return fac;
    }

    static  double fac2(int a){
        int fac=1;
        if(a==0){
            fac=1;
        }
        else {
            for (int i = 1; i <= a; i++) {
                fac *= i;

            }
        }
return fac;
    }
}
