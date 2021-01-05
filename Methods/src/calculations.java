import java.util.Scanner;

public class calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        if(s.equals("add")) {
            add(a, b);
        }
        if(s.equals("multiply")) {
            multiply(a, b);
        }
        if(s.equals("divide")) {
            divide(a, b);
        }
        if(s.equals("substract")) {
            substract(a, b);
        }
        }

    static void substract(int a,int b){
        System.out.println(a-b);

    }
    static void add(int a,int b){
        System.out.println(a+b);
    }
    static void multiply(int a,int b){
        System.out.println(a*b);

    }
    static void divide(int a,int b){
        System.out.println(a/b);
    }
}
