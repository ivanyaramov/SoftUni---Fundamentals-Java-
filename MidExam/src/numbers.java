import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        int sum=0;
        String[] numbersAsStrings = line.split(" ");
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < numbersAsStrings.length; i++) {
            list.add(Integer.parseInt(numbersAsStrings[i]));
            sum+=Integer.parseInt(numbersAsStrings[i]);

        }
        double average=(double)sum/list.size();
        boolean bool=true;
        Collections.sort(list);

        while(true){
            if(!bool || list2.size()==5){
                break;
            }
            int c=0;
            int max=Integer.MIN_VALUE;
            for(int i=list.size()-1;i>=0;i--) {
                if (list.get(i) > max && list.get(i) > average) {
                    max = list.get(i);
                    c = i;
                    list2.add(max);
                    list.remove(c);
                    i--;
                    if(list2.size()==5){
                        break;
                    }
                }
            }
                if(max==Integer.MIN_VALUE){
                    bool=false;
                }



        }
        if(list2.size()==0){
            System.out.println("No");
        }
        else {
            Collections.sort(list2);
            for (int n = list2.size() - 1; n >= 0; n--) {
                System.out.print(list2.get(n) + " ");
            }
        }

    }
}
