import java.util.Scanner;

public class characterMultiplyer {
    public static int multiply(char a,char b){
        int c=a*b;
        return c;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[]arr=text.split(" ");
        String a=arr[0];
        String b=arr[1];
        int sum=0;
        int razlika=Math.abs(a.length()-b.length());
        if(a.length()>=b.length()) {
            for (int i = 0; i <b.length();i++){
                sum+=multiply(a.charAt(i),b.charAt(i));
            }
            for(int i=b.length();i<a.length();i++){
                sum+=a.charAt(i);
            }
        }
        else {
            for (int i = 0; i <a.length();i++){
                sum+=multiply(a.charAt(i),b.charAt(i));
            }
            for(int i=a.length();i<b.length();i++){
                sum+=b.charAt(i);
            }
        }
        System.out.println(sum);
    }
}
