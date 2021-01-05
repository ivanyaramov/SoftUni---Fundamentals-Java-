import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class posledniqPurvi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.next());
        String[] arr=new String[size];
        List<String[]> list=new ArrayList<>();

        for(int i=0;i<size;i++){
            arr[i]=scanner.next();
        }
        Arrays.sort(arr);
        list.add(arr);
        int n = Integer.parseInt(scanner.next());
        for(int i=0;i<n;i++){
            int a1 = Integer.parseInt(scanner.next());
            int a2 = Integer.parseInt(scanner.next());


int cur=0;
            if(a1>list.size()-1){
                cur=a1-(list.size()-1);
            }
            for(int k=0;k<cur;k++){
                String[] arr2=new String[size];
                for(int y=0;y<size;y++){
                    String last= list.get(list.size()-1)[y];
                    arr2[y]=last.charAt(last.length()-1)+last.substring(0,last.length()-1);
                }
                Arrays.sort(arr2);
                list.add(arr2);

            }
for(int k=0;k<a2;k++){
    int b = Integer.parseInt(scanner.next());
    System.out.println(list.get(a1)[b-1]);
}
            System.out.println();

        }


    }
}
