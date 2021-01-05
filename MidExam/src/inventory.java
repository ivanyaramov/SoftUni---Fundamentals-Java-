import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] numbersAsStrings = line.split(", ");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < numbersAsStrings.length; i++) {
            list.add(numbersAsStrings[i]);
        }

        while(true){
            String s = scanner.nextLine();
            if(s.equals("Craft!")){
                break;
            }
            String[] arr=s.split(" - ");
            if(arr[0].equals("Collect")){
                boolean bool=true;
                for(int i=0;i<list.size();i++){
                    if(list.get(i).equals(arr[1])){
                        bool=false;
                    }
                }
                if(bool){
                    list.add(arr[1]);
                }
            }


            if(arr[0].equals("Drop")){
            boolean bool=false;
            int c=-1;
                for(int i=0;i<list.size();i++) {
                    if (list.get(i).equals(arr[1])) {
                        bool = true;
                        c=i;
                    }
                }
                if(bool){
                    list.remove(c);
                }
            }



            if(arr[0].equals("Combine Items")){
                String[] arrcurrent=arr[1].split(":");
                boolean bool=false;
                int c=-1;
                for(int i=0;i<list.size();i++) {
                    if (list.get(i).equals(arrcurrent[0])) {
                        bool = true;
                        c=i;
                    }
                }
                if(bool){
                    list.add(c+1,arrcurrent[1]);
                }

            }


            if(arr[0].equals("Renew")){
                boolean bool=false;
                int c=-1;
                for(int i=0;i<list.size();i++) {
                    if (list.get(i).equals(arr[1])) {
                        bool = true;
                        c=i;
                    }
                }
                if(bool){
                    list.remove(c);
                    list.add(arr[1]);
                }
            }
        }

        for(int n=0;n<list.size();n++){
            System.out.print(list.get(n));
            if(n<list.size()-1){
                System.out.print(", ");
            }
        }
    }
}
