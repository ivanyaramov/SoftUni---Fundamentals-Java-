import java.text.DecimalFormat;
import java.util.Scanner;

public class mathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        char c = scanner.nextLine().charAt(0);
        double b = Double.parseDouble(scanner.nextLine());
        if(c=='/'){
            System.out.println(new DecimalFormat("0.####").format(Result(a,b)));
        }
        else{
            System.out.println(Resultint((int)a,c,(int)b));
        }
    }
    public static double Result(double a, double b){
 return a/b;
    }
    public static int Resultint(int a,char operator, int b){
        if(operator=='*'){
            return a*b;
        }
        if(operator=='+'){
            return a+b;
        }
        if(operator=='-'){
            return a-b;
        }
        return 0;
    }
}
