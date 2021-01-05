import java.util.Scanner;

public class topIntegeres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[] arrstring=a.split(" ");
        int[]arr=new int[arrstring.length];
        int max=Integer.MIN_VALUE;
        int br=0;
        for(int i =0;i<arrstring.length;i++){
            arr[i]=Integer.parseInt(arrstring[i]);
        }
        for(int k=0;k<arrstring.length;k++) {
            for (int i = k+1; i < arrstring.length; i++) {
              max=arr[k];
              if(arr[i]>max){
                  max=arr[i];
              }
              if(arr[i]==max){
                  br++;
              }

            }
            if(arr[k]==max&&br==0&& k!=arr.length-1){
                System.out.print(arr[k]+" ");
            }
            br=0;
        }
        System.out.print(arr[arr.length-1]+" ");
    }
}
