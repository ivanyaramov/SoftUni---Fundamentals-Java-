import java.util.Scanner;

public class commonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        String[] arra=a.split(" ");
        String[] arrb=b.split(" ");
        for(int i=0;i<arra.length;i++){
            for(int k=0;k<arrb.length;k++){
                if(arrb[k].equals(arra[i])){
                    System.out.print(arrb[k]+" ");
                }
            }
        }
    }
}
