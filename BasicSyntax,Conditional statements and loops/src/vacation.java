import java.util.Scanner;

public class vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int group = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String den = scanner.nextLine();
        double cena=0;
        if(type.equals("Students")){
            if(den.equals("Friday")){
                cena=8.45;
            }
            else if(den.equals("Saturday")){
                cena=9.8;
            }
            else if(den.equals("Sunday")){
                cena=10.46;
            }
            if(group>=30){
                cena=0.85*cena;
            }
            System.out.printf("Total price: %.2f",group*cena);
        }
       else  if(type.equals("Business")){
            if(den.equals("Friday")){
                cena=10.9;
            }
            else if(den.equals("Saturday")){
                cena=15.6;
            }
            else if(den.equals("Sunday")){
                cena=16;
            }
            if(group>=100){
                System.out.printf("Total price: %.2f",(group-10)*cena);
            }
            else{
                System.out.printf("Total price: %.2f",group*cena);

            }
        }
        else if(type.equals("Regular")){
            if(den.equals("Friday")){
                cena=15;
            }
            else if(den.equals("Saturday")){
                cena=20;
            }
            else if(den.equals("Sunday")){
                cena=22.5;
            }
            if(group>=10 && group<=20){
                cena=0.95*cena;
            }
            System.out.printf("Total price: %.2f",group*cena);
        }
    }
}
