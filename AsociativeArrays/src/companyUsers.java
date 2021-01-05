import java.util.*;

public class companyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> map = new HashMap<>();
        while(true){
            String a = scanner.nextLine();
            if(a.equals("End")){
                break;
            }
            String[] arr=a.split(" -> ");
            String company=arr[0];
            String id=arr[1];
            List<String> list=map.get(company);
            if(list==null){
                list=new ArrayList<>();
            }
            boolean bool=true;
            for(String j: list){
                if(j.equals(id)){
                    bool=false;
                }
            }
            if(bool){
                list.add(id);
            }
            map.put(company,list);
        }
        map.entrySet()
                .stream()
                .sorted((p1,p2)-> p1.getKey().compareTo(p2.getKey()))
                .forEach(p3-> {System.out.println(p3.getKey());
                for(String j:p3.getValue()){
                    System.out.println("-- "+j);
                }});

    }
}
