import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> map= new LinkedHashMap<>();
        while(true){
            String a = scanner.nextLine();
            if(a.equals("end")){
                break;

            }
            String[] arr=a.split(" : ");
            String course=arr[0];
            String name=arr[1];
            List<String> list =map.get(course);
            if(list==null){
                list =new ArrayList<>();
            }
            list.add(name);
            map.put(course,list);
        }
map.entrySet()
        .stream()
        .sorted((p1,p2) -> p2.getValue().size() -p1.getValue().size())
        .forEach(e-> {
            System.out.println(e.getKey()+": "+e.getValue().size());
            e.getValue()
                    .stream()
                    .sorted((f,s)-> f.compareTo(s))
                    .forEach(s-> System.out.println("-- " + s));
        });






    }
}
