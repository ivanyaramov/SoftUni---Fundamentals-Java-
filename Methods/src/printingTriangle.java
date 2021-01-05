import java.util.Scanner;

public class printingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        for(int i=1;i<=number;i++){
            printTop(i);
        }
        for(int i=number-1;i>0;i--){
            PrintBottom(i);
        }

    }
    static void printTop(int i){
        for(int k=1;k<=i;k++){
            System.out.print(k+" ");
        }
        System.out.println();

    }

    static void PrintBottom(int i){
        for(int k=1;k<=i;k++){
            System.out.print(k+" ");
        }
        System.out.println();
    }
}
