import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> map1 = new LinkedHashMap<>();
        Map<String,Double> map2 = new LinkedHashMap<>();

        while(true){
            String s = scanner.nextLine();
            if(s.equals("buy")){
                break;
            }
            String[]arr=s.split(" ");
            String product= arr[0];
            double price=Double.parseDouble(arr[1]);
            int quantity=Integer.parseInt(arr[2]);
            if(map1.get(product)==null){
                map1.put(product,0);
            }
            if(map2.get(product)==null){
                map2.put(product,0.0);
            }
            map1.put(product,map1.get(product)+quantity);
            map2.put(product,price);



        }

        for (Map.Entry<String, Integer> str1 : map1.entrySet()) {
            for (Map.Entry<String, Double> str2 : map2.entrySet()) {
                if(str1.getKey().equals(str2.getKey())){
                    double price=str1.getValue()*str2.getValue();
                    System.out.printf("%s -> %.2f%n", str1.getKey(),price);
                }

            }

        }

    }
}
