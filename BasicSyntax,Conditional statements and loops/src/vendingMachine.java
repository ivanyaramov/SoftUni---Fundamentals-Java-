import java.util.Scanner;

public class vendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a=0;
        String b="";
        double sum=0;
        double nuts=2;
        double water=0.7;
        double crisps=1.5;
        double soda=0.8;
        double coke=1;
        while(true){
             b = scanner.nextLine();
             if(b.equals("Start")){
                 break;
             }
             a = Double.parseDouble(b);
             if(a!=0.1 && a!=0.2 && a!=0.5 && a!=1 && a!=2){
                 System.out.printf("Cannot accept %.2f",a);
                 System.out.println();
             }
             else{
                 sum=sum+a;
             }

        }
        String f="";
        while(true){
            f = scanner.nextLine();
            if(f.equals("End")){
                break;
            }
            boolean bool = false;
            if(f.equals("Nuts") || f.equals("Water") || f.equals("Crisps") || f.equals("Soda") || f.equals("Coke")){
                bool=true;
            }
            else{
                System.out.println("Invalid product");
            }
            if(f.equals("Nuts")){
                if(sum>=nuts) {
                    sum = sum - nuts;
                    System.out.println("Purchased Nuts");
                }
                else{
                    System.out.println("Sorry, not enough money");
                }
            }

            if(f.equals("Water")){
                if(sum>=water) {
                    sum = sum - water;
                    System.out.println("Purchased Water");
                }
                else{
                    System.out.println("Sorry, not enough money");
                }
            }

            if(f.equals("Crisps")){
                if(sum>=crisps) {
                    sum = sum - crisps;
                    System.out.println("Purchased Crisps");
                }
                else{
                    System.out.println("Sorry, not enough money");
                }
            }

            if(f.equals("Soda")){
                if(sum>=soda) {
                    sum = sum - soda;
                    System.out.println("Purchased Soda");
                }
                else{
                    System.out.println("Sorry, not enough money");
                }
            }

            if(f.equals("Coke")){
                if(sum>=coke) {
                    sum = sum - coke;
                    System.out.println("Purchased Coke");
                }
                else{
                    System.out.println("Sorry, not enough money");
                }
            }
        }
        System.out.printf("Change: %.2f",sum);

    }
}
