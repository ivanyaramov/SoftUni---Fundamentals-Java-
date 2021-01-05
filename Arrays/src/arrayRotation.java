import java.util.Scanner;

public class arrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        String[] arr=s.split(" ");
        String br="";
        for(int k=0;k<n;k++) {
            for (int i = 0; i < arr.length; i++) {
                if(i==0) {
                    br = arr[0];
                }
                if (i == arr.length - 1) {
                    arr[i] = br;
                }
                else {
                    arr[i] = arr[i + 1];
                }


            }
        }

        for(String numbers: arr){
            System.out.print(numbers+" ");
        }


    }
}
