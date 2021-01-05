import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class thePianist {
    public static class music{
        String piece;
        String composer;
        String key;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<music> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            String a = scanner.nextLine();
            String[] arr= a.split("\\|");
            music part= new music();
            part.piece=arr[0];
            part.composer=arr[1];
            part.key=arr[2];
            list.add(part);

        }


        while(true){
            String a = scanner.nextLine();
            if(a.equals("Stop")){
                break;
            }
            String[] arr= a.split("\\|");
            if(arr[0].equals("Add")){
                boolean bool=true;
                for(int i=0;i<list.size();i++){
                    if(arr[1].equals(list.get(i).piece)){
                        bool=false;
                        break;
                    }

                }
                if(bool){
                    music part= new music();
                    part.piece=arr[1];
                    part.composer=arr[2];
                    part.key=arr[3];
                    list.add(part);
                    System.out.printf("%s by %s in %s added to the collection!%n",part.piece,part.composer,part.key);
                }
                else{
                    System.out.printf("%s is already in the collection!%n",arr[1]);
                }
            }

            if(arr[0].equals("Remove")){
                boolean bool=true;
                int k=-1;
                for(int i=0;i<list.size();i++){
                    if(arr[1].equals(list.get(i).piece)){
                        bool=false;
                        k=i;
                        break;
                    }

                }
                if(!bool){

                    list.remove(k);
                    System.out.printf("Successfully removed %s!%n",arr[1]);
                }
                else{
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n",arr[1]);
                }
            }



            if(arr[0].equals("ChangeKey")){
                boolean bool=true;
                int k=-1;
                for(int i=0;i<list.size();i++){
                    if(arr[1].equals(list.get(i).piece)){
                        bool=false;
                        k=i;
                        break;
                    }

                }
                if(!bool){
                   list.get(k).key=arr[2];
                    System.out.printf("Changed the key of %s to %s!%n",arr[1],arr[2]);
                }
                else{
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n",arr[1]);
                }
            }

        }



        list.stream()
                .sorted((p1,p2)-> p1.composer.compareTo(p2.composer))
                .sorted((p3,p4)-> p3.piece.compareTo(p4.piece))
                .forEach(p -> System.out.printf("%s -> Composer: %s, Key: %s%n",p.piece,p.composer,p.key));

    }
}
