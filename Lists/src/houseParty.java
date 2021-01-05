import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class houseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            String[] arr = s.split(" ");
            if(arr.length==3) {
                boolean bool=true;
                for(int k=0;k<list.size();k++)
                {
                    if(arr[0].equals(list.get(k))){
                        bool=false;
                    }
                }
                if(bool) {
                    list.add(arr[0]);
                }
                else{
                    System.out.printf("%s is already in the list!",arr[0]);
                    System.out.println();
                }
            }

            if(arr.length==4){
                boolean bool=false;
                for(int k=0;k<list.size();k++)
                {
                    if(arr[0].equals(list.get(k))){
                        bool=true;
                    }
                }
                if(bool) {
                    list.remove((String)arr[0]);
                }
                else{
                    System.out.printf("%s is not in the list!",arr[0]);
                    System.out.println();
                }

            }
        }
        for (String names:list){
            System.out.println(names);
        }

    }
}

