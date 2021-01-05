import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex=">>(?<name>[A-Za-z]+)<<(?<price>([0-9]+)|([0-9]+\\.[0-9]+))!(?<quantity>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);
        Map<String,Double> map=new LinkedHashMap<>();

        while(true){
            String a = scanner.nextLine();
            if(a.equals("Purchase")){
                break;
            }
            Matcher matcher=pattern.matcher(a);
            if(matcher.find()){
                String name=matcher.group("name");
                double price=Double.parseDouble(matcher.group("price"));
                int quantity=Integer.parseInt(matcher.group("quantity"));
                map.put(name,quantity*price);

            }


        }
        double sum=0;

            System.out.println("Bought furniture:");

        for (Map.Entry<String, Double> str : map.entrySet()) {
            System.out.println(str.getKey());
            sum+=str.getValue();

        }
        System.out.printf("Total money spend: %.2f",sum);

    }
}
