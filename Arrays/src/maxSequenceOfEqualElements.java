import java.util.Scanner;

public class maxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[] arrstring=a.split(" ");
        int[]arr=new int[arrstring.length];
        int br1=0;
        int f=0;
        int max=0;
        for(int l=0;l<arrstring.length;l++){
            arr[l]=Integer.parseInt(arrstring[l]);
        }
        for(int i=0;i<arrstring.length;i++) {
            if (i < arrstring.length - 1) {
                if (arr[i] == arr[i + 1]) {
                    br1++;
                    if (br1 > max) {
                        f = arr[i];
                        max = br1;
                    }
                } else {
                    br1 = 0;
                }
            }
        }


for(int i=0;i<=max;i++){
    System.out.print(f+" ");
}
    }
}
