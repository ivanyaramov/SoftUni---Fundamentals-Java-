import java.text.DecimalFormat;
import java.util.Scanner;

public class mathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        int pow = Integer.parseInt(scanner.nextLine());
        System.out.println(new DecimalFormat("0.####").format(mathPower(a,pow)));
    }
    public static double mathPower(double a,int pow){
        double proizvedenie=1;
        for(int i=1;i<=pow;i++){
           proizvedenie*=a;
        }
        return proizvedenie;
    }
}
