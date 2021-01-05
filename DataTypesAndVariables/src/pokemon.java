import java.util.Scanner;

public class pokemon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        int k=n;
        int br=0;
        while(n>=m){
            br++;
            n-=m;
            if(n*2==k){
            if(n>=y){
                n=n/y;
            }
            }

        }
        System.out.println(n);
        System.out.println(br);
    }
}
