import java.util.Scanner;

public class passed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double s = Double.parseDouble(scanner.nextLine());
        if(s>=3){
            System.out.println("Passed!");
        }
    }
}
