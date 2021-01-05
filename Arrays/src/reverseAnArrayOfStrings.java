import java.util.Scanner;

public class reverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[] numbersstring= a.split(" ");
        for(int i=numbersstring.length-1;i>=0;i--){
            System.out.print(numbersstring[i]+" ");
        }
    }
}
