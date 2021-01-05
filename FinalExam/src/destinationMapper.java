import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class destinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String reg= "([=/])(?<word>[A-Z][A-Za-z][a-z]+)(\\1)";
        Pattern pattern= Pattern.compile(reg);
        Matcher matcher= pattern.matcher(a);
        List<String> list = new ArrayList<>();
        while(matcher.find()){
            list.add(matcher.group("word"));
        }
        int sum=0;
        for(String s: list){
            sum+=s.length();
        }
        System.out.print("Destinations: ");
        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i));
            if(i!=list.size()-1){
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.print("Travel Points: ");
        System.out.println(sum);
    }
}
