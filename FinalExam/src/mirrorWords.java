import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class mirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String regex="([#@])(?<w1>[A-Za-z]{3,})(\\1)(\\1)(?<w2>[A-Za-z]{3,})(\\1)";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(a);
        int br=0;
        List<String> list= new ArrayList<>();
        while(matcher.find()){
            br++;
            StringBuilder w1=new StringBuilder();
            StringBuilder w2= new StringBuilder();
            w1.append(matcher.group("w1"));
            w2.append(matcher.group("w2"));
            if(w1.reverse().toString().equals(w2.toString())){
                list.add(matcher.group("w1"));
                list.add(matcher.group("w2"));
            }


        }

        if(br==0){
            System.out.println("No word pairs found!");
        }
        else{
            System.out.printf("%d word pairs found!%n",br);
        }
        if(list.size()==0){
            System.out.println("No mirror words!");
        }
        else{
            System.out.println("The mirror words are:");
            for(int i=0;i<list.size();i+=2){
                System.out.printf("%s <=> %s",list.get(i),list.get(i+1));
                if(i!=list.size()-2){
                    System.out.print(", ");
                }
            }
        }
    }
}
