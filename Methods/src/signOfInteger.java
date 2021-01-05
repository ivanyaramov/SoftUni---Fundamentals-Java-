

import java.util.Scanner;

public class signOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        System.out.printf("The number %d is ",a);
        System.out.println(Sign(a));

    }

    public static String Sign(int a){
        if(a>0){
            return "positive";
        }
        else if(a<0){
            return "negative.";
        }
        return "zero.";

    }
}
