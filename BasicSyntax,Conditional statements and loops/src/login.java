import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String c="";
        int duljina= a.length();
        for(int i=duljina-1;i>=0;i--){
            char f=a.charAt(i);
            c=c+f;
        }
        String b=" ";
        int br=0;
        while(true){
            b= scanner.nextLine();
            if(b.equals(c)){
                System.out.printf("User %s logged in.",a);
                break;
            }
            else {
                br++;
                if(br!=4) {
                    System.out.println("Incorrect password. Try again.");
                }
            }
            if(br==4){
                System.out.printf("User %s blocked!",a);
                break;
            }

        }

    }
}
