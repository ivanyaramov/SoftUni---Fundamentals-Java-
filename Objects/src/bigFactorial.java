import java.math.BigInteger;
import java.util.Scanner;

public class bigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger fac=new BigInteger(String.valueOf(1));
        int a = Integer.parseInt(scanner.nextLine());

        for(int i=1;i<=a;i++){
            fac=fac.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fac);


    }
}
