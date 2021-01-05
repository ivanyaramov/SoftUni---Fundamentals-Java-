import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class nechetniChisla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.next());
        for(int i=0;i<t;i++){
            List<Integer> list=new ArrayList<>();
            int min=Integer.MAX_VALUE;
            int brchetni=0;
            int brnechetni=0;
            int n = Integer.parseInt(scanner.next());
            int m = Integer.parseInt(scanner.nextLine());
            for(int k=0;k<n;k++){
                int a = Integer.parseInt(scanner.next());
                if(a%2==0){
                    brchetni++;
                    list.add(a);
                }
                else{
                    if(a<min){
                        min=a;
                    }
                    brnechetni++;
                }
            }
            if(brnechetni==0){
                System.out.println(0);
            }
            else{
                for(int c:list){
                    if(min+c<=m){
                        brnechetni++;
                    }
                }
                System.out.println(brnechetni);
            }


        }
    }
}
