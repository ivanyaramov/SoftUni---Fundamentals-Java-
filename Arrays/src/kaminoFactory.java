import java.util.Scanner;

public class kaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int br = 0;
        int max=0;
        int simvol=0;
        int[] f = new int[20];
        while(true){
            String a = scanner.nextLine();
            if(a.equals("Clone them")){
                break;
            }
            String[] arrstring = a.split("!");
            int[] arr = new int[n];
            for (int l = 0; l < arr.length; l++) {
                arr[l] = Integer.parseInt(arrstring[l]);
            }
            for (int k = 0; k < arr.length; k++) {
                if(arr[k]==1){
                    br++;
                }
                if(br>max){
                    max=br;
                }
                if(arr[k]==0){
                    br=0;
                }
                

            }

        }
    }
}
