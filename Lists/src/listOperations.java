import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] numbersAsStrings = line.split(" ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbersAsStrings.length; i++) {
            list.add(Integer.parseInt(numbersAsStrings[i]));
        }
        String s = scanner.nextLine();
        while (!s.equals("End")) {
            String[] arr = s.split(" ");
            if (arr[0].equals("Add")) {
                list.add(Integer.parseInt(arr[1]));
            }
            if (arr[0].equals("Insert")) {
                if(Integer.parseInt(arr[2])<=list.size()-1 && Integer.parseInt(arr[2])>=0) {
                    list.add(Integer.parseInt(arr[2]), Integer.parseInt(arr[1]));
                }
                else{
                    System.out.println("Invalid index");
                }
            }
            if (arr[0].equals("Remove")) {
                if(Integer.parseInt(arr[1])<=list.size()-1 && Integer.parseInt(arr[1])>=0) {
                    list.remove(Integer.parseInt(arr[1]));
                }
                else{
                    System.out.println("Invalid index");
                }
            }
            if (arr[1].equals("left")) {
                for (int i = 0; i < Integer.parseInt(arr[2]); i++) {
                    int current = list.get(0);
                    list.remove(0);
                    list.add(current);
                }
            }

            if (arr[1].equals("right")) {
                for (int i = 0; i < Integer.parseInt(arr[2]); i++) {
                    int current = list.get(list.size() - 1);
                    list.remove(list.size() - 1);
                    list.add(0, current);
                }
            }
            s=scanner.nextLine();
        }
        for(int numbers: list){
            System.out.print(numbers + " ");
        }

    }
}
