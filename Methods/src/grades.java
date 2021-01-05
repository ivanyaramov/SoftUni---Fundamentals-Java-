import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());
        ocenka(grade);
    }
    static void ocenka(double grade){
        if(grade<3 && grade>=2){
            System.out.println("Fail");
        }
        else if(grade<3.50){
            System.out.println("Poor");
        }
        else if(grade<4.50){
            System.out.println("Good");
        }
        else if(grade<5.50){
            System.out.println("Very good");
        }
        else{
            System.out.println("Excellent");
        }
    }
}
