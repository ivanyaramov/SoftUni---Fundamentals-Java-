import java.io.PrintStream;
import java.util.*;

public class wordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> map= new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for(int i=0;i<n;i++){
            String key = scanner.nextLine();
            String synonym = scanner.nextLine();
            List<String> list=map.get(key);

            if(list==null){
                list = new ArrayList<>();
            }
            map.put(key,list);
            list.add(synonym);


        }

        for (Map.Entry<String, List<String>> str : map.entrySet()) {
            System.out.printf("%s - ", str.getKey());
            System.out.println(String.join(", ",str.getValue()));


        }

    }
}
