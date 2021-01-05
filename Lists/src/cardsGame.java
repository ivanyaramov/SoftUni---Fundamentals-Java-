import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class cardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] numbersAsStrings = line.split(" ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbersAsStrings.length; i++) {
            list.add(Integer.parseInt(numbersAsStrings[i]));
        }

        String line2 = scanner.nextLine();
        String[] numbersAsStrings2 = line2.split(" ");
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < numbersAsStrings2.length; i++) {
            list2.add(Integer.parseInt(numbersAsStrings2[i]));
        }
        int br1=0;
        int br2=0;
        while(true){
            if(list.size()==0 || list2.size()==0){
                break;
            }
            if(list.get(br1) > list2.get(br2)){
                int a=list.get(br1);
                int b=list2.get(br2);
                list2.remove(br2);
                list.remove(br1);
                list.add(a);
                list.add(b);
            }
            else if(list2.get(br2) > list.get(br1)){
                int a=list2.get(br2);
                int b=list.get(br1);
                list2.remove(br2);
                list.remove(br1);
                list2.add(a);
                list2.add(b);

            }
            else{
                list.remove(br1);
                list2.remove(br2);
            }



        }
        if(list2.size()==0){
            int sum=0;
            for(int i=0;i<list.size();i++){
                sum+=list.get(i);
            }
            System.out.printf("First player wins! Sum: %d",sum);
        }
        else{
            int sum=0;
            for(int i=0;i<list2.size();i++){
                sum+=list2.get(i);
            }
            System.out.printf("Second player wins! Sum: %d",sum);
        }


    }
}