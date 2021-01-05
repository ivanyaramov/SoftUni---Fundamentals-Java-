import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mergingLists {
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
        List<Integer> merged = new ArrayList<>();

        int br1=0;
        int br2=0;
        int i=0;
        while(i<list.size() || i<list2.size()){
            if(i<list.size()){
                merged.add(list.get(i));
            }
            if(i<list2.size()){
                merged.add(list2.get(i));
            }
            i++;

        }
        for(int number:merged){
            System.out.print(number + " ");
        }
    }


}
