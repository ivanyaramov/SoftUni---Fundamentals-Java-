import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class countRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[] arr=a.split(" ");
        Map<String,Integer> count = new TreeMap<>();
        for(int i=0;i<arr.length;i++ ){
            if(count.get(arr[i])==null){
                count.put(arr[i],0);
            }

                count.put(arr[i],count.get(arr[i])+1);

        }

        for (Map.Entry<String, Integer> string : count.entrySet()) {
            System.out.printf("%s -> %d%n",string.getKey(),string.getValue());

        }


    }
}
