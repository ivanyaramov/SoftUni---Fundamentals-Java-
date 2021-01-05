import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String big = scanner.nextLine();
        while(true) {


            big=big.replace(a, "");
            if(big.indexOf(a)==-1){
                break;
            }
        }
        System.out.println(big);

    }
}
