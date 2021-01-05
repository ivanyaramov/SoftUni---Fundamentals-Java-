import java.util.Scanner;

public class condenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[] arrstring=a.split(" ");
        int[] arrint=new int[arrstring.length];
        for(int i=0;i<arrstring.length;i++){
            arrint[i]=Integer.parseInt(arrstring[i]);
        }

for(int k=arrint.length-1;k>0;k--) {
    for (int i = 0; i <= arrint.length - 2; i++) {


        arrint[i] = arrint[i] + arrint[i + 1];



    }

    arrint[k]=0;
}
            System.out.println(arrint[0]);


            }

        }



