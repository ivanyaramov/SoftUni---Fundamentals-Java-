import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class randomizeWords {
    static Random rand = new Random();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] numbersAsStrings = line.split(" ");

        for(int i=0;i<numbersAsStrings.length-1;i++) {
            String current = numbersAsStrings[i];
            boolean bool = true;
            int index = rand.nextInt(numbersAsStrings.length);
            for (int k = 0; k <=i; k++) {
                if (numbersAsStrings[k].equals(numbersAsStrings[index])) {
                    bool = false;

                }
            }
            if (!bool) {
                i--;

            } else {
                numbersAsStrings[i] = numbersAsStrings[index];
                numbersAsStrings[index] = current;
            }



        }
        for(String word: numbersAsStrings){
            System.out.println(word);
        }


    }
}

