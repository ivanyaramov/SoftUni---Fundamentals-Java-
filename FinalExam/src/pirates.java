import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pirates {
    public static class city{
        String name;
        int population;
        int gold;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<city> list=new ArrayList<>();

while(true){
    String a = scanner.nextLine();
    if(a.equals("Sail")){
        break;
    }
    String[] arr= a.split("\\|\\|");
    boolean bool=false;
    int index=-1;
    for(int i=0;i<list.size();i++){
        if(list.get(i).name.equals(arr[0])){
            bool=true;
            index=i;
            break;
        }
    }
    if(!bool) {
        city current = new city();
        current.name = arr[0];
        current.population = Integer.parseInt(arr[1]);
        current.gold = Integer.parseInt(arr[2]);
        list.add(current);
    }
    else{
        list.get(index).population+=Integer.parseInt(arr[1]);
        list.get(index).gold+=Integer.parseInt(arr[2]);
    }

}

while(true){
    String a = scanner.nextLine();
    if(a.equals("End")){
        break;
    }

    String[] arr=a.split("=>");
    if(arr[0].equals("Plunder")){
        System.out.printf("%s plundered! %s gold stolen, %s citizens killed.%n",arr[1],arr[3],arr[2]);
    for(int i=0;i<list.size();i++){
        if(list.get(i).name.equals(arr[1])){
            list.get(i).population-=Integer.parseInt(arr[2]);
            list.get(i).gold-=Integer.parseInt(arr[3]);
            if(list.get(i).gold==0 || list.get(i).population==0){
                System.out.print(arr[1]);
                System.out.println(" has been wiped off the map!");
                list.remove(i);
            }
            break;
        }
    }

    }


    if(arr[0].equals("Prosper")){
       int money=Integer.parseInt(arr[2]);
       if(money<0){
           System.out.println("Gold added cannot be a negative number!");
       }
       else{
           for(int i=0;i<list.size();i++){
               if(list.get(i).name.equals(arr[1])){
                   list.get(i).gold+=money;
                   System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n",money,arr[1],list.get(i).gold);
               break;
               }
           }
       }

    }




}

if(list.size()>0){
    System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n",list.size());
    list.stream()
            .sorted((p1,p2)-> p1.name.compareTo(p2.name))
            .sorted((p3,p4)->Integer.compare(p4.gold,p3.gold))
            .forEach(p-> System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n",p.name,p.population,p.gold) );

}


    }
}
