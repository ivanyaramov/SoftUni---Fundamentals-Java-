import java.util.Scanner;

public class sumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int br=0;
        for(int i=1;i<=2*n;i++){
            if(i%2!=0){
                System.out.println(i);
                br+=i;
            }
        }
        System.out.printf("Sum: %d",br);
    }
}
