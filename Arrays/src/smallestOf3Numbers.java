import java.util.Scanner;

public class smallestOf3Numbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        System.out.println(Smallestof3(a,b,c));
    }

    static int Smallestof3(int a,int b,int c){
        int min= Integer.MAX_VALUE;
        if(a<min){
            min=a;
        }
        if(b<min){
            min=b;

        }
        if(c<min){
            min=c;
        }
        return min;

    }

}
