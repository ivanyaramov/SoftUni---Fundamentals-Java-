import java.util.Scanner;

public class padawanEqipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lighsabers = Double.parseDouble(scanner.nextLine());
        double robes = Double.parseDouble(scanner.nextLine());
        double belts = Double.parseDouble(scanner.nextLine());
        double c=Math.ceil((students*1.1));
        int b=students/6;
        double obshto=c*lighsabers+students*robes+(students-b)*belts;
        if(money>=obshto){
            System.out.printf("The money is enough - it would cost %.2flv.",obshto);
        }
        else{
            System.out.printf("Ivan Cho will need %.2flv more.",obshto-money);
        }



    }
}
