import java.util.Scanner;

public class topNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int sum=0, b=0,br=0;
        for(int i=1;i<=a;i++){
            b=i;
            while(b>0){
                int c=b%10;
                b=b/10;
                sum+=c;
                if(c%2==1){
                    br++;
                }
            }
            if(sum%8==0 && br>0){
                System.out.println(i);
            }
            br=0;
            sum=0;
        }

    }
}
