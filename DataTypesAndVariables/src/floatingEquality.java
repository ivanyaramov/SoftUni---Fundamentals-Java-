import java.util.Scanner;

public class floatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c=0.000001;
        if(Math.abs(a-b)<c){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
