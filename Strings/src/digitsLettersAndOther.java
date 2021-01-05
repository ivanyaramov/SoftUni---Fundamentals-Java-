import java.util.Scanner;

public class digitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String digits="";
        String letter="";

        StringBuilder build= new StringBuilder();
        build.append(a);
        for(int i=0;i<build.length();i++){
            if(Character.isDigit(build.charAt(i))){
                digits+=build.charAt(i);
               build=build.replace(i,i+1,"");
               i--;
            }

        }
        for(int i=0;i<build.length();i++){
            if(Character.isLetter(build.charAt(i))){
                letter+=build.charAt(i);
                build=build.replace(i,i+1,"");
                i--;
            }

        }
        System.out.println(digits);
        System.out.println(letter);
        System.out.println(build);

    }
}
