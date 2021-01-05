import java.util.Scanner;

public class binaryDigitCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int b=a&1;
        int br=0;
        if(b==c){
           br++;
        }
        do{
            a=a>>1;
            if(a==0){
                break;
            }
            int d=a&1;
            if(d==c){
                br++;
            }
        }while(a!=0);
        System.out.println(br);
    }
}
