import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class students {
    static class Students{
        String firstname;
        String lastname;
        int age;
        String hometown;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<Students> list= new ArrayList();
        while(!s.equals("end")){
            String[] arr=s.split(" ");
            Students info=new Students();
            info.firstname=arr[0];
            info.lastname=arr[1];
            info.age=Integer.parseInt(arr[2]);
            info.hometown=arr[3];
            list.add(info);
            s=scanner.nextLine();


        }
        String grad = scanner.nextLine();
        for(Students student : list){
            if(student.hometown.equals(grad)){
                System.out.printf("%s %s is %d years old",student.firstname,student.lastname,student.age);
                System.out.println();
            }

        }


    }
}
