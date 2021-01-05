import java.util.Scanner;

public class middleCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        midc(a);
    }
    static  void midc(String a){
        if(a.length()%2==1){
            System.out.println(a.charAt(a.length()/2));
        }
        else{
            System.out.print(a.charAt(a.length()/2-1));
            System.out.print(a.charAt(a.length()/2));
        }

    }
}
