import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class studentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Double> map1 = new LinkedHashMap<>();
        Map<String,Integer>map2=new LinkedHashMap<>();
        int a = Integer.parseInt(scanner.nextLine());
        for(int i=0;i<a;i++){
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            if(map1.get(name)==null){
                map1.put(name,0.0);
            }
            map1.put(name,map1.get(name)+grade);
            if(map2.get(name)==null){
                map2.put(name,0);
            }
            map2.put(name,map2.get(name)+1);
        }

        for (Map.Entry<String, Double> str1 : map1.entrySet()) {
            for (Map.Entry<String, Integer> str2 : map2.entrySet()) {
                if(str1.getKey().equals(str2.getKey())){
                    map1.put(str1.getKey(),str1.getValue()/str2.getValue());

                }
            }


        }
map1.entrySet()
        .stream()
        .filter(p4-> p4.getValue()>=4.5)
        .sorted((p2,p1)-> p1.getValue().compareTo(p2.getValue()))
        .forEach(p3 -> System.out.printf("%s -> %.2f%n",p3.getKey(),p3.getValue()));




    }
}
