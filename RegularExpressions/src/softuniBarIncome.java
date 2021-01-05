import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class softuniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total=0;


        //%[A-Z][a-z]+%<\w+>\|\d+\|\d+.\d+\$
        String regex="%(?<name>[A-Z][a-z]+)%[^(|$%.)]*<(?<product>\\w+)>[^(|$%.)]*\\|(?<count>\\d+)\\|[^(|$%.)]*?(?<price>\\d+(.\\d+)?)\\$";
        Pattern patter =Pattern.compile(regex);
        while (true){
            String a = scanner.nextLine();
            if(a.equals("end of shift")){
                break;
            }
            Matcher matcher= patter.matcher(a);
            if(matcher.find()){
                String name=matcher.group("name");
                String product=matcher.group("product");
                double aaa=Double.parseDouble(matcher.group("price"));
                double price=Integer.parseInt(matcher.group("count"))*Double.parseDouble(matcher.group("price"));
                total+=price;
                System.out.printf("%s: %s - %.2f%n",name,product,price);

            }





        }
        System.out.printf("Total income: %.2f",total);

    }
}
