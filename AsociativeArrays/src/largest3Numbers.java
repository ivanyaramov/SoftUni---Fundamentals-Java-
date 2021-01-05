import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> banov= Arrays.stream(scanner.nextLine().split(" "))
                .map(n->Integer.parseInt(n))
                .sorted((a,b)->b.compareTo(a))
                .limit(3)
                .collect(Collectors.toList());



        for(int i=0;i<3;i++){
            System.out.print(banov.get(i)+" ");
        }
    }


    }

