import java.util.Scanner;

public class sumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[] numbersstring= a.split(" ");
        int[] numbersint=new int[numbersstring.length];
        int sum=0;
        for(int i=0;i<numbersint.length;i++){
            numbersint[i]=Integer.parseInt(numbersstring[i]);
            if (numbersint[i]%2==0){
                sum+=numbersint[i];
            }

        }
        System.out.println(sum);
    }
}
