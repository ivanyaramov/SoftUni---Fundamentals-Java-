import java.util.*;

public class plantDiscovery {
    public static class Plant{
        String name;
        int rarity;
        double rating;
        int count;
       double average;


    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Plant>  list=new ArrayList<>();
        for(int i=0;i<n;i++){
            String a = scanner.nextLine();
            String[] arr = a.split("<->");
            Plant pl= new Plant();
            pl.name=arr[0];
            pl.rarity=Integer.parseInt(arr[1]);
            pl.rating=0.0;
            pl.count=0;
            pl.average=0.0;
            list.add(pl);




        }

        while(true){
            String a = scanner.nextLine();
            if(a.equals("Exhibition")){
                break;
            }

            String[] arr=a.split(": ");
            String[] komanda = arr[1].split(" - ");
            if(arr[0].equals("Rate")) {
                boolean bool=true;
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).name.equals(komanda[0])) {
                        list.get(i).rating += Double.parseDouble(komanda[1]);
                        list.get(i).count++;
                        list.get(i).average=list.get(i).rating/list.get(i).count;
                        bool=false;
                    }
                }
                if(bool){
                    System.out.println("error");
                }
            }
            else if(arr[0].equals("Update")){
                boolean bool=true;
               for(int i=0;i<list.size();i++){
                   if(list.get(i).name.equals(komanda[0])){
                       list.get(i).rarity=Integer.parseInt(komanda[1]);
                       bool=false;
                   }
               }
                if(bool){
                    System.out.println("error");
                }
            }
            else if(arr[0].equals("Reset")){
                boolean bool=true;
                for(int i=0;i<list.size();i++){
                    if(list.get(i).name.equals(komanda[0])){
                        list.get(i).rating=0;
                        list.get(i).count=0;
                        list.get(i).average=0;
                        bool=false;
                    }
                }
                if(bool){
                    System.out.println("error");
                }
            }
            else{
                System.out.println("error");
            }

        }
        System.out.println("Plants for the exhibition:");
        list.stream()
                .sorted((p1,p2)->   Double.compare(p2.average,p1.average))
                .sorted((p1,p2)->   Integer.compare(p2.rarity,p1.rarity))
                .forEach(p-> System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", p.name,p.rarity,p.average));


    }
}
