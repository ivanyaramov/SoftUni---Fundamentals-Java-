import java.util.*;

public class addOccurences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        Map<String,Integer> map = new LinkedHashMap<>();

        for(int i=0;i<words.length;i++){
            String word=words[i].toLowerCase();
            if(map.get(word)==null){
                map.put(word,0);
            }
            map.put(word,map.get(word)+1);
        }
        List<String> odds=new ArrayList<>();
        for (Map.Entry<String, Integer> str : map.entrySet()) {
            if(str.getValue()%2==1){
                odds.add(str.getKey());
            }



        }

        System.out.print(String.join(", ",odds));


    }
}
