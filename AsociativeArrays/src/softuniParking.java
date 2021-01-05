import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class softuniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,String> map= new LinkedHashMap<>();
        int a = Integer.parseInt(scanner.nextLine());
        for(int i=0;i<a;i++){
            String s = scanner.nextLine();
            String[] arr=s.split(" ");
            String command=arr[0];
            String name= arr[1];
            if(command.equals("register")){
                String plate=arr[2];
                if(map.get(name)==null){
                    map.put(name,plate);
                    System.out.printf("%s registered %s successfully%n",name,plate);
                }
                else{
                    System.out.printf("ERROR: already registered with plate number %s%n",plate);
                }

            }
            else{
                if(map.get(name)==null){
                    System.out.printf("ERROR: user %s not found%n",name);
                }
                else{
                    System.out.printf("%s unregistered successfully%n",name);
                    map.remove(name);
                }
            }


        }
        for (Map.Entry<String, String> str : map.entrySet()) {
            System.out.printf("%s => %s%n",str.getKey(),str.getValue());

        }

    }
}
