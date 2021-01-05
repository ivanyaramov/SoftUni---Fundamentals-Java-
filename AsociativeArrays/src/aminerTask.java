import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class aminerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> map= new LinkedHashMap<>();
        while(true){
            String name = scanner.nextLine();
            if(name.equals("stop")){
                break;
            }
            int quantity = Integer.parseInt(scanner.nextLine());
            if(map.get(name)==null){
                map.put(name,0);
            }
            map.put(name,map.get(name)+quantity);


        }
        for (Map.Entry<String, Integer> str : map.entrySet()) {
            System.out.printf("%s -> %d",str.getKey(),str.getValue());
            System.out.println();

        }

    }
}
