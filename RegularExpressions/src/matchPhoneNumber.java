import java.util.Scanner;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class matchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex="\\+359(?<separator>[ -])2(\\1)[0-9]{3}(\\1)[0-9]{4}\\b";
        String a = scanner.nextLine();
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher= pattern.matcher(a);
        StringBuilder aaa=new StringBuilder();
        while(matcher.find()){
           aaa.append(matcher.group()+", ");

        }
        aaa.setLength(aaa.length()-2);
        System.out.println(aaa);
    }
}
