import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sumAdjacentequalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.#");


        String line = scanner.nextLine();
        String[] numbersAsStrings=line.split(" ");
        List<Double> list= new ArrayList();
        for(int i=0;i<numbersAsStrings.length;i++){
            list.add(Double.parseDouble(numbersAsStrings[i]));
        }


        for(int i=0;i<list.size()-1;i++){
            if(list.get(i).equals(list.get(i+1))){
                double number=list.get(i);
                list.remove(i);
                list.set(i,number*2);
                i=-1;

            }
        }
        for(double number:list){

            System.out.print(df.format(number) + " ");
        }

    }
}
