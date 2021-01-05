import java.util.Scanner;

public class specialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum=0;
        int k=0;
        for(int i=1; i<=n;i++){
            k=i;
            while(k>0){
                sum=sum+k%10;
                k=k/10;

            }
if(sum==5 || sum==7 || sum==11){
    System.out.printf("%d -> True",i);
    System.out.println();

}
else{
    System.out.printf("%d -> False",i);
    System.out.println();
}
sum=0;
        }

    }
}
