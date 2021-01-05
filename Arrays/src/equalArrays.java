import java.util.Scanner;

public class equalArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        String[] arra =a.split(" ");
        String[] arrb = b.split(" ");
        int br = 0;
        int sum=0;
        for (int i = 0; i < arra.length; i++) {
            if (!arra[i].equals(arrb[i])) {
                br++;
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                break;

            }
        }
        if (br == 0) {
            System.out.print("Arrays are identical.");
            for (int i = 0; i < arra.length; i++) {
                int arr= Integer.parseInt(arra[i]);
                sum+=arr;
            }
            System.out.printf(" Sum: %d",sum);
        }
    }
}

