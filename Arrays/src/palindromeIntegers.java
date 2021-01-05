import java.util.Scanner;

public class palindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String a = scanner.nextLine();
            if (a.equals("END")) {
                break;
            }
            if(a.equals(reverse(a))){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }

        }
    }



    static String reverse(String a){
        String reverse="";
        for(int i=a.length()-1;i>=0;i--){
            reverse+=a.charAt(i);
        }
        return reverse;
    }
}
