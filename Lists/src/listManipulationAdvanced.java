import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listManipulationAdvanced {
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
            if(arr[0].equals("Contains")){
                boolean bool=false;
                for(int i=0;i<list.size();i++){
                    if(Integer.parseInt(arr[1])==list.get(i)){
                        bool=true;
                    }

                }
                if(bool){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No such number");
                }
            }
            if(arr[0].equals("Print") && arr[1].equals("even")){
                for(int i=0;i<list.size();i++){
                    if(list.get(i)%2==0){
                        System.out.print(list.get(i)+" ");
                    }

                }
                System.out.println();
            }

            if(arr[0].equals("Print") && arr[1].equals("odd")){
                for(int i=0;i<list.size();i++){
                    if(list.get(i)%2==1){
                        System.out.print(list.get(i)+" ");
                    }
                }
                System.out.println();
            }

            if(arr[0].equals("Get") && arr[1].equals("sum")){
                int sum=0;
                for(int i=0;i<list.size();i++){
                    sum+=list.get(i);
                }
                System.out.println(sum);
            }
            if(arr[0].equals("Filter")){
                if(arr[1].equals(">")){
                    for(int i=0;i<list.size();i++){
                        if(list.get(i)>Integer.parseInt(arr[2])){
                            System.out.print(list.get(i)+ " ");
                        }
                    }
                    System.out.println();
                }

                if(arr[1].equals(">=")){
                    for(int i=0;i<list.size();i++){
                        if(list.get(i)>=Integer.parseInt(arr[2])){
                            System.out.print(list.get(i)+ " ");
                        }
                    }
                    System.out.println();
                }

                if(arr[1].equals("<")){
                    for(int i=0;i<list.size();i++){
                        if(list.get(i)<Integer.parseInt(arr[2])){
                            System.out.print(list.get(i)+ " ");
                        }
                    }
                    System.out.println();
                }

                if(arr[1].equals("<=")){
                    for(int i=0;i<list.size();i++){
                        if(list.get(i)<=Integer.parseInt(arr[2])){
                            System.out.print(list.get(i)+ " ");
                        }
                    }
                    System.out.println();
                }


            }

            s = scanner.nextLine();
        }


    }
}