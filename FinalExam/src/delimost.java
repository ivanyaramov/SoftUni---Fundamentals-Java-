import java.math.BigDecimal;
import java.util.Scanner;

public class delimost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal dec = new BigDecimal(scanner.nextLine());
        for(int i=2;i<2001;i++){
            if(dec.remainder(BigDecimal.valueOf(i)).compareTo(BigDecimal.ZERO)==0){
                System.out.print(i);
                System.out.print(" ");
                System.out.println(dec.divide(BigDecimal.valueOf(i)));
            }
        }

    }
}
