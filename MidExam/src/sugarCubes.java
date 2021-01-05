import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sugarCubes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] numbersAsStrings = line.split(" ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbersAsStrings.length; i++) {
            list.add(Integer.parseInt(numbersAsStrings[i]));
        }

        while(true){
            String s = scanner.nextLine();
            if(s.equals("Mort")){
                break;
            }
            String[] arr=s.split(" ");
            if(arr[0].equals("Add")){
                list.add(Integer.parseInt(arr[1]));
            }
            if(arr[0].equals("Remove")){
                for(int i=0;i<list.size();i++){
                    if(list.get(i)==Integer.parseInt(arr[1])){
                        list.remove(i);
                        break;
                    }
                }

            }

            if(arr[0].equals("Replace")){
                for(int i=0;i<list.size();i++){
                    if(list.get(i)==Integer.parseInt(arr[1])){
                        list.set(i,Integer.parseInt(arr[2]));
                        break;
                    }
                }

            }


            if(arr[0].equals("Collapse")){
                for(int i=0;i<list.size();i++){
                    if(list.get(i)<Integer.parseInt(arr[1])){
                        list.remove(i);
                        i--;
                    }
                }
            }

        }

        for(int n: list){
            System.out.print(n+" ");
        }
    }
}
