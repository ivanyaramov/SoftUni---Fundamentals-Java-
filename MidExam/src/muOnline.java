import java.util.Scanner;

public class muOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[] arrstring = a.split("\\|");
        int health=100;
        int br=0;
        int bitcoin=0;
        for(int i=0;i<arrstring.length;i++){
            br++;
            String[] arr= arrstring[i].split(" ");
            int amount=Integer.parseInt(arr[1]);
            if(arr[0].equals("potion")){

                int current=0;
                if(health+amount>100){
                    current=100-health;
                    health=100;

                }
                else{
                    current=amount;
                    health+=amount;
                }
                System.out.printf("You healed for %s hp.",current);
                System.out.println();
                System.out.printf("Current health: %d hp.",health);
                System.out.println();

            }

            else if(arr[0].equals("chest")){
                System.out.printf("You found %d bitcoins.",amount);
                System.out.println();
                bitcoin+=amount;
            }

            else{
                if(health-amount>0){
                    System.out.printf("You slayed %s.",arr[0]);
                    System.out.println();
                    health=health-amount;
                }
                else{
                    System.out.printf("You died! Killed by %s.",arr[0]);
                    System.out.println();
                    System.out.printf("Best room: %d",br);
                    System.out.println();
                    break;
                }

            }

            if(i==arrstring.length-1){
                System.out.println("You've made it!");
                System.out.printf("Bitcoins: %d",bitcoin);
                System.out.println();
                System.out.printf("Health: %d",health);
                System.out.println();
            }

        }

    }
}
