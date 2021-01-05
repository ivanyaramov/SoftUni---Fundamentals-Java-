import java.util.Scanner;

public class repeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println(repeat(a,b));
    }

    public static String repeat(String a,int b){
        String kraino="";
        for(int i=0;i<b;i++){
            kraino+=a;
        }
        return kraino;


    }
}
