import java.util.Scanner;

public class zigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[]arr1=new String[n];
        String[]arr2=new String[n];
        for(int i=0;i<n;i++){
            String a = scanner.nextLine();
            String[]arr=a.split(" ");
            if(i%2==0){
                arr1[i]=arr[0];
                arr2[i]=arr[1];

            }
            else{
                arr1[i]=arr[1];
                arr2[i]=arr[0];
            }



        }

        for(String numbers1 : arr1){
            System.out.print(numbers1+" ");

        }
        System.out.println();
        for(String numbers2:arr2){
            System.out.print(numbers2+" ");
        }
    }
}
