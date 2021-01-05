import java.util.*;
import java.util.stream.Collectors;

public class race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[] arr= a.split(", ");
        Map<String,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],0);
        }
        while(true){
            String line = scanner.nextLine();
            if(line.equals("end of race")){
                break;
            }
            String name="";
            int sum=0;
            for(int i=0;i<line.length();i++){
                if(Character.isDigit(line.charAt(i))){
                    int current=Character.getNumericValue(line.charAt(i));
                    sum+=current;
                }
                if(Character.isLetter(line.charAt(i))){
                    name+=line.charAt(i);
                }
            }

            if(map.containsKey(name)){
                map.put(name,map.get(name)+sum);
            }




        }
List<String> list;
        list = map.entrySet()
                .stream().sorted((p1,p2)-> p2.getValue().compareTo(p1.getValue()))
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        int place=1;

        System.out.println("1st place: "+list.get(0));
        System.out.println("2nd place: "+list.get(1));
        System.out.println("3rd place: "+list.get(2));


    }
}
