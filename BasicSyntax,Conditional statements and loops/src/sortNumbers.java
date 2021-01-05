import java.util.Scanner;

public class sortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int max=a;
        int min=a;
        int mid=0;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        if(b<min){
            min=b;
        }
        if(c<min){
            min=c;
        }
        if((a>=b && a<=c)||(a>=c&&a<=b)){
            mid=a;
        }
        else if((b>=a && b<=c)|| (b>=c && b<=a)){
            mid=b;
        }
        else{
            mid=c;
        }
        System.out.println(max);
        System.out.println(mid);
        System.out.println(min);

    }
}
