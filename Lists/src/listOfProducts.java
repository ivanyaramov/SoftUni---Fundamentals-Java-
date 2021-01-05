import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class listOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextLine());
        }
        Collections.sort(list);

        List<Integer> listint = new ArrayList<>();
        for(int i=0;i<n;i++){
            listint.add(i+1);
        }
        for(int k=0;k<n;k++) {
            System.out.println(listint.get(k)+"."+list.get(k));
        }


    }
}