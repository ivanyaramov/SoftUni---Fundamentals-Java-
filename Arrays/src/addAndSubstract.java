import java.util.Scanner;

public class addAndSubstract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        System.out.println(Substract(a,b,c));
    }
    static int Sum(int a,int b){
        int sum=a+b;
        return sum;
    }
    static int Substract(int a, int b,int c){
        int sub=Sum(a,b)-c;
        return sub;
    }
}
