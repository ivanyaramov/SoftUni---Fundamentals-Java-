import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.list;

public class gaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] numbersAsStrings = line.split(" ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbersAsStrings.length; i++) {
            list.add(Integer.parseInt(numbersAsStrings[i]));
        }
        int size=list.size();
        for(int i=0;i<size/2;i++){
            int number=list.get(i);
            list.set(i,list.get(i)+list.get(list.size()-1));
            list.remove(list.size()-1);


        }

        for(int numbers: list){
            System.out.print(numbers+" ");
        }



    }


}