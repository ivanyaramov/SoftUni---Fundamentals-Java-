import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] numbersAsStrings = line.split(" ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbersAsStrings.length; i++) {
            list.add(Integer.parseInt(numbersAsStrings[i]));
        }
        int capacity = Integer.parseInt(scanner.nextLine());
        String s = scanner.nextLine();
        while(!s.equals("end")){
            String []arr=s.split(" ");
            if(arr.length==1){
                int people = Integer.parseInt(arr[0]);
                for(int i=0;i<list.size();i++){
                    if(people+list.get(i)<=capacity){
                        int current=list.get(i);
                        list.set(i,current+people);
                        break;
                    }
                }

            }

            if(arr.length==2){
                list.add(Integer.parseInt(arr[1]));
            }


            s = scanner.nextLine();
        }
        for(int number:list){
            System.out.print(number+ " ");
        }

    }
}