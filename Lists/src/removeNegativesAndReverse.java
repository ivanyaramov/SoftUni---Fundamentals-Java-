import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class removeNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] numbersAsStrings = line.split(" ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbersAsStrings.length; i++) {
            list.add(Integer.parseInt(numbersAsStrings[i]));
        }
        for(int i=0;i<list.size();i++){
            if(list.get(i)<0){
                list.remove(i);
                i--;
            }
        }
        Collections.reverse(list);
        if(list.size()==0){
            System.out.println("empty");
        }
        else {
            for (int number : list) {
                System.out.print(number + " ");
            }
        }
    }
}