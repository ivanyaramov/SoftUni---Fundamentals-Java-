import java.util.Scanner;

public class test131313 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        int d = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] =Integer.parseInt(scanner.nextLine());

        }
        double[] hello={1.3};
boolean bool=true;
        for(int k=0;k<10;k++) {
            for (int i = 1; i < 10; i++) {
                if (
                        arr[i] > arr[i - 1]
                ){
                    d = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = d;}


            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
