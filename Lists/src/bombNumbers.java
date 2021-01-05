import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] numbersAsStrings = line.split(" ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbersAsStrings.length; i++) {
            list.add(Integer.parseInt(numbersAsStrings[i]));
        }
        String uslovie=scanner.nextLine();
        String[] uslovieAsStrings =uslovie.split(" ");
        int specialnumber = Integer.parseInt(uslovieAsStrings[0]);
        int power = Integer.parseInt(uslovieAsStrings[1]);
        for(int i=0;i<list.size();i++){
            if(list.get(i)== specialnumber){
                for(int k=i;k>=i-power;k--){
                    if(k<0){
                        break;
                    }
                    else{
                        list.set(k,0);
                    }
                }

                for(int k=i;k<=i+power;k++){
                    if(k>list.size()-1){
                        break;
                    }
                    else{
                        list.set(k,0);
                    }
                }
            }
        }
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);

        }
        System.out.println(sum);
    }
}