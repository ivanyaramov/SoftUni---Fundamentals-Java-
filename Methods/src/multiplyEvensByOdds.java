import java.util.Scanner;

public class multiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        if(a<0){
            a=a*(-1);
        }
        System.out.println(sumOfEven(a)*sumOfOdd(a));

    }
    public static int sumOfEven(int a){
        int sum=0;
        while(a!=0){
            int chislo=a%10;
            if(chislo%2==0){
            sum+=chislo;}
            a=a/10;

        }
        return sum;
    }

    public static int sumOfOdd(int a){
        int sum=0;
        while(a!=0){
            int chislo=a%10;
            if(chislo%2==1){
                sum+=chislo;}
            a=a/10;

        }
        return sum;
    }
}
