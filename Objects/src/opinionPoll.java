import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class opinionPoll {
    public static class Person{
        String name;
        int age;
    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> list= new ArrayList();
        List<Person> unsortedlist= new ArrayList<>();
        int a = Integer.parseInt(scanner.nextLine());
        for(int i=0;i<a;i++){
            String s = scanner.nextLine();
            String[] arr=s.split(" ");
            Person person=new Person();
            person.name=arr[0];
            person.age=Integer.parseInt(arr[1]);
            list.add(person);

        }
        for(int k=0;k<list.size();k++){
            if(list.get(k).age<=30){
                list.remove(k);
                k--;

            }
        }
        list.stream().sorted((p1,p2) -> p1.name.compareTo(p2.name))
                .forEach(person -> unsortedlist.add(person));

        for(Person y : unsortedlist){
            System.out.print(y.name+" - "+y.age);
            System.out.println();
        }







    }
}
