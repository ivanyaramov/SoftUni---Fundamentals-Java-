import java.util.Scanner;

public class orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        Calculator(product,quantity);

    }
    public static void Calculator(String product, int quantity){
        if(product.equals("water")){
            System.out.printf("%.2f",(double)quantity);
        }
        if(product.equals("coffee")){
            System.out.printf("%.2f",(double)quantity*1.5);
        }
        if(product.equals("coke")){
            System.out.printf("%.2f",(double)quantity*1.4);
        }
        if(product.equals("snacks")){
            System.out.printf("%.2f",(double)quantity*2);
        }
    }
}
