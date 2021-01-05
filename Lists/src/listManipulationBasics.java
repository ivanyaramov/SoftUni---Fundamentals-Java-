import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] numbersAsStrings = line.split(" ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbersAsStrings.length; i++) {
            list.add(Integer.parseInt(numbersAsStrings[i]));
        }
        String s = scanner.nextLine();
        while(!s.equals("end")){
            String[] arr=s.split(" ");
            if(arr[0].equals("Add")){
                list.add(Integer.parseInt(arr[1]));
            }
            if(arr[0].equals("Remove")){
                list.remove((Integer) Integer.parseInt(arr[1]));
            }
            if(arr[0].equals("RemoveAt")){
                list.remove(Integer.parseInt(arr[1]));
            }
            if(arr[0].equals("Insert")){
                list.add(Integer.parseInt(arr[2]),Integer.parseInt(arr[1]));
            }
            s = scanner.nextLine();
        }

        for(int numbers:list){
            System.out.print(numbers + " ");
        }

    }
}