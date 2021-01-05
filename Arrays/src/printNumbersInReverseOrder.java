import java.util.Scanner;

public class printNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int arr[] = new int[a];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(scanner.nextLine());
        }
        for(int k=arr.length-1;k>=0;k--){
            System.out.print(arr[k]+" ");
        }
    }
}
