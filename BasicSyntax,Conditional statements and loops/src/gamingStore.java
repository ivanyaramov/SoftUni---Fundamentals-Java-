import java.util.Scanner;

public class gamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        double price=0;
        double sum=0;
        while(true){
            String a = scanner.nextLine();
            if(a.equals("Game Time")){
                System.out.printf("Total spent: $%.2f. Remaining: $%.2f",sum,money);


                break;
            }
            else if(a.equals("OutFall 4")){
                price=39.99;
            }
            else if(a.equals("CS: OG")){
                price=15.99;
            }
            else if(a.equals("Zplinter Zell")){
                price=19.99;
            }
            else if(a.equals("Honored 2")){
                price=59.99;
            }
            else if(a.equals("RoverWatch")){
                price=29.99;
            }
            else if(a.equals("RoverWatch Origins Edition")){
                price=39.99;
            }
            else{
                System.out.println("Not Found");
                price=0;
                continue;
            }
            if(money<price){
                System.out.println("Too Expensive");
            }
            else{
                money=money-price;
                sum+=price;
                System.out.printf("Bought %s",a);
                System.out.println();
            }
            if(money==0){
                System.out.println("Out of money!");
                return;
            }

        }
    }
}
