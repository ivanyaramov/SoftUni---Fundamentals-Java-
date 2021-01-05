import java.util.Scanner;

public class longestSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr=new int[10];
        int max=0;
        int br=0;
        for(int i=0;i<10;i++){
            arr[i]=Integer.parseInt(scanner.nextLine());
        }
        for(int i=0;i<9;i++){
            if(arr[i]<arr[i+1]){
                br++;
                if(br>max){
                    max=br;
                }
            }
            else{
                br=0;
            }
        }
        System.out.println(max+1);

    }
}
