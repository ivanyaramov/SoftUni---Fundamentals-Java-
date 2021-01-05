import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class heroesOfCodeAndLogic6 {
    public static class Hero{
String name;
int hp;
int mp;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Hero> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            String line = scanner.nextLine();
            String[] arr= line.split(" ");
            Hero hero=new Hero();
            hero.name=arr[0];
            hero.hp=Integer.parseInt(arr[1]);
            hero.mp=Integer.parseInt(arr[2]);
            list.add(hero);
        }

        while(true){
            String a = scanner.nextLine();
            if(a.equals("End")){
                break;
            }
            String[] arr= a.split(" - ");
            if(arr[0].equals("CastSpell")){
                String hname=arr[1];
                String spellname=arr[3];
                int mp=Integer.parseInt(arr[2]);

                for(int i=0;i<list.size();i++){
                    if(list.get(i).name.equals(hname)){
                        if(list.get(i).mp-mp>=0){
                            list.get(i).mp-=mp;
                            System.out.printf("%s has successfully cast %s and now has %d MP!%n",list.get(i).name,spellname,list.get(i).mp);
                        }
                        else{
                            System.out.printf("%s does not have enough MP to cast %s!%n",hname,spellname);
                        }
                    }
                }
            }


            if(arr[0].equals("TakeDamage")) {
                String hname = arr[1];
                String attacker = arr[3];
                int damage = Integer.parseInt(arr[2]);
                for(int i=0;i<list.size();i++){
                    if(list.get(i).name.equals(hname)){
                        if(list.get(i).hp-damage>0){
                            list.get(i).hp-=damage;
                            System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n",list.get(i).name,damage,attacker,list.get(i).hp);
                        }

                        else{
                            list.get(i).hp=0;
                            System.out.printf("%s has been killed by %s!%n",hname,attacker);
                        }
                    }


                }


            }

            if(arr[0].equals("Recharge")) {
                String hname = arr[1];
                int amount = Integer.parseInt(arr[2]);
            for(int i=0;i<list.size();i++){
                if(list.get(i).name.equals(hname)){
                    if(list.get(i).mp+amount<=200){
                        list.get(i).mp+=amount;
                        System.out.printf("%s recharged for %d MP!%n",hname,amount);
                    }
                    else{
                        int current=200-list.get(i).mp;
                        list.get(i).mp=200;
                        System.out.printf("%s recharged for %d MP!%n",hname,current);

                    }



                }
            }

            }



            if(arr[0].equals("Heal")) {
                String hname = arr[1];
                int amount = Integer.parseInt(arr[2]);
                for(int i=0;i<list.size();i++){
                    if(list.get(i).name.equals(hname)){
                        if(list.get(i).hp+amount<=100){
                            list.get(i).hp+=amount;
                            System.out.printf("%s healed for %d HP!%n",hname,amount);
                        }
                        else{
                            int current=100-list.get(i).hp;
                            list.get(i).hp=100;
                            System.out.printf("%s healed for %d HP!%n",hname,current);

                        }



                    }
                }

            }


        }


       list.stream()
       .filter(p->p.hp>0)
       .sorted((p1,p2) -> p1.name.compareTo(p2.name))
       .sorted((p3,p4)-> Integer.compare(p4.hp,p3.hp))
       .forEach(p5-> {
           System.out.println(p5.name);
           System.out.printf("HP: %d%n",p5.hp);
           System.out.printf("MP: %d%n",p5.mp);
       });


    }
}
