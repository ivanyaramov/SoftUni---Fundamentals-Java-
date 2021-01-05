import java.util.Scanner;

public class nxnMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        Matrix(a);
    }
    public static void Matrix(int a){
        for(int i=0;i<a;i++){
            for(int k=0;k<a;k++){
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}
