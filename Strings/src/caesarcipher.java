import java.util.Scanner;

public class caesarcipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        StringBuilder build= new StringBuilder();
        for(int i=0;i<a.length();i++){
            int c1 = a.charAt(i)+3;
            char c=(char) c1;
            build.append(c);
        }
        System.out.println(build);
    }
}
