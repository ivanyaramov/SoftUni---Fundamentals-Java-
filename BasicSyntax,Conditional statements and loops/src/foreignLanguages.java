import java.util.Scanner;

public class foreignLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        if (a.equals("USA") || a.equals("England")) {
            System.out.println("English");
        }
        else if(a.equals("Mexico") || a.equals("Argentina") || a.equals("Spain")){
            System.out.println("Spanish");
        }
        else{
            System.out.println("unknown");
        }
    }
}
