import java.util.Scanner;

public class vowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        System.out.println(vowelsCount(a));
    }
    static int vowelsCount(String word){
        int br=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)=='a' || word.charAt(i)=='o' || word.charAt(i)=='u' || word.charAt(i)=='i' || word.charAt(i)=='e'||  word.charAt(i)=='A' || word.charAt(i)=='E' || word.charAt(i)=='I' || word.charAt(i)=='O' ||word.charAt(i)=='U'){
                br++;
            }
        }
        return br;
    }
}
