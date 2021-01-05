import java.util.Scanner;

public class concatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[] arr= a.split(" ");
        StringBuilder result = new StringBuilder();
        for(String word: arr){
            int count=word.length();
            for(int i=0;i<count;i++) {


                result.append(word);
            }
        }
        System.out.println(result);
    }
}
