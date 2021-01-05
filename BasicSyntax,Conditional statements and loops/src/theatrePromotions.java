import java.util.Scanner;

public class theatrePromotions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int b = Integer.parseInt(scanner.nextLine());
        if(a.equals("Weekday")){
            if(b<=18 && b>=0){
                System.out.println("12$");
            }
            else if(b<=64 &&b>=0){
                System.out.println("18$");
            }
            else if(b<=122 && b>=0){
                System.out.println("12$");
            }
            else{
                System.out.println("Error!");
            }
        }
        else if(a.equals("Weekend")){
            if(b<=18 && b>=0){
                System.out.println("15$");
            }
            else if(b<=64 &&b>=0){
                System.out.println("20$");
            }
            else if(b<=122 && b>=0){
                System.out.println("15$");
            }
            else{
                System.out.println("Error!");
            }
        }

        else if(a.equals("Holiday")){
            if(b<=18 && b>=0){
                System.out.println("5$");
            }
            else if(b<=64 && b>=0){
                System.out.println("12$");
            }
            else if(b<=122 && b>=0){
                System.out.println("10$");
            }
            else{
                System.out.println("Error!");
            }
        }
    }
}
