import java.util.Scanner;

public class textFilter {
    public static String duljina(String a){
        String b="";
        for(int i=0;i<a.length();i++){
            b+="*";
        }

        return b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[] arr= a.split(", ");
        String text = scanner.nextLine();
        for(int i=0;i<arr.length;i++){
            text=text.replace(arr[i],duljina(arr[i]));
        }
        System.out.println(text);
    }
}
