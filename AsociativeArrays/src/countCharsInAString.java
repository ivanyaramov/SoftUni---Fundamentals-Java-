import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class countCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[] arr=a.split("");
        Map<String, Integer> map= new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!arr[i].equals(" ")) {
                if (map.get(arr[i]) == null) {
                    map.put(arr[i], 0);
                }
                map.put(arr[i], 1 + map.get(arr[i]));
            }
        }
        for (Map.Entry<String, Integer> str : map.entrySet()) {
            System.out.printf("%s -> %d",str.getKey(),str.getValue());
            System.out.println();

        }


    }
}
