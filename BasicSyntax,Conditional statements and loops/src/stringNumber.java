import java.util.Scanner;

public class stringNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        String b = String.valueOf(a);
        int c=b.length();
        int max=1;
        int sum=0;
        for(int i=0;i<c;i++){
            char f=b.charAt(i);
            int g = Character.getNumericValue(f);
            for(int p=1; p<=g;p++){
                max=max*p;
            }
            sum+=max;
            max=1;

        }
        if(sum==a){
            System.out.println("yes");


        }
else{
            System.out.println("no");
        }
    }
}
