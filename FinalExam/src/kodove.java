import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class kodove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        Map<String,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<a;i++){
            String s = scanner.nextLine();
            int sum=0;
           for(int k=0;k<s.length();k++){
               int current=(int) s.charAt(k) - 96;
               sum+=current;
           }
           map.put(s,sum);
        }
        int min=99999;
        for (Map.Entry<String, Integer> str : map.entrySet()) {
            if(str.getValue()<min){
                min=str.getValue();
            }

        }
        for (Map.Entry<String, Integer> str : map.entrySet()) {
            if(str.getValue()==min){
                System.out.printf("%s %d",str.getKey(),str.getValue());
                break;
            }

        }


    }
}
