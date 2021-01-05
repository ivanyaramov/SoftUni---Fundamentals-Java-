import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class emojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex="([*]{2}|[:]{2})(?<emoji>[A-Z][a-z]{2,})(\\1)";
        String regex2="[0-9]";
        String a = scanner.nextLine();
        Pattern pattern2=Pattern.compile(regex2);
        Matcher matcher2=pattern2.matcher(a);
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(a);
        List<String> list=new ArrayList<>();
        int br=0;

        BigInteger cool = new BigInteger("1");
        while(matcher2.find()){
            cool= (BigInteger) cool.multiply(BigInteger.valueOf(Integer.parseInt(matcher2.group())));

        }

        System.out.print("Cool threshold: ");
        System.out.println(cool);

        while(matcher.find()){
br++;
int current=0;
for(int i=0;i<matcher.group("emoji").length();i++){
    current+=matcher.group("emoji").charAt(i);}

if(BigInteger.valueOf(current).compareTo(cool)>=1){
    list.add(matcher.group());

}




        }

        System.out.printf("%d emojis found in the text. The cool ones are:%n",br);
        for(String s1:list){
            System.out.println(s1);
        }


    }
}
