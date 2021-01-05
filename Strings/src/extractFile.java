import java.util.Scanner;

public class extractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int last = a.lastIndexOf(".");
        int lastch=a.lastIndexOf("\\");
        String ext="";
        String name="";
        for(int i=last+1;i<a.length();i++){
            ext+=a.charAt(i);
        }
        for(int i=lastch+1;i<last;i++){
            name+=a.charAt(i);
        }
        System.out.printf("File name: %s%n",name);
        System.out.printf("File extension: %s%n",ext);
    }
}
