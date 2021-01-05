import java.util.Scanner;

public class divison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int max=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){

                if(i==2){
                    max=i;
                }
                if(i==3){
                    max=i;
                }
                if(i==6){
                    max=i;
                }
                if(i==7){
                   max=i;

                }
                if(i==10){
                   max=i;
                }
            }
        }


            if(max>0){
                System.out.printf("The number is divisible by %d",max);
            }
            else if(a==0){
                System.out.println("The number is divisible by 10");
            }

            else {
                System.out.println("Not divisible");
            }

    }
}
