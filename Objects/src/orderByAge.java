import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class orderByAge {
    public static class Person{
        String name;
        String ID;
        int age;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> list=new ArrayList<>();
        List<Person> list2=new ArrayList<>();

        String s = scanner.nextLine();
        while(!s.equals("End")){

            String[] arr=s.split(" ");
            Person person=new Person();
            person.name=arr[0];
            person.ID =arr[1];
            person.age=Integer.parseInt(arr[2]);
            list.add(person);
            s=scanner.nextLine();
        }
        list.stream().sorted((p1,p2) -> Integer.compare(p1.age,p2.age))
                .forEach(person -> list2.add(person));

        for(Person person:list2){
            System.out.println(person.name+" with ID: "+person.ID+" is "+person.age+" years old.");
        }





    }
}
