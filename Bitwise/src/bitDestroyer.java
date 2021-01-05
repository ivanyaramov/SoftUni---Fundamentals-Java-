import java.util.Scanner;

public class bitDestroyer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int cur = 1;
        int a = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());
        cur=~(cur<<p);
        System.out.println(a&cur);



    }}
