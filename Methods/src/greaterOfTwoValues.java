import java.util.Scanner;

public class greaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        if(type.equals("int")){
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());
            System.out.println(integer(a,b));
        }
        else if(type.equals("char")){
            char a = scanner.next().charAt(0);
            char b = scanner.next().charAt(0);
            System.out.println(character(a,b));
        }
        else if(type.equals("string")){
            String a = scanner.nextLine();
            String b = scanner.nextLine();
            System.out.println(string(a,b));
        }
    }
    public static int integer(int a,int b){
        if(a>b){
            return a;

        }
       return b;


    }

    public static char character(char a,char b){
        if(a>b){
            return a;

        }
        return b;


    }
    public static String string(String a,String b){
        if(a.compareTo(b)>=0){
            return a;

        }
        return b;


    }


}
