import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class changeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] numbersAsStrings = line.split(" ");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < numbersAsStrings.length; i++) {
            list.add(numbersAsStrings[i]);
        }
        String s = scanner.nextLine();
        while (!s.equals("end")) {
            String[] arr = s.split("\\s+");
            if (arr[0].equals("Delete")) {
                for (int i = 0; i < list.size(); i++) {
                    if(list.remove((String) arr[1])){
                        i--;
                    }
                    list.remove((String) arr[1]);
                }
            }
            if (arr[0].equals("Insert")) {
                if (Integer.parseInt(arr[2]) >= 0 && Integer.parseInt(arr[2]) <= list.size() - 1) {
                    list.add(Integer.parseInt(arr[2]), arr[1]);
                }}
            s = scanner.nextLine();

        }
        for (String numbers : list) {
            System.out.print(numbers + " ");
        }
    }
}
