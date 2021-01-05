import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class fancyBarocodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        for(int i=0;i<a;i++) {
            String barcode = scanner.nextLine();

            String regex = "@#+[A-Z](?<number>([A-Za-z]|[0-9]){4,})[A-Z]@#+";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(barcode);
            if(!matcher.find()){
                System.out.println("Invalid barcode");
            }
            else{
                String pw="";
                String current=matcher.group("number");
                for(int k=0;k<current.length();k++){
                    if(Character.isDigit(current.charAt(k))){
                        pw+=current.charAt(k);
                    }
                }
                if(pw.equals("")){
                    pw="00";
                }
                System.out.printf("Product group: %s%n",pw);
            }

        }
    }
}
